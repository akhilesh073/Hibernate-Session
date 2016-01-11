package com.akh.main;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author akhilesh
 *
 */
@Entity
@DiscriminatorValue("regularemployee")
public class RegularEmployee extends Employee {

	@Column(name = "salary")
	private float salary;

	@Column(name = "bonus")
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

	public RegularEmployee(float salary, int bonus) {
		super();
		this.salary = salary;
		this.bonus = bonus;
	}

	public RegularEmployee() {
		// TODO Auto-generated constructor stub
	}
}