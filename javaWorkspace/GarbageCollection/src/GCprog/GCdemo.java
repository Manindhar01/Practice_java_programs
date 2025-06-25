package GCprog;

public class GCdemo {
	
	GCdemo(){
		System.out.println(this+"Created");
	}

	public static void main(String[] args) {
		
		new GCdemo();
		new GCdemo();

	}
	protected void finalize() {
		System.out.println(this+"Finalized");
	}

}
