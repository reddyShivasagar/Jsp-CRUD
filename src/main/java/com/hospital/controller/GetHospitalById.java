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

@WebServlet("/getbyid")
public class GetHospitalById extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		HospitalService hospitalService=new HospitalService();
		Hospital hospital=hospitalService.getHospitalById(id);
		
		if(hospital!=null) {
			req.setAttribute("idnumber", hospital);
			RequestDispatcher dispatcher=req.getRequestDispatcher("GetHospitalByIdRes.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("SaveHospital.jsp");
			dispatcher.include(req, resp);
		}
	}
}
