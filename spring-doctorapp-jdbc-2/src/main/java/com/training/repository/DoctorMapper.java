package com.training.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.model.Doctor;

public class DoctorMapper implements RowMapper<Doctor> {

	@Override
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		String name=rs.getString("name");
		String speciality=rs.getString("speciality");
		double fee=rs.getDouble("fee");
		int doctorId=rs.getInt("doctorId");
		
		Doctor doctor=new Doctor();
		doctor.setName(name);
		doctor.getSpeciality();
		doctor.setFee(fee);
		doctor.setDoctorId(doctorId);
		return doctor;
	}

}
