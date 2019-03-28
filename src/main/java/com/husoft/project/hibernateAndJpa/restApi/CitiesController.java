package com.husoft.project.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.husoft.project.hibernateAndJpa.Bussiness.ICityService;
import com.husoft.project.hibernateAndJpa.Entities.City;

@RestController
@RequestMapping("/api")
public class CitiesController {
	private ICityService cityService;
	
	@Autowired
	public CitiesController(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@GetMapping("/cities")
	public List<City> Get(){
		return this.cityService.getAll();
	}
	
	@GetMapping("/cities/{id}")
	public City GetById(@PathVariable int id) {
		return this.cityService.getById(id);
	}
	
	@PostMapping("/cities/add")
	public void add(@RequestBody City city) {
		this.cityService.add(city);
	}
	
	@PostMapping("/cities/update")
	public void update(@RequestBody City city) {
		this.cityService.update(city);
	}
	
	@PostMapping("/cities/delete")
	public void delete(@RequestBody City city) {
		this.cityService.delete(city);
	}
	
}
