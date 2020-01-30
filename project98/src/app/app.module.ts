import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{FormsModule,ReactiveFormsModule} from '@angular/forms';
import{HttpClientModule}from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { LogoutComponent } from './logout/logout.component';
import { AdminComponent } from './admin/admin.component';
//import{UserComponent} from './user/user.component';
import{ImportdataComponent}from './admin/importdata/importdata.component';
import{ManagecompanyComponent}from'./admin/managecompany/managecompany.component';
import{ManageexchangeComponent}from './admin/manageexchange/manageexchange.component';
import{UpdateioComponent}from './admin/updateio/updateio.component';
  import { from } from 'rxjs';
  import{UserlistComponent}from './register/userlist/userlist.component';
  import{UserupdateComponent}from './register/userupdate/userupdate.component';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    AboutusComponent,
    LogoutComponent,
    AdminComponent,
    UpdateioComponent,
    ImportdataComponent,
    ManagecompanyComponent,
    ManageexchangeComponent,
    UserlistComponent,
    UserupdateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { 
  
}
