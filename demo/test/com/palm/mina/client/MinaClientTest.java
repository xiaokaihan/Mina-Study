package com.palm.mina.client;

import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.palm.mina.common.TradeTicker;

public class MinaClientTest {
	private MinaClient minaClient;

	@Before
	public void setUp() throws Exception {
		// minaClient = new MinaClient(new TextLineCodecFactory());// 传输字符
		minaClient = new MinaClient(new ObjectSerializationCodecFactory());// 传输对象
	}

	@Test
	public void testStartClient() {
		//while (true) {
			// minaClient.send("client");
			TradeTicker userInfo = new TradeTicker();
			// userInfo.setUsername("arvin");
			// userInfo.setPassword("love");
			String str = "hello";
			minaClient.send(str);
		//}
	}

	@After
	public void tearDown() throws Exception {
	}

}
