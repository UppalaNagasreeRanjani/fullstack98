import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule}from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { RedDirective } from './red.directive';
import { FormComponent } from './form/form.component';
import { LoginComponent } from './login/login.component';
@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    RedDirective,
    FormComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
