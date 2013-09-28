package org.raxa;

import java.util.Calendar;
import java.util.Date;
import java.util.PriorityQueue;

public class PQTest {

	public static void main(String[] args) {
		Date currentTime = new Date();
		String[] patientNames = {"Ramesh","Suresh","Amir"};
		String[] diseaseName = {"toe bleeding","snake bite","fever"};
		Integer[] priority = {2,1,1};
		
		PriorityQueue<Patient> patientQueue = new PriorityQueue<>();
		
		System.out.println("*******Initial Data ****************");
		for(int index = 0;index<3;++index){
			Calendar cal = Calendar.getInstance();
			cal.setTime(currentTime);
			
			Patient patient = new Patient();
			patient.setPatientName(patientNames[index]);
			patient.setPriority(priority[index]);
			patient.setTreatment(diseaseName[index]);
			patient.setTimeStamp(cal.getTime());
			
			System.out.println(patient.getPatientName()+" : "+patient.getPriority()+" : "+patient.getTimeStamp());
			
			patientQueue.add(patient);
			currentTime.setTime(currentTime.getTime()+30000);
		}
		
		Patient addpatient = new Patient();
		addpatient.setPatientName("Amish");
		addpatient.setPriority(2);
		addpatient.setTreatment("Internal Bleeding");
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(new Date());
		addpatient.setTimeStamp(cal1.getTime());
		
		System.out.println(addpatient.getPatientName()+" : "+addpatient.getPriority()+" : "+addpatient.getTimeStamp());
		
		System.out.println("*************Testing Priority Queue ***************");
		Patient patient1 = patientQueue.poll();
		System.out.println(patient1.getPatientName()+" : "+patient1.getPriority()+" : "+patient1.getTimeStamp());
		patientQueue.add(addpatient);
		for(int index = 0;index<3;++index){
			Patient patient = patientQueue.poll();
			System.out.println(patient.getPatientName()+" : "+patient.getPriority()+" : "+patient.getTimeStamp());
		}

	}

}
