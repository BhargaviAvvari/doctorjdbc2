
package com.training.repository;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import com.training.Service.IDoctorService;


import com.training.model.Doctor;
import com.training.util.DbQueries;
@Repository
public class DoctorImplRepository implements IDoctorRepository {
	private JdbcTemplate jdbctemplate ;
	
@Autowired
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public void addDoctor(Doctor doctor) {
		Object[] doctorArray= {
				doctor.getName(),doctor.getDoctorId(),doctor.getSpeciality(),doctor.getFee()
		};
		jdbctemplate.update(DbQueries.INSERTQUERY, doctorArray);
			}
	

	@Override
	public void updateDoctor(int doctorId, double fee) {
		String sql=DbQueries.UPDATEQUERY;
		jdbctemplate.update(sql,fee,doctorId);
	}

	@Override
	public void deleteDoctor(int doctorId) {
		String sql=DbQueries.DELETEQUERY;
		jdbctemplate.update(DbQueries.DELETEQUERY,doctorId);		
	}

	@Override
	public List<Doctor> findAll() {
		RowMapper<Doctor> mapper=new DoctorMapper();
		List<Doctor>doctors=jdbctemplate.query(DbQueries.SELECTQUERY, mapper);
		return doctors;
	}

	@Override
	public Doctor findById(int doctorId) {
		Doctor ndoctor =jdbctemplate.queryForObject(DbQueries.SELECTBYID, (rs,rowNum)->{
			Doctor doctors=new Doctor();
			doctors.setName(rs.getString("name"));
			doctors.setSpeciality(rs.getString("speciality"));
			doctors.setFee(rs.getDouble("fee"));
			
			doctors.setDoctorId(doctorId);
			return doctors;
		} ,doctorId);
		return ndoctor;
	}

	@Override
	public List<Doctor> findByName(String name) {
		List<Doctor> doctors=jdbctemplate.query(DbQueries.SELECTBYNAME, (rs,rowNum)->{
			Doctor doctor=new Doctor();
			doctor.setName(rs.getString("name"));
			doctor.setSpeciality(rs.getString("speciality"));
			doctor.setFee(rs.getDouble("fee"));
			
			int doctorId=rs.getInt("doctorId");
			doctor.setDoctorId(doctorId);
		
		return doctor;
		},name);
		return doctors;
	}
	

	@Override
	public List<Doctor> findBySpeciality(String speciality) {
		List<Doctor> doctors=jdbctemplate.query(DbQueries.SELECTBYSPECIALITY, (rs,rowNum)->{
			Doctor doctor=new Doctor();
			doctor.setName(rs.getString("name"));
			doctor.setSpeciality(rs.getString("speciality"));
			doctor.setFee(rs.getDouble("fee"));
			
			int doctorId=rs.getInt("doctorId");
			doctor.setDoctorId(doctorId);
		
		return doctor;
		},speciality);
		return doctors;
		
	}

	@Override
	public List<Doctor> findByFee(double fee) {
		List<Doctor> doctors=jdbctemplate.query(DbQueries.SELECTBYFEE, (rs,rowNum)->{
			Doctor doctor=new Doctor();
			doctor.setName(rs.getString("name"));
			doctor.setSpeciality(rs.getString("speciality"));
			doctor.setFee(rs.getDouble("fee"));
			
			int doctorId=rs.getInt("doctorId");
			doctor.setDoctorId(doctorId);
		
		return doctor;
		},fee);
		return doctors;
		
	}

	}

	
	

