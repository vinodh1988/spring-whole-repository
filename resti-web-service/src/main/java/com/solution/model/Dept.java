package com.solution.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Dept {
  @Id
    private Integer deptno;
  @Column
    private String name;
  
  @OneToMany(mappedBy = "dept",cascade = CascadeType.ALL)
  private Set<Emp> employees;
  
  
  
  public Dept() {
	  
  }
  
  
public Dept(Integer deptno, String name) {
	super();
	this.deptno = deptno;
	this.name = name;
}



public Set<Emp> getEmployees() {
	return employees;
}


public void setEmployees(Set<Emp> employees) {
	this.employees = employees;
}


public Integer getDeptno() {
	return deptno;
}
public void setDeptno(Integer deptno) {
	this.deptno = deptno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
  
  
}
