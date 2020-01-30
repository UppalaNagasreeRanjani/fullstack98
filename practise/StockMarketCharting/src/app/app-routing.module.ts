import { NgModule} from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { LoginFormComponent } from './login-form/login-form.component';
import { LogoutComponent } from './logout/logout.component';
//import { RegistrationformComponent } from './registrationform/registrationform.component';
import { HomeComponent } from './home/home.component';
import { UserComponent } from './user/user.component';
import { RegisterComponent } from './user/register/register.component';
import { UpdateUserComponent } from './user/update-user/update-user.component';
import { PipeComponent } from './pipe/pipe/pipe.component';


const routes: Routes = [
 {path:'register',component:RegisterComponent} ,
 {path :'login',component:LoginFormComponent},
 {path:'logout',component:LogoutComponent},
 {path:'',component:HomeComponent},
 {path:'user',component:UserComponent},
 {path:'update-user',component:UpdateUserComponent},
 {path:'pipe',component:PipeComponent}
 
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports:[RouterModule]
})
export class AppRoutingModule { 

}
