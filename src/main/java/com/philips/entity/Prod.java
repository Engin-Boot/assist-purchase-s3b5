package com.philips.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="philips_products")
public class Prod {

	@Id
	@Column( name="prod_id" )
	private int prodId ;
	@Column( name="prod_name", length=20 )
	private String prodName ;
	@Column( name="prod_price" )
	private double prodPrice ;
	@DateTimeFormat( pattern="yyyy-M-d" )
	@Column( name="prod_dom" )
	private LocalDate dateOfManufacture ;
	@Column( name="is_touchscreen" )
	private boolean hasTouchscreen ;
	@Column( name="has_alaram" )
	private boolean hasAlarm ;
	@Column( name="is_interoperable" )	
	private boolean isInteroperable ;
	@Column( name="is_wearable" )
	private boolean isWearable ;
	@Column( name="has_emr_connectivity" )
	private boolean hasEmrConnectivity ;
	@Column( name="is_portable" )
	private boolean isPortable ;
	@Column( name="is_wireless" )	
	private boolean isWireless ;
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public LocalDate getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(LocalDate dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public boolean isHasTouchscreen() {
		return hasTouchscreen;
	}
	public void setHasTouchscreen(boolean hasTouchscreen) {
		this.hasTouchscreen = hasTouchscreen;
	}
	public boolean isHasAlarm() {
		return hasAlarm;
	}
	public void setHasAlarm(boolean hasAlarm) {
		this.hasAlarm = hasAlarm;
	}
	public boolean isInteroperable() {
		return isInteroperable;
	}
	public void setInteroperable(boolean isInteroperable) {
		this.isInteroperable = isInteroperable;
	}
	public boolean isWearable() {
		return isWearable;
	}
	public void setWearable(boolean isWearable) {
		this.isWearable = isWearable;
	}
	public boolean isHasEmrConnectivity() {
		return hasEmrConnectivity;
	}
	public void setHasEmrConnectivity(boolean hasEmrConnectivity) {
		this.hasEmrConnectivity = hasEmrConnectivity;
	}
	public boolean isPortable() {
		return isPortable;
	}
	public void setPortable(boolean isPortable) {
		this.isPortable = isPortable;
	}
	public boolean isWireless() {
		return isWireless;
	}
	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
	public Prod(int prodId, String prodName, double prodPrice, LocalDate dateOfManufacture, boolean hasTouchscreen,
			boolean hasAlarm, boolean isInteroperable, boolean isWearable, boolean hasEmrConnectivity,
			boolean isPortable, boolean isWireless) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.dateOfManufacture = dateOfManufacture;
		this.hasTouchscreen = hasTouchscreen;
		this.hasAlarm = hasAlarm;
		this.isInteroperable = isInteroperable;
		this.isWearable = isWearable;
		this.hasEmrConnectivity = hasEmrConnectivity;
		this.isPortable = isPortable;
		this.isWireless = isWireless;
	}
	
	
	
	
	
	
}
