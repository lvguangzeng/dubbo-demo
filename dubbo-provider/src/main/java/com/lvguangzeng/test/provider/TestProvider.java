package com.lvguangzeng.test.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.lvguangzeng.api.test.ITestProvider;

@Service(version = "0.0.1", timeout = 500, retries = 3)
public class TestProvider implements ITestProvider {

	@Override
	public String sayHello() {
		return "Hello World!";
	}

}
