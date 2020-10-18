package com.philips.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.philips.dao.IProdDao;
import com.philips.entity.Prod;

@RestController
public class CustomerService {
	
	@Autowired
	private IProdDao dao ;
	
//	public List<Prod> addNewProd( List<Prod> prodList ) {
//		prodList.add( 
//				new Product( 
//						prod.getProdId(), 
//						prod.getProdName(), 
//						prod.getProdPrice(), 
//						prod.getDateOfManufacture(), 
//						prod.isHasTouchscreen(), 
//						prod.isHasAlarm(), 
//						prod.isInteroperable(), 
//						prod.isWearable(), 
//						prod.isHasEmrConnectivity(), 
//						prod.isPortable(), 
//						prod.isWireless() 
//						) ) ;
//	}
//	return prodList ;
//	}
	
	@GetMapping("/products/category/touchscreen")
	public List<Prod> touchScreenProducts() {
		List<Prod> prodList = new ArrayList<Prod>() ;
		for( Prod prod : dao.viewProduct() ) {
			if( prod.isHasTouchscreen() ) {
				prodList.add( 
						new Prod( 
								prod.getProdId(), 
								prod.getProdName(), 
								prod.getProdPrice(), 
								prod.getDateOfManufacture(), 
								prod.isHasTouchscreen(), 
								prod.isHasAlarm(), 
								prod.isInteroperable(), 
								prod.isWearable(), 
								prod.isHasEmrConnectivity(), 
								prod.isPortable(), 
								prod.isWireless() 
								) ) ;
			}
		}
		return prodList ;
	}
	
	@GetMapping("/products/category/alarm")
	public List<Prod> alarmProducts() {
		List<Prod> prodList = new ArrayList<Prod>() ;
		for( Prod prod : dao.viewProduct() ) {
			if( prod.isHasAlarm() ) {
				prodList.add( 
						new Prod( 
								prod.getProdId(), 
								prod.getProdName(), 
								prod.getProdPrice(), 
								prod.getDateOfManufacture(), 
								prod.isHasTouchscreen(), 
								prod.isHasAlarm(), 
								prod.isInteroperable(), 
								prod.isWearable(), 
								prod.isHasEmrConnectivity(), 
								prod.isPortable(), 
								prod.isWireless() 
								) ) ;
			}
		}
		return prodList ;
	}
	
	@GetMapping("/products/category/interoperable")
	public List<Prod> interoperableProducts() {
		List<Prod> prodList = new ArrayList<Prod>() ;
		for( Prod prod : dao.viewProduct() ) {
			if( prod.isInteroperable() ) {
				prodList.add( 
						new Prod( 
								prod.getProdId(), 
								prod.getProdName(), 
								prod.getProdPrice(), 
								prod.getDateOfManufacture(), 
								prod.isHasTouchscreen(), 
								prod.isHasAlarm(), 
								prod.isInteroperable(), 
								prod.isWearable(), 
								prod.isHasEmrConnectivity(), 
								prod.isPortable(), 
								prod.isWireless() 
								) ) ;
			}
		}
		return prodList ;
	}
	
	@GetMapping("/products/category/wearable")
	public List<Prod> wearableProducts() {
		List<Prod> prodList = new ArrayList<Prod>() ;
		for( Prod prod : dao.viewProduct() ) {
			if( prod.isWearable() ) {
				prodList.add( 
						new Prod( 
								prod.getProdId(), 
								prod.getProdName(), 
								prod.getProdPrice(), 
								prod.getDateOfManufacture(), 
								prod.isHasTouchscreen(), 
								prod.isHasAlarm(), 
								prod.isInteroperable(), 
								prod.isWearable(), 
								prod.isHasEmrConnectivity(), 
								prod.isPortable(), 
								prod.isWireless() 
								) ) ;
			}
		}
		return prodList ;
	}
	
	@GetMapping("/products/category/emrconnectivity")
	public List<Prod> emrconnectivityProducts() {
		List<Prod> prodList = new ArrayList<Prod>() ;
		for( Prod prod : dao.viewProduct() ) {
			if( prod.isHasEmrConnectivity() ) {
				prodList.add( 
						new Prod( 
								prod.getProdId(), 
								prod.getProdName(), 
								prod.getProdPrice(), 
								prod.getDateOfManufacture(), 
								prod.isHasTouchscreen(), 
								prod.isHasAlarm(), 
								prod.isInteroperable(), 
								prod.isWearable(), 
								prod.isHasEmrConnectivity(), 
								prod.isPortable(), 
								prod.isWireless() 
								) ) ;
			}
		}
		return prodList ;
	}
	
	@GetMapping("/products/category/portable")
	public List<Prod> portableProducts() {
		List<Prod> prodList = new ArrayList<Prod>() ;
		for( Prod prod : dao.viewProduct() ) {
			if( prod.isPortable() ) {
				prodList.add( 
						new Prod( 
								prod.getProdId(), 
								prod.getProdName(), 
								prod.getProdPrice(), 
								prod.getDateOfManufacture(), 
								prod.isHasTouchscreen(), 
								prod.isHasAlarm(), 
								prod.isInteroperable(), 
								prod.isWearable(), 
								prod.isHasEmrConnectivity(), 
								prod.isPortable(), 
								prod.isWireless() 
								) ) ;
			}
		}
		return prodList ;
	}
	
	@GetMapping("/products/category/wireless")
	public List<Prod> wirelessProducts() {
		List<Prod> prodList = new ArrayList<Prod>() ;
		for( Prod prod : dao.viewProduct() ) {
			if( prod.isWireless()) {
				prodList.add( 
						new Prod( 
								prod.getProdId(), 
								prod.getProdName(), 
								prod.getProdPrice(), 
								prod.getDateOfManufacture(), 
								prod.isHasTouchscreen(), 
								prod.isHasAlarm(), 
								prod.isInteroperable(), 
								prod.isWearable(), 
								prod.isHasEmrConnectivity(), 
								prod.isPortable(), 
								prod.isWireless() 
								) ) ;
			}
		}
		return prodList ;
	}
	
	
	
}
