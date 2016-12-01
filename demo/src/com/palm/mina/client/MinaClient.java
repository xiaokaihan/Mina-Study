package com.palm.mina.client;

import java.net.InetSocketAddress;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

/**
 * mina客户端
 * 
 * @author weixiang.qin
 * 
 */
public class MinaClient {
	// private static final int TIME_OUT = 30000;
	private NioSocketConnector connector;

	public MinaClient(ProtocolCodecFactory factory) {
		connector = new NioSocketConnector();
		// 创建接收数据的过滤器
		DefaultIoFilterChainBuilder chain = connector.getFilterChain();
		// 设定过滤器解析消息规则
		chain.addLast("myChin", new ProtocolCodecFilter(factory));
		// 设定客户端消息处理器
		connector.setHandler(new MinaClientHandler());
		// 每隔30000毫秒去检查服务器是否超时
		connector.setConnectTimeoutCheckInterval(30000);
	}

	/**
	 * 
	 * @param factory
	 */
	public void send(Object obj) {
		// 连接到服务器
		ConnectFuture future = connector.connect(new InetSocketAddress("localhost", 8890));
		future.awaitUninterruptibly(60 * 1000);
		IoSession session = future.getSession();
		session.write(obj);
	}

	public static void main(String[] args) {
		new MinaClient(new ObjectSerializationCodecFactory()).start();
	}

	private void start() {
		String str = "Hello";
		this.send(str);
	}
}
