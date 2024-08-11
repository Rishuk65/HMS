package com.HospitalManagementProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HospitalManagementProject.entities.DoctorsModel;
import com.HospitalManagementProject.services.DoctorService;

@RestController
@RequestMapping("/Hospital")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	
	@GetMapping("/test")
	public String test() {
		return "this is test method of HMS project";
	}
	
	//adding doctors
	@PostMapping("/insert")
	public DoctorsModel insertDoctor(@RequestBody DoctorsModel doctor) {

		return doctorService.addDoctor(doctor);
	}
	
	// fetchdoctorBy id
	      @GetMapping("/doctor/{id}")
		public DoctorsModel fetchDocById(@PathVariable Long id) {

			return doctorService.getDocById(id);
		}
	      
	    //fetching all doctors
	      @GetMapping("/doctors")
	  	public List<DoctorsModel> getAllDoctors() {

	  		return doctorService.getAllDoctors();
	  	}

}
