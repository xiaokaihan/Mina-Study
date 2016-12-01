package com.palm.mina.server;

import java.io.IOException;

import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MinaServerTest {
	private MinaServer minaServer;

	@Before
	public void setUp() throws Exception {
		minaServer = new MinaServer();
	}

	@Test
	public void testStartServer() throws IOException, InterruptedException {
//		minaServer.startServer(new TextLineCodecFactory());// 传输字符
		minaServer.startServer(new ObjectSerializationCodecFactory());// 传输对象
		Thread.sleep(100000000);
	}

	@After
	public void tearDown() throws Exception {
	}

}
