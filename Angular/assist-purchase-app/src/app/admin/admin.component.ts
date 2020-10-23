import { Component,Inject, OnInit } from '@angular/core';
import{ ProductService} from '../service/productServices'
@Component({
  selector: 'admin-comp',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  prodId:any="" ;
  prodName:string ="";
  prodPrice:string ="";
	dateOfManufacture:any ;
  hasTouchscreen:boolean=false ;
  hasAlarm:boolean=false  ;
	isInteroperable:boolean =false ;
  isWearable:boolean =false ;
	hasEmrConnectivity:boolean =false ;
  isPortable:boolean =false ;
  isWireless:boolean =false ;
  req={};
  ProductServiceRef:ProductService;
  constructor(@Inject("ProductService")ProductServiceRef:ProductService) { 
    this.ProductServiceRef=ProductServiceRef;
  }

  ngOnInit(): void {
  }
  addProduct(){
    this.req={
      "prodId":this.prodId,
      "prodName":this.prodName,
      "prodPrice":this.prodPrice,
      "dateOfManufacture":this.dateOfManufacture,
      "hasTouchscreen":this.hasTouchscreen,
      "hasAlarm":this.hasAlarm,
      "isInteroperable":this.isInteroperable,
      "isWearable":this.isWearable,
      "hasEmrConnectivity":this.hasEmrConnectivity,
      "isPortable":this.isPortable,
      "isWireless":this.isWireless
    }
    console.log(this.req);
    let observableStream=this.ProductServiceRef.addProduct(this.req);
    observableStream.subscribe((data:any)=>{
     console.log(data.message);
    },
    (error)=>{
      console.log(error);
    },
    ()=>{
      console.log("Request Completed");
    });
  }
}
