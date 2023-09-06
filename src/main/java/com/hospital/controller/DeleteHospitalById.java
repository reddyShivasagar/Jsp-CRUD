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

@WebServlet("/deletehospitalbyid")
public class DeleteHospitalById extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int id=Integer.parseInt(req.getParameter("id"));
		
		HospitalService hospitalService=new HospitalService();
		
		Hospital hospital2=hospitalService.deleteHospital(id);
		
		if(hospital2!=null) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("/getall");
			dispatcher.forward(req, resp);
		}
		else
		{
			RequestDispatcher dispatcher=req.getRequestDispatcher("DeleteHospitalById.jsp");
			dispatcher.include(req, resp);
		}
	}

}
