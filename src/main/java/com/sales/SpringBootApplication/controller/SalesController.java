package com.sales.SpringBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.SpringBootApplication.model.SalesDetails;
import com.sales.SpringBootApplication.service.SalesService;


@RestController
public class SalesController {
	
	  @Autowired
	  SalesService salseService;
	  
	  @GetMapping(value="/sales")
	  private List<SalesDetails> getAllStudent() 
	  {
	  return salseService.getAllSales();
	  }

}
