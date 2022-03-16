package com.onlinegasbooking.service;

import com.onlinegasbooking.entity.SurrenderCylinder;

/*********************************************************************************************
 *          @author          Aishwarya Gaiki
 *          Description      It is a SurrenderCylinder - Service class. It provides service 
 *                           methods for adding and updating SurrenderCylinder data.
 *          Version          1.0     
 *          Created Date     11 - March - 2021
 **********************************************************************************************/
public interface SurrenderCylinderService {
	
	public SurrenderCylinder addSurrenderCylinder(SurrenderCylinder surrenderCylinder, Integer cId);
    public SurrenderCylinder updateSurrenderCylinder(SurrenderCylinder surrenderCylinder);
}
