package org.raxa;

import java.util.Date;

public class Patient implements Comparable<Patient>{
	
	private String patientName;
	private Date timeStamp;
	private String treatment;
	private Integer priority;
	
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	@Override
	public int compareTo(Patient patient) {
		int priorityComparison = priority.compareTo(patient.getPriority());
		//if same priority then comparing based on the timestamp
		if(priorityComparison==0){
			return timeStamp.compareTo(patient.getTimeStamp());
		}
		return priorityComparison;
	}

}
