package com.onlinegasbooking.serviceimplementation;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinegasbooking.entity.Customer;
import com.onlinegasbooking.entity.Cylinder;
import com.onlinegasbooking.entity.SurrenderCylinder;
import com.onlinegasbooking.repository.CylinderRepository;
import com.onlinegasbooking.repository.SurrenderCylinderRepository;
import com.onlinegasbooking.service.SurrenderCylinderService;

/*********************************************************************************************
 *          @author          Aishwarya Gaiki
 *          Description      It is a service class that provides the services for surrendering 
                             a cylinder, fetching surrender cylinder date and Id for a day.         
 *         Version           1.0     
 *         Created Date      08 - March - 2021
 **********************************************************************************************/

@Service
public class SurrenderCylinderServiceImplementation implements SurrenderCylinderService {
     @Autowired 
     private SurrenderCylinderRepository surrenderCylinderRepository;
     
     @Autowired
     private CylinderRepository cylinderRepository;
     
/********************************************************************************************
 	 *  Method : addSurrenderCylinder
 	 *  Description : To add the category.
 	 *  			  Used inbuilt save() method to add category .
 	 *  @param cid : category which should be added.
 	 *
 	 *Created date : 11/03/2022
*******************************************************************************************/
     
     @Transactional
     public SurrenderCylinder addSurrenderCylinder(SurrenderCylinder surrenderCylinder,Integer cid)
     {
    	 Optional<Cylinder> optionalCylinder = this.cylinderRepository.findById(cid);
 		
 		
		optionalCylinder.get().setSurrendercylinder(surrenderCylinderRepository.save(surrenderCylinder)); 
 		// cylinder.setCustomer(optionalCustomer.get());
 		return cylinderRepository.save(optionalCylinder.get()).getSurrendercylinder();
     }
     
/********************************************************************************************
  	 *  Method : updateSurrenderCylinder
  	 *  Description : To update the category.
  	 *  			  Used inbuilt save() method to add category .
  	 *  @param cid : category which should be updated.
  	 *
  	 *Created date : 11/03/2022
 *******************************************************************************************/   
     
     public SurrenderCylinder updateSurrenderCylinder(SurrenderCylinder surrenderCylinder)
     {
    	 return surrenderCylinderRepository.save(surrenderCylinder);
     }
     public SurrenderCylinder deleteSurrenderCylinder(Integer surrenderId) {
 		return null;
 		
 	}

}
