import { Component,Inject, OnInit } from '@angular/core';
import {ProductService} from '../service/productServices';
@Component({
  selector: 'home-comp',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  productServiceRef:ProductService;
  pid:string="2";
  message = {};
  constructor(@Inject("ProductService")productServiceRef:ProductService) {
    this.productServiceRef=productServiceRef;
   }
  ngOnInit(): void {
  }
costomer(){
  let observableStream=this.productServiceRef.viewall();
    observableStream.subscribe(response =>{ console.log(this.message=response[0])});
    this.pid=this.message["prodId"];
  console.log("pid "+this.pid);
    console.log("pid "+this.message["prodId"]);
    
}
admin(){
  console.log("admin");
}
}
