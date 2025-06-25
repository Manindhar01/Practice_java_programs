package prog;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passenger p=new Passenger();
		p.setfirstName("hari");
		p.setlastName("sanjay");
		p.setId(123);
		System.out.println(p);
		System.out.println(p.hashCode());
		
		Passenger p1=new Passenger();
		p1.setfirstName("hari");
		p1.setlastName("sanjay");
		p1.setId(123);
		System.out.println(p.equals(p1));

	}

}
