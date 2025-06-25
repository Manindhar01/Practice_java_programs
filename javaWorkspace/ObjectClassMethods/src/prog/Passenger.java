package prog;

public class Passenger {
	private int id;
	private String firstname;
	private String lastname;
	
	public String getfirstName() {
		return firstname;
	}
	public void setfirstName(String firstname) {
		this.firstname=firstname;
	}
	public String getlastName() {
		return lastname;
	}
	public void setlastName(String lastname) {
		this.lastname=lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String toString() {
		return "passenger information is firstName: "+this.firstname+" last Name: "+this.lastname;
		
	}
	public int hashCode() {
		return id+firstname.length()+lastname.length();
	}
	
	public boolean equals(Object obj) {
		Passenger p=(Passenger)obj;
		if(p.getId()==this.id&&p.getfirstName().equals(this.firstname)&&p.getlastName().equals(this.lastname)) {
			return true;
	}
	return false;
	}

}
