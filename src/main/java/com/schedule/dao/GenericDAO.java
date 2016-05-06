package com.schedule.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.schedule.entities.Appointment;
import com.schedule.entities.GenericEntity;

public abstract class GenericDAO<Entity extends GenericEntity> {
	
	public abstract List<Entity> listAll();
	public abstract Entity getById(int id);
}
