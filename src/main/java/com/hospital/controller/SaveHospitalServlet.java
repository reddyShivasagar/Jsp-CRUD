package com.hospital.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospital.dto.Hospital;
import com.hospital.service.HospitalService;


@WebServlet("/savehospital")
public class SaveHospitalServlet extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
				Hospital hospital=new Hospital();
		
	             hospital.setName(req.getParameter("name"));
	             hospital.setWebsite(req.getParameter("website"));
	             hospital.setPhoneno(Long.parseLong(req.getParameter("phoneno")));
	             
	             HospitalService hospitalService=new HospitalService();
	             
	             Hospital  hospital2=hospitalService.saveHospital(hospital);
	             
	             if(hospital2!=null) {
	            	 RequestDispatcher dispatcher=req.getRequestDispatcher("");
	            	 dispatcher.forward(req, resp);
	             }
	             else {
	            	 RequestDispatcher dispatcher=req.getRequestDispatcher("SaveHospital.jsp");
	            	 dispatcher.include(req, resp);
	             }
          
	}

}
