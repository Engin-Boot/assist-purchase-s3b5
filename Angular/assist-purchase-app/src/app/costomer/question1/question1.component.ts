import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'question1-comp',
  templateUrl: './question1.component.html',
  styleUrls: ['./question1.component.css']
})
export class Question1Component implements OnInit {

  constructor(private route:Router) { }

  ngOnInit(): void {
  }
  yes(){
    this.route.navigate(['costomer']);
  }
}
