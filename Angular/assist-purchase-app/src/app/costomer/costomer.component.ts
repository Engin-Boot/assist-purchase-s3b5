import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'costomer-comp',
  templateUrl: './costomer.component.html',
  styleUrls: ['./costomer.component.css']
})
export class CostomerComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  tochScreen(){
    console.log("tochScreen");
  }
  notTouchScreen(){
    console.log("notTouchScreen");
  }
}
