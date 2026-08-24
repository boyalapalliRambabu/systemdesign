package com.myls.systemdesign.designpattern.creational.builder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpRequestLatest {

	private String url;
	private String method;
	private Map<String, String> headers;
	private Map<String, String> queryParams;
	private String body;
	private int timeout;

	public static class Builder {
		private final String url;

		private String method = "GET";

		private Map<String, String> headers = new HashMap<>();

		private Map<String, String> queryParams = new HashMap<>();

		private String body;

		private int timeout = 30000;

		public Builder(String url) {

			if (url == null || url.trim().isEmpty()) {
				throw new IllegalArgumentException("URL cannot be null or empty");
			}

			this.url = url;
		}

		public Builder method(String method) {

			this.method = method;

			return this;
		}

		public Builder header(String key, String value) {
			this.headers.put(key, value);
			return this;
		}

		public Builder queryParam(String key, String value) {
			this.queryParams.put(key, value);

			return this;

		}

		public Builder body(String body) {
			this.body = body;
			return this;
		}

		public Builder timeout(int timeoutMillis) {

			this.timeout = timeoutMillis;

			return this;
		}
	}

}
