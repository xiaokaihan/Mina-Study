package com.palm.mina.common;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TradeTicker entity
 * 
 * @author Key.Xiao
 * 
 */
public class TradeTicker implements Serializable {

	private static final long serialVersionUID = -6865572436725066678L;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	private String date;
	private long stock_code;
	private long ticker_id;
	private float ask_price;
	private float bid_price;
	private String cancel_flag;
	private float price;
	private boolean sell;
	private String side;
	private long ticker_type;
	private Date ticker_time;
	private Date timestamp;
	private long volume;
	private double turnover;

	public TradeTicker() {
		// do nothing.
		this.date = sdf.format(new Date());
	}

	public TradeTicker(String date, long stock_code, long ticker_id, float ask_price, float bid_price,
			String cancel_flag, float price, boolean sell, String side, long ticker_type, long volume, double turnover,
			Date ticker_time, Date timestamp) {
		this.date = date;
		this.stock_code = stock_code;
		this.ticker_id = ticker_id;
		this.ask_price = ask_price;
		this.bid_price = bid_price;
		this.cancel_flag = cancel_flag;
		this.price = price;
		this.sell = sell;
		this.side = side;
		this.ticker_type = ticker_type;
		this.ticker_time = ticker_time;
		this.timestamp = timestamp;
		this.volume = volume;
		this.turnover = turnover;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public long getStock_code() {
		return stock_code;
	}

	public void setStock_code(long stock_code) {
		this.stock_code = stock_code;
	}

	public long getTicker_id() {
		return ticker_id;
	}

	public void setTicker_id(long ticker_id) {
		this.ticker_id = ticker_id;
	}

	public float getAsk_price() {
		return ask_price;
	}

	public void setAsk_price(float ask_price) {
		this.ask_price = ask_price;
	}

	public float getBid_price() {
		return bid_price;
	}

	public void setBid_price(float bid_price) {
		this.bid_price = bid_price;
	}

	public String getCancel_flag() {
		return cancel_flag;
	}

	public void setCancel_flag(String cancel_flag) {
		this.cancel_flag = cancel_flag;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isSell() {
		return sell;
	}

	public void setSell(boolean sell) {
		this.sell = sell;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public long getTicker_type() {
		return ticker_type;
	}

	public void setTicker_type(long ticker_type) {
		this.ticker_type = ticker_type;
	}

	public Date getTicker_time() {
		return ticker_time;
	}

	public void setTicker_time(Date ticker_time) {
		this.ticker_time = ticker_time;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public long getVolume() {
		return volume;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

}
