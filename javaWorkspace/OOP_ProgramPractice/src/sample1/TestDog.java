package sample1;

public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj1=new Dog("Jimmy","French Bulldog");
		Dog obj2=new Dog("Tiger","German Shepherd");
		System.out.println("Old dogs:");
		System.out.println("Name: "+obj1.getName());
		System.out.println("Breed: "+obj1.getBreed());
		System.out.println("Name: "+obj2.getName());
		System.out.println("Breed: "+obj2.getBreed());
		
		System.out.println();
		
		System.out.println("New dogs:");
		obj1.setName("Puppy");
		obj2.setBreed("BullDog");
		System.out.println("Name: "+obj1.getName());
		System.out.println("Breed: "+obj1.getBreed());
		System.out.println("Name: "+obj2.getName());
		System.out.println("Breed: "+obj2.getBreed());
		
		

	}

}
