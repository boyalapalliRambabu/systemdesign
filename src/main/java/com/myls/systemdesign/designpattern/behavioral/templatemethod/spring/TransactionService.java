package com.myls.systemdesign.designpattern.behavioral.templatemethod.spring;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {
	private final Map<String, TransactionProcessor> processors;

	public TransactionService(List<TransactionProcessor> processorList) {

		this.processors = processorList.stream().collect(Collectors.toMap(
				processor -> processor.getClass().getSimpleName().replace("TransactionProcessor", "").toUpperCase(),
				Function.identity()));

	}

	public void process(String type, TransactionRequest request) {

		TransactionProcessor processor = processors.get(type);

		if (processor == null) {
			throw new IllegalArgumentException("Unsupported transaction type: " + type);
		}

		processor.process(request);
	}
}
