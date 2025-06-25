package com.table_per_hierarchy;

import jakarta.persistence.Entity;

@Entity
public class Bowler extends TeamIndia{
	private String bowlingHand;
	private String bestFigure;
	public String getBowlingHand() {
		return bowlingHand;
	}
	public void setBowlingHand(String bowlingHand) {
		this.bowlingHand = bowlingHand;
	}
	public String getBestFigure() {
		return bestFigure;
	}
	public void setBestFigure(String bestFigure) {
		this.bestFigure = bestFigure;
	}

}
