package com.thinkpalm.lijo.messenger.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class MyResource {
	@GetMapping
	public String getIt() {
		return "Testinggggg";
	}
}
