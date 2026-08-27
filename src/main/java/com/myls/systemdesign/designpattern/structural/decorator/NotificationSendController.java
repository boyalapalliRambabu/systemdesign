package com.myls.systemdesign.designpattern.structural.decorator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationSendController {

	private final NotificationSender sender;

	public NotificationSendController(NotificationSender sender) {
		this.sender = sender;
	}

	@PostMapping
	public void send(@RequestBody NotificationRequest req) {
		sender.send(req.getRecipient(), req.getMessage());
	}

}
