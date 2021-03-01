package com.craterzone.forexservice.dto;

public class ExchangeValue {

	private String from;
	private String to;
	private int amount;
	private String convertedAmount;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getConvertedAmount() {
		return convertedAmount;
	}
	public void setConvertedAmount(String convertedAmount) {
		this.convertedAmount = convertedAmount;
	}
	@Override
	public String toString() {
		return "ExchangeValue [from=" + from + ", to=" + to + ", amount=" + amount + ", convertedAmount="
				+ convertedAmount + "]";
	}
}
