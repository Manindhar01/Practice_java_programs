package com.table_per_hierarchy;

import jakarta.persistence.Entity;

@Entity
public class BatsMan extends TeamIndia {
	private String battingHand;
	private int highestScore;
	public String getBattingHand() {
		return battingHand;
	}
	public void setBattingHand(String battingHand) {
		this.battingHand = battingHand;
	}
	public int getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}
	

}
