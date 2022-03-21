package com.uolhost.calendarAPI.controller;

import com.uolhost.calendarAPI.model.ResponsavelIncidente;
import com.uolhost.calendarAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class CalendarController {

	@Autowired
	private PersonService service;
	
	@GetMapping("/im-day")
	public List<ResponsavelIncidente> getPersonList() {
		return service.getResponsavelIncidentes();
	}
}