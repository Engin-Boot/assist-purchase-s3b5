import { Component, OnInit ,Inject} from '@angular/core';
import { Router } from '@angular/router';
import{ ProductService} from '../service/productServices';

@Component({
  selector: 'costomer-comp',
  templateUrl: './costomer.component.html',
  styleUrls: ['./costomer.component.css']
})
export class CostomerComponent implements OnInit {
  question:string="";
  qno:number=1;
  ProductServiceRef:ProductService;
  static result:any;
  questions:any={
    "1":"touch screen device",
    "2":"alaram in a device",
    "3":"Interoperable device",
    "4":"Wearable device",
    "5":"Emr Connectivity for the device",
    "6":"Portable device",
    "7":"Wireless device"
  };
  static spec:any={
    "prodId":"1",
      "hasTouchscreen":false,
      "hasAlarm":false,
      "isInteroperable":false,
      "isWearable":false,
      "hasEmrConnectivity":false,
      "isPortable":false,
      "isWireless":false
  };
  mapping:any={
    "1":"hasTouchscreen",
    "2":"hasAlarm",
    "3":"isInteroperable",
    "4":"isWearable",
    "5":"hasEmrConnectivity",
    "6":"isPortable",
    "7":"isWireless"
  };
  constructor(private route:Router,@Inject("ProductService")ProductServiceRef:ProductService) { 
    this.question=this.questions[this.qno.toString()];
    this.ProductServiceRef=ProductServiceRef;
  }

  ngOnInit(): void {
  }
  yes(){
    CostomerComponent.spec[this.mapping[this.qno.toString()]]=true;
    this.updatenextQuestionToUI();
  }
  no(){
    this.updatenextQuestionToUI();
  }
  both(){
    CostomerComponent.spec[this.mapping[this.qno.toString()]]=null;
    this.updatenextQuestionToUI();
  }
  updatenextQuestionToUI(){
    this.qno++;
    if(this.qno>7){
      let ret=this.viewProduct();
      console.log(ret);
      this.route.navigate(['costomer/view']);
    }
    this.question=this.questions[this.qno.toString()];
  }
  viewProduct(){
    console.log(CostomerComponent.spec);
    let observableStream=this.ProductServiceRef.view(CostomerComponent.spec);
    observableStream.subscribe(val => {
      CostomerComponent.result=val;
    });
    return CostomerComponent.result;
  }
  }
