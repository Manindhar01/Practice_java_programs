package com.table_per_concerate;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.*;

@Entity
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="r_id")),
	@AttributeOverride(name="name",column=@Column(name="r_name"))
})
public class Regular_Employee extends Employee {
	
	private float salary;
	private int bonus;
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
