import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import {CostomerComponent} from './costomer/costomer.component';
import{AdminComponent} from './admin/admin.component';
import {ViewComponent} from './costomer/view/view.component';

const routes: Routes = [
  {path:"",redirectTo:'home',pathMatch:'full'},
  {path:"home",component:HomeComponent},
  {path:"costomer",component:CostomerComponent},
  {path:"admin",component:AdminComponent},
  {path:"costomer/view",component:ViewComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
