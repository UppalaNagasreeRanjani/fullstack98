import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import{ RegisterComponent}from './register/register.component';
import{AboutusComponent}from './aboutus/aboutus.component';
import{LogoutComponent}from './logout/logout.component';
import{AdminComponent}from './admin/admin.component';
import{UserComponent}from './user/user.component';
import { UserlistComponent } from './register/userlist/userlist.component';
import { UserupdateComponent } from './register/userupdate/userupdate.component';

 const routes: Routes = [
  {path:'home',component:HomeComponent},
  {path:'register',component:RegisterComponent} ,
 {path :'login',component:LoginComponent},
 {path:'logout',component:LogoutComponent},
 {path:'aboutus',component:AboutusComponent},
 {path:'admin',component:AdminComponent},
 {path:'user',component:UserComponent},
 {path:'userlist',component:UserlistComponent},
 {path:'userupdate',component:UserupdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
