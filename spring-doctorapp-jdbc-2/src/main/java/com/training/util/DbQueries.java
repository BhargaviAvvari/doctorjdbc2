package com.training.util;

public class DbQueries {
	public static  final String INSERTQUERY="INSERT INTO DOCTORS(name,doctorid,speciality,fee) values(?,?,?,?)";
	public static final String UPDATEQUERY="UPDATE DOCTORS SET fee=? Where doctorid=?";
	public static final String DELETEQUERY="DELETE FROM DOCTORS  Where doctorid=?";
	
	public static final String SELECTQUERY="SELECT * FROM DOCTORS";
	public static final String SELECTBYNAME="SELECT * FROM DOCTORS WHERE NAME=?";
	public static final String SELECTBYSPECIALITY="SELECT * FROM DOCTORS WHERE SPECIALITY=?";
	public static final String SELECTBYID="SELECT * FROM DOCTORS WHERE dOCTORID=?";
	public static final String SELECTBYFEE="SELECT * FROM DOCTORS WHERE FEE=?";
}
