package com.lvguangzeng.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lvguangzeng.api.test.ITestProvider;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private ITestProvider testProvider;

	@GetMapping("/say")
	public String testSayHello() {
		return testProvider.sayHello();
	}

	@GetMapping("/status")
	public String getStatus() {
		return "OK";
	}

}
