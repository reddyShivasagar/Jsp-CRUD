package com.hospital.service;

import java.util.List;

import com.hospital.dao.HospitalDao;
import com.hospital.dto.Hospital;

public class HospitalService {

	HospitalDao dao=new HospitalDao();
	
	public Hospital saveHospital(Hospital hospital) {
		return dao.saveHospital(hospital);
		
	}
	public Hospital updateHospital(Hospital hospital) {
		return dao.updateHospital(hospital);
		
	}
	public Hospital deleteHospital(int id) {
		return dao.deleteHospital(id);
		
	}
	public List<Hospital> displayHospital() {
		return dao.displayHospital();
		
	}
	public Hospital loginHospital(String email,String password) {
		return dao.loginHospital(email, password);
		
	}
	public Hospital getHospitalById(int id) {
		return dao.getHospitalById(id);
	
	}
}
