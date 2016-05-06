package com.schedule.services;


import javax.ws.rs.Path;

import com.schedule.dao.AppointmentDAO;
import com.schedule.entities.Appointment;

@Path("/appointments")
public class AppointmentService extends GenericService<Appointment, AppointmentDAO> {

	public AppointmentService() {
		super(new AppointmentDAO());
	}
	
	
	
}
