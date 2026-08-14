package com.myls.systemdesign.designpattern.creational;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

	private static final AppConfig instace = new AppConfig();

	private final Properties properties;

	private AppConfig() {
		properties = loadFromClasspath("application.properties");
	}

	public static AppConfig getInstace() {
		return instace;
	}

	public String get(String key) {

		return properties.getProperty(key);
	}

	private Properties loadFromClasspath(String fileName) {

		Properties properties = new Properties();

		try (InputStream inputStream = AppConfig.class.getClassLoader().getResourceAsStream(fileName)) {

			if (inputStream == null) {
				throw new RuntimeException("File not found: " + fileName);
			}

			properties.load(inputStream);

			return properties;

		} catch (IOException e) {
			throw new RuntimeException("Failed to load properties", e);
		}
	}

}
