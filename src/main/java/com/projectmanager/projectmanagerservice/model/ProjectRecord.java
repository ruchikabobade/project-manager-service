package com.projectmanager.projectmanagerservice.model;

import java.util.Date;

public class ProjectRecord {

	public ProjectRecord() {}
	public ProjectRecord(Long projectId, String project, boolean setDate, Date startDate, Date endDate, int priority, int tasks, int completedTasks) {
		super();
		this.projectId = projectId;
		this.project = project;
		this.setDate = setDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
		this.tasks = tasks;
		this.completedTasks = completedTasks;
	}
	public Long projectId = 0l;
	public String project =  "";
	public boolean setDate = false;
	public Date startDate = null;
	public Date endDate = null;
	public int priority = 0;
	public int tasks = 0;
	public int completedTasks = 0;
	public boolean status = false;
	public String manager = "";
	
	@Override
	public String toString() {
		return "ProjectRecord [projectId=" + projectId + ", project=" + project + ", setDate=" + setDate
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", priority=" + priority + ", tasks=" + tasks
				+ ", completedTasks=" + completedTasks + ", status=" + status + ", manager=" + manager + "]";
	}
}
