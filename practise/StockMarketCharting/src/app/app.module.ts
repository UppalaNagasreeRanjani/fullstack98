import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HomeComponent } from './home/home.component';
import { LoginFormComponent } from './login-form/login-form.component';
//import { RegistrationformComponent } from './registrationform/registrationform.component';
import { LogoutComponent } from './logout/logout.component';
import { UserComponent } from './user/user.component';
import{HttpClientModule}from '@angular/common/http';
import { RegisterComponent } from './user/register/register.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { UpdateUserComponent } from './user/update-user/update-user.component';


@NgModule({
  declarations: [
    AppComponent,
  
    HomeComponent,
    LoginFormComponent,
  
    LogoutComponent,
    UserComponent,
    RegisterComponent,
    UpdateUserComponent
    
    
  

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
