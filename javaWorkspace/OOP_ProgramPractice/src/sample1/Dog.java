package sample1;

public class Dog {
	
	private String Name;
	private String Breed;
	
	Dog(String Name,String Breed){
		this.Name=Name;
		this.Breed=Breed;
	}
	
	String getName() {
		return Name;
	}
	String getBreed() {
		return Breed;
	}
	
	void setName(String Name) {
		this.Name=Name;
	}
	
	void setBreed(String Breed) {
		this.Breed=Breed;
	}

}
