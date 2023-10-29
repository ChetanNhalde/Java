package com.iacsd.core;

public enum ServicePlan {

	SILVER(1000),
	GOLD(2000),
	DIAMOND(5000),
	PLATINUM(10000);
	
	private int planAmount;
	
	ServicePlan(int planAmount) {
		this.planAmount = planAmount;
	}

	public int getPlanAmount() {
		return planAmount;
	}
	
	
}
