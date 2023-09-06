
package com.hospital.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospital.dto.Hospital;
import com.hospital.service.HospitalService;


@WebServlet("/getall")

public class GetAllHospital extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HospitalService hospitalService=new HospitalService();
		
		List<Hospital> list= hospitalService.displayHospital();
		
		if(list.size()>0) {
			req.setAttribute("addlist", list);
			RequestDispatcher dispatcher=req.getRequestDispatcher("DisplayHospital.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("SaveHospital.jsp");
			dispatcher.include(req, resp);
		}
		
		
		
	}
	}

