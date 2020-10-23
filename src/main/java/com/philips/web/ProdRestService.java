package com.philips.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.philips.dao.IProdDao;
import com.philips.entity.Prod;
import com.philips.exceptions.ProdIdException;
import com.philips.exceptions.ProdNotFoundException;

@CrossOrigin
@RestController
public class ProdRestService {
	
	@Autowired
	private IProdDao dao ;
	
	@PostMapping("/addproduct")
	public String addProduct(@RequestBody Prod prod) throws ProdIdException {
		Prod prodFromDb = dao.viewProduct(prod.getProdId());
		if(prodFromDb != null)
			throw new ProdIdException("ID already exists");
		dao.addProduct(prod) ;
		return "Product Added Successfully";
	}
	
	@GetMapping("/viewall")
	public List<Prod> viewProduct(){
		return dao.viewProduct();
	}
	
	@GetMapping("/viewbyid/{prodid}")
	public Prod viewProduct(@PathVariable("prodid") int pid) throws ProdNotFoundException {
		Prod prodFromDb = dao.viewProduct(pid) ;
		if(prodFromDb == null)
			throw new ProdNotFoundException("Product Not found for the ID " + pid);
		return prodFromDb;
	}
	
	@PutMapping("/editproduct")
	public String editProduct(@RequestBody Prod prod) throws ProdNotFoundException {
		Prod empFromDb = dao.viewProduct(prod.getProdId());
		if(empFromDb == null)
			throw new ProdNotFoundException("Product Not found for the ID " + prod.getProdId());
		dao.editProduct(prod);
		 return "Product Edited Successfully";
	}

	@DeleteMapping("/deleteproduct/{prodid}")
	public String deleteProduct(@PathVariable("prodid") int pid) throws ProdNotFoundException {
		Prod prodFromDb = dao.viewProduct(pid);
		if(prodFromDb == null)
			throw new ProdNotFoundException("Product Not found for the ID " + pid);
		dao.removeProduct(prodFromDb) ;
		return "Product Deleted for the ID : " + pid;
	} 
	
	
}
