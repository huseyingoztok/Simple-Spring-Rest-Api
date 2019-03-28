package com.husoft.project.hibernateAndJpa.Bussiness;

import java.util.List;

import com.husoft.project.hibernateAndJpa.Entities.City;

public interface ICityService {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
