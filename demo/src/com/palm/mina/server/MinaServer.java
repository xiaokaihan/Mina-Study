package com.palm.mina.server;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.apache.mina.transport.socket.SocketAcceptor;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

/**
 * mina服务器
 * 
 * @author weixiang.qin
 * 
 */
public class MinaServer {
	/**
	 * 启动mina服务器 new TextLineCodecFactory()一行一行读取(/r/n)
	 * 
	 * @param factory
	 * @throws IOException
	 */
	public void startServer(ProtocolCodecFactory factory) throws IOException {
		// 非阻塞Server端Socket
		SocketAcceptor acceptor = new NioSocketAcceptor();
		// 创建接收数据的过滤器
		DefaultIoFilterChainBuilder chain = acceptor.getFilterChain();
		// 设定过滤器解析消息规则
		chain.addLast("myChain", new ProtocolCodecFilter(factory));
		// 设定服务器端消息处理器
		acceptor.setHandler(new MinaServerHandler());
		// 绑定端口
		acceptor.bind(new InetSocketAddress(8890));
		System.out.println("mina start success.");
	}

	public static void main(String[] args) throws IOException {
		new MinaServer().start();
	}

	private void start() throws IOException {
		this.startServer(new ObjectSerializationCodecFactory());
	}
}
