package com.training.Service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.training.model.Doctor;

import com.training.repository.IDoctorRepository;
@ Service
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
private IDoctorRepository doctorRepository;
	@Override
	public void addDoctor(Doctor doctor) {
		doctorRepository.addDoctor(doctor);
		
	}

	@Override
	public void updateDoctor(int doctorId, double fee) {
doctorRepository.updateDoctor(doctorId, fee);		
	}

	@Override
	public void deleteDoctor(int doctorId) {
doctorRepository.deleteDoctor(doctorId);		
	}

	@Override
	public List<Doctor> getAll() {
		return doctorRepository.findAll();
	}

	@Override
	public Doctor getById(int doctorId) {
		return doctorRepository.findById(doctorId);
	}

	@Override
	public List<Doctor> getByName(String name) {
		return doctorRepository.findByName(name);
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) {
		return doctorRepository.findBySpeciality(speciality);
	}

	@Override
	public List<Doctor> getByFee(double fee) {
		return doctorRepository.findByFee(fee);
	}

	
}
