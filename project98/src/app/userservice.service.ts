import { Injectable } from '@angular/core';
import {USERS} from './module/mock';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';
//import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class UserserviceService {
  naga=USERS;
  getAllUsers(){
      return this.naga;
     }

  constructor() { }
}
