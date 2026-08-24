package com.myls.systemdesign.designpattern.creational.builder;

public class Main {

	public static void main(String[] args) {
		HttpRequest request = new HttpRequest("https://api.example.com/users", "POST", null, null,
				"{\"name\":\"Rambabu\"}", 5000);

		System.out.println(request);

//		System.out.println(new HttpRequestLatest().Builder("https://api.example.com"));
	}
}
