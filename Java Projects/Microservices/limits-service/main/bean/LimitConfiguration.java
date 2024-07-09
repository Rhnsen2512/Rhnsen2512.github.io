package com.rohan.microservices.limits_service.bean;

public class LimitConfiguration {
	private int maximum;
	private int minimum;
	
	public LimitConfiguration() {
		
	}
	
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}
	
}
