package com.HospitalManagementProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.HospitalManagementProject.Repositories.DoctorRepo;
import com.HospitalManagementProject.entities.DoctorsModel;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepo doctorRepo;


	// adding doctor
	public DoctorsModel addDoctor(DoctorsModel doctor) {

		return doctorRepo.save(doctor);
	}

	// fetchdoctorBy id
	public DoctorsModel getDocById(Long id) {

		return doctorRepo.findById(id).get();
	}
	
	
	//fetching all doctors
	public List<DoctorsModel> getAllDoctors() {

		return doctorRepo.findAll();
	}
	
	//update Dcotors
//	public DoctorsModel updateDoctor(DoctorsModel doctor) {
//		
//
//		return doctorRepo.save(doctor);
//	}
//	

}
