package com.override;

public class myChild extends MyParent{
	
	@Override
	public String greet(String name) {
		return "hi"+name;
	}

}
