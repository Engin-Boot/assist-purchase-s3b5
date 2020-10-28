import { Component, OnInit ,Inject} from '@angular/core';
import {ActivatedRoute} from '@angular/router'
import { Subscription } from 'rxjs';
import {CostomerComponent} from '../costomer.component';
import{ ProductService} from '../service/productServices';

@Component({
  selector: 'view-comp',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit{
  unsubcriptionRef:Subscription;
  products:any={};
  prodContent:any;
  email:string="";
  name:string="";
  ProductServiceRef:ProductService;
  constructor(private acr:ActivatedRoute,@Inject("ProductService")ProductServiceRef:ProductService) {
    console.log(CostomerComponent.result);
    this.products=CostomerComponent.result;
    this.ProductServiceRef=ProductServiceRef;
   }

  ngOnInit(): void {
    this.products=CostomerComponent.result;
  }
  sendMail(){
    let observableStream=this.ProductServiceRef.sendMail(this.email+" "+this.name);
    observableStream.subscribe(val => console.log(val));
  }
}
