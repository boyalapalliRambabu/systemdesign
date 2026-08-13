package com.myls.systemdesign.solid.interfacesegregationprinciple;

import java.util.Optional;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private final UserCommandService commandService;
	private final UserQueryService queryService;

	public UserController(UserCommandService commandService, UserQueryService queryService) {

		this.commandService = commandService;
		this.queryService = queryService;
	}

	@PostMapping
	public String createUser(@RequestBody User user) {

		commandService.create(user);

		return "User created";
	}

	@GetMapping("/{id}")
	public Optional<User> getUser(@PathVariable Long id) {

		return queryService.findById(id);
	}

	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable Long id) {

		commandService.delete(id);

		return "User deleted";
	}
}
