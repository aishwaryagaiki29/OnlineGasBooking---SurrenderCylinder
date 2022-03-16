package com.onlinegasbooking.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.onlinegasbooking.entity.Cylinder;
import com.onlinegasbooking.entity.SurrenderCylinder;
import com.onlinegasbooking.repository.CylinderRepository;
import com.onlinegasbooking.service.SurrenderCylinderService;

/*********************************************************************************************
 *          @author          Aishwarya Gaiki
 *          Description      It is a SurrenderCylinder - controller class. It provides 
 *                           RestMappings inorder to connect with the swagger. 
 *          Version          1.0     
 *          Created Date     11 - March - 2021
 **********************************************************************************************/

@RestController
public class SurrenderCylinderController {
	@Autowired
	SurrenderCylinderService surrenderCylinderService;
	
	@Autowired
	private CylinderRepository cylinderRepository;
	
	// addCylinder to database.
	//Post method
	@PostMapping("/cylinder")
	public Cylinder addCylinder(@RequestBody Cylinder cylinder)
	{
		return cylinderRepository.save(cylinder);
	}
	
	//getCylinder to get cylinderId with provided details.
	//Get method
	@GetMapping("/cylinder/{cid}")
	public Cylinder getCylinder(@PathVariable("cid") Integer cId ) {
		return cylinderRepository.findById(cId).get();
	}
	
	// addSurrenderCylinder to database.
	//Post method
	@PostMapping("/surrendercylinder/{cylid}")
	public SurrenderCylinder addSurrenderCylinder(@Valid @RequestBody SurrenderCylinder surrenderCylinder,@PathVariable("cylid") Integer cId)
	{
		return surrenderCylinderService.addSurrenderCylinder(surrenderCylinder, cId);
	}
	//updateSurrenderCylinder to database.
	//Put method
	@PutMapping("/surrendercylinder")
	public SurrenderCylinder updateSurrenderCylinder(@Valid @RequestBody SurrenderCylinder surrenderCylinder)
	{
		return surrenderCylinderService.updateSurrenderCylinder(surrenderCylinder);
	}
	
	
}
