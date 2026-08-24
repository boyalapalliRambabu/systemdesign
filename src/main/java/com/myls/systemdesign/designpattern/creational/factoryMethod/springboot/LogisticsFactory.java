package com.myls.systemdesign.designpattern.creational.factoryMethod.springboot;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class LogisticsFactory {

	private final Map<String, LogisticsLatest> logisticMap;

	public LogisticsFactory(List<LogisticsLatest> list) {

		this.logisticMap = list.stream().collect(Collectors.toMap(LogisticsLatest::type, Function.identity()));
	}

	public LogisticsLatest getLogistic(String type) {

		LogisticsLatest logs = logisticMap.get(type);

		if (logs == null) {
			throw new IllegalArgumentException("Unsupported logistics type: " + type);
		}
		return logs;
	}
}
