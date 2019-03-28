package com.husoft.project.hibernateAndJpa.Bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.husoft.project.hibernateAndJpa.DataAccess.ICityDal;
import com.husoft.project.hibernateAndJpa.Entities.City;

@Service
public class CityManager implements ICityService {
	private ICityDal cityDal;
	/*
	 * Transactional hem burada hem de Data Access Layer' da yazılmalıdır
	 * 
	 */
	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	@Transactional 
	public List<City> getAll() {
		
		return this.cityDal.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		this.cityDal.add(city);
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityDal.update(city);
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.cityDal.delete(city);
	}

	@Override
	@Transactional
	public City getById(int id) {
		return this.cityDal.getById(id);
	}

}
