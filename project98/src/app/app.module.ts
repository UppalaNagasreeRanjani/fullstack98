import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{FormsModule,ReactiveFormsModule} from '@angular/forms';
//import{HttpClientModule}from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { LogoutComponent } from './logout/logout.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { AdminImportdataComponent } from './admin-importdata/admin-importdata.component';
import { ImportdataComponent } from './admin/importdata/importdata.component';
import { ManagecompanyComponent } from './admin/managecompany/managecompany.component';
import { ManageexchangeComponent } from './admin/manageexchange/manageexchange.component';
import { UpdateioComponent } from './updateio/updateio.component';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    AboutusComponent,
    LogoutComponent,
    AdminComponent,
    UserComponent,
    AdminImportdataComponent,
    ImportdataComponent,
    ManagecompanyComponent,
    ManageexchangeComponent,
    UpdateioComponent,
  
    //HttpClientModule
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
