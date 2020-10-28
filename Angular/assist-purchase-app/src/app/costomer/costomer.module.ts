import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';
import { CostomerRoutingModule } from './costomer-routing.module';
import { ViewComponent } from './view/view.component';


@NgModule({
  declarations: [ViewComponent],
  imports: [
    BrowserModule,
    CommonModule,
    CostomerRoutingModule,
    ViewComponent
  ]
})
export class CostomerModule { }
