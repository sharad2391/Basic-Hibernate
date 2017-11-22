package com.telusko.DemoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Project")
public class HartfordProject {
	@Id
	private String projectID;
	private String projectName;
	private int numberOfResources;
	private float projectBudget;
	private String projectManager;
	public String getProjectID() {
		return projectID;
	}
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getNumberOfResources() {
		return numberOfResources;
	}
	public void setNumberOfResources(int numberOfResources) {
		this.numberOfResources = numberOfResources;
	}
	public float getProjectBudget() {
		return projectBudget;
	}
	public void setProjectBudget(float projectBudget) {
		this.projectBudget = projectBudget;
	}
	public String getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	@Override
	public String toString() {
		return "HartfordProject [projectID=" + projectID + ", projectName=" + projectName + ", numberOfResources="
				+ numberOfResources + ", projectBudget=" + projectBudget + ", projectManager=" + projectManager + "]";
	}

}
