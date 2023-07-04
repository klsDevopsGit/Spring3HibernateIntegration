package com.howtodoinjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity (name = "EmpUser")
@Table(name="EMP_USER")
public class EmpUserEntity {
	
	
    @Column(name="EMP_NAME")
    private String empName;
 
    public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="PASSWORD")
    private String password;
	
}
