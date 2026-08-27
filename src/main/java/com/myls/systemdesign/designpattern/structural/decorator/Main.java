package com.myls.systemdesign.designpattern.structural.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

public class Main {

	public static void main(String[] args) throws IOException {

		NotificationSender sender = new EmailNotificationSender();

		sender = new LoggingNotificationDecorator(sender);
		sender = new MetricsNotificationDecorator(sender);
		sender = new RetryNotificationDecorator(sender);
		sender.send("rambabu.b@gmail.com", "Order shipped");

		InputStream str = new FileInputStream("C:\\Users\\Admin\\Downloads\\clarifytestdata.txt");
		System.out.println("Test data ");
		InputStream buffer = new BufferedInputStream(str);

		InputStream zipped = new ZipInputStream(buffer);

		byte[] data = zipped.readAllBytes();

		System.out.println(data);

	}
}
