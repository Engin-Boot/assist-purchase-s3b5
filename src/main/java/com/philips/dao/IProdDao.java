package com.philips.dao;

import java.util.List;

import com.philips.entity.Prod;

public interface IProdDao {
	
	public boolean addProduct( Prod prod ) ;
	public List<Prod> viewProduct() ;
	public Prod viewProduct( int prodId ) ;
	public boolean editProduct( Prod prod ) ;
	public boolean removeProduct( Prod prod ) ;
	
}
