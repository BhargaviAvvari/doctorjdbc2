package com.training.repository;

import java.util.List;

import com.training.exception.DoctorNotFoundException;
import com.training.exception.IdNotFoundException;
import com.training.model.Doctor;

public interface IDoctorRepository {

	void addDoctor (Doctor doctor);
	void updateDoctor(int doctorId,double fee);
	void deleteDoctor(int doctorId);
	List<Doctor> findAll();
	Doctor findById(int doctorId);
	List<Doctor> findByName(String name);
	List<Doctor> findBySpeciality(String speciality);
	List<Doctor> findByFee(double fee);
}
