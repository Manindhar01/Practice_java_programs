package sample3;

public class TrafficLight {
	
	private String Color;
	private int duration;
	
	TrafficLight(String Color,int duration){
		this.Color=Color;
		this.duration=duration;
		
	}
	
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void changeColor(String newColor) {
		Color=newColor;
	}
	
	public boolean isRed() {
		return Color.equals("Red");
	}
	public boolean isGreen() {
		return Color.equals("Green");
	}
	

}
