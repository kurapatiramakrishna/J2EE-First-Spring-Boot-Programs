package com.jsp.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class project 
{
	@Value("01")
 private int projectId;
 @Value("ram")
 private String projectName;
 
 @Autowired
 private projectManager manager;

 
 public project() {
	super();
	// TODO Auto-generated constructor stub
}


public project(int projectId, String projectName, projectManager manager) {
	super();
	this.projectId = projectId;
	this.projectName = projectName;
	this.manager = manager;
}


@Override
public String toString() {
	return "project [projectId=" + projectId + ", projectName=" + projectName + ", manager=" + manager + "]";
}





 
}
