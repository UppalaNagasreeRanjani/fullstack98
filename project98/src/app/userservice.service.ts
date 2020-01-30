import { Injectable } from '@angular/core';
import {USERS} from './module/mock';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';
import { User } from '../../src/app/module/user';
@Injectable({
  providedIn: 'root'
})
export class UserserviceService {
  httpUrl="http://localhost:1111/users";
   constructor(private httpClient:HttpClient) { }
   getAllUsers():Observable<User[]>{
    return this.httpClient.get<User[]>(this.httpUrl);
  }
}
