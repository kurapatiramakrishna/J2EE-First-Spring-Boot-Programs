package com.jsp.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class projectManager 
{
 @Value("1")
  private int projectManagerId;
 @Value("rk")
  private String pName;
 @Value("30")
  private int DeptNo;

 public projectManager() 
 {
     // Default constructor
 }
  
 
public projectManager(int projectManagerId, String pName, int deptNo) 
{
	super();
	this.projectManagerId = projectManagerId;
	this.pName = pName;
	DeptNo = deptNo;
}


public int getProjectManagerId() 
{
	return projectManagerId;
}
public void setProjectManagerId(int projectManagerId) {
	this.projectManagerId = projectManagerId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public int getDeptNo() {
	return DeptNo;
}
public void setDeptNo(int deptNo) {
	DeptNo = deptNo;
}


@Override
public String toString() {
	return "projectManager [projectManagerId=" + projectManagerId + ", pName=" + pName + ", DeptNo=" + DeptNo + "]";
}

  
}
