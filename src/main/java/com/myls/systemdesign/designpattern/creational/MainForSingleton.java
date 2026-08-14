package com.myls.systemdesign.designpattern.creational;

public class MainForSingleton {

	public static void main(String[] args) {

		EagerSingleton s1 = EagerSingleton.getInstace();

		EagerSingleton s2 = EagerSingleton.getInstace();

		System.out.println(s1 == s2);

		AppConfig app = AppConfig.getInstace();

		System.out.println(app.get("name"));

		LazySingleton ls1 = LazySingleton.getInstance();

		LazySingleton ls2 = LazySingleton.getInstance();

		System.out.println(ls1 == ls2);
	}

}
