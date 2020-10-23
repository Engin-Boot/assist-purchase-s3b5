import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import {CostomerComponent} from './costomer/costomer.component';
import{AdminComponent} from './admin/admin.component';
import {Question1Component} from './costomer/question1/question1.component';

const routes: Routes = [
  {path:"",redirectTo:'home',pathMatch:'full'},
  {path:"home",component:HomeComponent},
  {path:"costomer",component:CostomerComponent},
  {path:"admin",component:AdminComponent},
  {path:"costomer/next1",component:Question1Component}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
