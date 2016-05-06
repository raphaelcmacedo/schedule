package com.schedule.services;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.schedule.dao.GenericDAO;
import com.schedule.entities.GenericEntity;

public class GenericService<Entity extends GenericEntity, DAO extends GenericDAO> {
	
	private DAO dao;
	
	public GenericService(DAO dao) {
		super();
		this.dao = dao;
	}

	@GET
	@Produces("application/json")
	public String listAll(){
		List<Entity> entities = dao.listAll();
		return new Gson().toJson(entities);
	}
	
	@Path("{id}")
	@GET
	@Produces("application/json")
	public String getById(@PathParam("id")int id){
		Entity entity = (Entity) dao.getById(id);
		return new Gson().toJson(entity);
	}
}
