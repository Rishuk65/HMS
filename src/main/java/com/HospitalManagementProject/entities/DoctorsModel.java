package com.HospitalManagementProject.entities;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "doctors_Table")
@JsonInclude(value = Include.NON_NULL)
public class DoctorsModel {
	       @Id
	       @GeneratedValue(strategy = GenerationType.AUTO)
	   private Long docId;
	    private String docName;
	    private String docDepartment;
	    private Date doc_in;
	    private Date doc_out;

}
