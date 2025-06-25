package sample3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight tl=new TrafficLight("Red", 5);
		System.out.println("current color: "+tl.getColor());
		System.out.println("is green: "+tl.isGreen());
		System.out.println("current duration: "+tl.getDuration());
		tl.setDuration(20);
		tl.setColor("Green");
		System.out.println("color change to: "+tl.getColor());
		System.out.println("duration id: "+tl.getDuration());

	}

}
