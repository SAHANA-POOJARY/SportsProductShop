package com.lulu.SportsProductShop_Management.Controller;




import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

//we use it create rest api end point along with http Methods

 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lulu.SportsProductShop_Management.Entity.SportsProductShop;
import com.lulu.SportsProductShop_Management.Repository.SportsProductRepositorys;


 




    // we use it create REST API end Point along with http Methods 

                   //Like GET ,POST,DELETE,PUT ,PATCH

@RestController           //POSTMAN
public class SportsProductMyController {

@Autowired
SportsProductRepositorys SportsproductRepo;


@GetMapping("/VeiwSportsProduct")
public List<SportsProductShop>getJPQL(){
	return SportsproductRepo.findAll();//select *from <Table name>
}







@PostMapping("/postSportsProduct")

public SportsProductShop createuser(@RequestBody SportsProductShop prod) {

	return SportsproductRepo.save(prod);

}

	@DeleteMapping("/deletesProduct/{id}")

	public void deletProduct(@PathVariable("id") Integer id  ) {

 

		SportsproductRepo.deleteById(id); // select * from <TableName>;

 

	}
	
	
	
	
	
	
	
	
 

}
