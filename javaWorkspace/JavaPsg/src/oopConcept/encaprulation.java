package oopConcept;

class Dem{
	private String name;
	private int age;
	private String gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}

public class encaprulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dem obj=new Dem();
		obj.setName("mani");
		obj.setAge(18);
		obj.setGender("male");
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getGender());

	}

}
