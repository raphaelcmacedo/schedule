package com.schedule.services;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.schedule.dao.AppointmentDAO;
import com.schedule.entities.Appointment;

@Path("/appointments")
public class AppointmentService {
		
	@GET
	@Produces("application/json")
	public String listAllAppointments(){
		AppointmentDAO dao = new AppointmentDAO();
		List<Appointment> appointments = dao.listAllAppointments();
		
		return new Gson().toJson(appointments);
	}
	
	@Path("{id}")
	@GET
	@Produces("application/json")
	public String getById(@PathParam("id")int id){
		AppointmentDAO dao = new AppointmentDAO();
		Appointment appointment = dao.getById(id);
		return new Gson().toJson(appointment);
	}
}
