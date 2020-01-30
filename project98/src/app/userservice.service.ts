import { Injectable } from '@angular/core';
import {USERS} from './module/mock';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';
import { User } from '../../src/app/module/user';
@Injectable({
  providedIn: 'root'
})
export class UserserviceService {
  httpUrl="http://localhost:3000/users/";
   constructor(private httpClient:HttpClient) { }
   getAllUsers():Observable<User[]>{
    return this.httpClient.get<User[]>(this.httpUrl);
  }
  saveUser(user:User): Observable<User>{
    return this.httpClient.post<User>(this.httpUrl,user);
  }
  deleteUser(id:number):Observable<User>{
    return this.httpClient.delete<User>(this.httpUrl+id);
  }
  updateUserInfo(user:User):Observable<User>{
    return this.httpClient.put<User>(this.httpUrl+user.id,user);
  }
  getUserByID(id:number):Observable<User>{
    return this.httpClient.get<User>(this.httpUrl+id);
  }
}
