import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CostomerRoutingModule } from './costomer-routing.module';
import { Question1Component } from './question1/question1.component';


@NgModule({
  declarations: [Question1Component],
  imports: [
    CommonModule,
    CostomerRoutingModule
  ]
})
export class CostomerModule { }
