package com.schedule.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.schedule.entities.Appointment;

public class AppointmentDAO extends GenericDAO<Appointment> {
	
	private static Map<Integer, Appointment> appointments = new TreeMap<Integer, Appointment>();
	
	static{
		Appointment ap1 = new Appointment();
		ap1.setId(1);
		ap1.setTitle("Vendor meeting");
		ap1.setPerson("Loxa");
		ap1.setTime(new Date());
		ap1.setWhere("Webex room");
		ap1.setDescription("Weekly meeting");
		appointments.put(1, ap1);
		
		Appointment ap2 = new Appointment();
		ap2.setId(2);
		ap2.setTitle("System demonstrantion");
		ap2.setPerson("Macedo");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 30);
		cal.set(Calendar.MONTH, 5);
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.HOUR, 12);
		ap2.setTime(cal.getTime());
		ap2.setWhere("My office");
		ap2.setDescription("Demo of the new rest API");
		appointments.put(2, ap2);
		
	}
	
	@Override
	public List<Appointment> listAll(){
		return new ArrayList<Appointment>(appointments.values());
	}
	
	@Override
	public Appointment getById(int id){
		return appointments.get(id);
	}
	
}
