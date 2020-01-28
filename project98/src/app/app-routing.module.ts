import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import{ RegisterComponent}from './register/register.component';
import{AboutusComponent}from './aboutus/aboutus.component';
import{LogoutComponent}from './logout/logout.component';


const routes: Routes = [
  {path:'register',component:RegisterComponent} ,
 {path :'login',component:LoginComponent},
 {path:'logout',component:LogoutComponent},
 {path:'',component:HomeComponent},
 {path:'aboutus',component:AboutusComponent},
 {path:'logout',component:LogoutComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
