package com.palm.mina.client;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

import com.palm.mina.common.TradeTicker;

/**
 * minaclient接收消息处理器
 * 
 * @author lottery
 * 
 */

public class MinaClientHandler extends IoHandlerAdapter {
	

	@Override
	public void exceptionCaught(IoSession session, Throwable cause)
			throws Exception {
		super.exceptionCaught(session, cause);
	}

	/**
	 * 客户端消息到达时
	 */
	@Override
	public void messageReceived(IoSession session, Object message)
			throws Exception {
		if (message instanceof TradeTicker) {
			TradeTicker ticker = (TradeTicker) message;
			
			System.out.println("Client : " + ticker.getDate());
		}
	}

	@Override
	public void messageSent(IoSession session, Object message) throws Exception {

	}

	@Override
	public void sessionClosed(IoSession session) throws Exception {
		System.out.println("client sessionClosed");
	}

	@Override
	public void sessionCreated(IoSession session) throws Exception {
		System.out.println("client sessionCreated");
	}

	@Override
	public void sessionIdle(IoSession session, IdleStatus status)
			throws Exception {
		System.out.println("client sessionIdle");
	}

	@Override
	public void sessionOpened(IoSession session) throws Exception {
		System.out.println("client sessionOpened");
	}

}
