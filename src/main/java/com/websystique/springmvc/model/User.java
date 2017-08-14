package com.websystique.springmvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User implements Serializable {
 
	private static final long serialVersionUID = 1L;
	@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	@Column(name="username")
	private String username;
	@Column(name="address")
	private String address;
	@Column(name="salary")
	private int salary;
	@Column(name="email")
	private String email;
	
	public User(){
		id=0;
	}
	
 

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
*/


	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", address=" + address + ", salary=" + salary + ", email="
				+ email + ", hashCode()=" + hashCode() + ", getId()=" + getId() + ", getUsername()=" + getUsername()
				+ ", getAddress()=" + getAddress() + ", getSalary()=" + getSalary() + ", getEmail()=" + getEmail()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}



	public User(long id, String username, String address, int salary, String email) {
		super();
		this.id = id;
		this.username = username;
		this.address = address;
		this.salary = salary;
		this.email = email;
	}

	 
	

	
}
