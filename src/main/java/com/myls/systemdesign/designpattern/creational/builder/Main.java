package com.myls.systemdesign.designpattern.creational.builder;

public class Main {

	public static void main(String[] args) {
		HttpRequest request = new HttpRequest("https://api.example.com/users", "POST", null, null,
				"{\"name\":\"Rambabu\"}", 5000);

		System.out.println(request);

//		System.out.println(new HttpRequestLatest().Builder("https://api.example.com"));

//		HttpRequestLatest request1 = new HttpRequestLatest.Builder("https://api.example.com/users").method("POST")
//				.header("Content-Type", "application/json").header("Authorization", "Bearer xyz")
//				.queryParam("page", "1").queryParam("size", "20").body("{\"name\":\"Rambabu\"}").timeout(5000).build();
	}
}
