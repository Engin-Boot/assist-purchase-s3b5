import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import {ProductService} from './service/productServices';
import { HttpClientModule } from '@angular/common/http';
import { CostomerComponent } from './costomer/costomer.component';
import { AdminComponent } from './admin/admin.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CostomerComponent,
    AdminComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    CommonModule
  ],
  providers: [{provide:'apiBaseAddress',useValue:"http://localhost:8082"},
  {provide:'ProductService',useClass:ProductService}],
  bootstrap: [AppComponent]
})
export class AppModule { }
