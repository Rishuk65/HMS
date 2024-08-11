package com.HospitalManagementProject.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.HospitalManagementProject.entities.DoctorsModel;

@Repository
public interface DoctorRepo extends JpaRepository<DoctorsModel, Long>{
	
	@Query(value = "select * from DoctorsModel;",nativeQuery = true)
	public List<DoctorsModel> getAllDoctors();

}
