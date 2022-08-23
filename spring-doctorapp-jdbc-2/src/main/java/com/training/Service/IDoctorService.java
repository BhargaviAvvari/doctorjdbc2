package com.training.Service;

import java.util.List;



import com.training.model.Doctor;

public interface IDoctorService {
	
	void addDoctor (Doctor doctor);
	void updateDoctor(int doctorId,double fee);
	void deleteDoctor(int doctorId);
	List<Doctor> getAll();
	Doctor getById(int doctorId);
	List<Doctor> getByName(String name);
	List<Doctor> getBySpeciality(String speciality);
	List<Doctor> getByFee(double fee);
	
}
