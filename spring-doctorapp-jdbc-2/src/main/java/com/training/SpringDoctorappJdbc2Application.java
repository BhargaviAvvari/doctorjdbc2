package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.Service.IDoctorService;
import com.training.model.Doctor;

@SpringBootApplication
public class SpringDoctorappJdbc2Application implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorappJdbc2Application.class, args);
	}
	@Autowired
IDoctorService doctorService;
	@Override
	public void run(String... args) throws Exception {
Doctor doctor=new Doctor("komali","othropeditrian",4000)	;
doctorService.addDoctor(doctor);
	}

}
