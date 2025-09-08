package com.springcore.springcore.ci;

public class ConInjection {
	private int id;
	private String sName;
	
	public ConInjection(int id, String sName) {
		this.id = id;
		this.sName = sName;
		
	}
	
	@Override
	
	public String toString() {
		return this.id +":" + this.sName;
	}
	

}
