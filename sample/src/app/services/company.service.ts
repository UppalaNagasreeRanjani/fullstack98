import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Company } from 'src/app/models/company';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class CompanyService {

  httpUrl="http://localhost:3000/companies/";

  constructor(private httpClient:HttpClient) { }

  saveCompany(company:Company):Observable<Company>{
    return this.httpClient.post<Company>(this.httpUrl, company);
  }

  removeCompany(id:number):Observable<Company>{
    return this.httpClient.delete<Company>(this.httpUrl + id);
  }

  getAllCompanies():Observable<Company[]>{
    return this.httpClient.get<Company[]>(this.httpUrl);
  }

  getCompanyById(id:number):Observable<Company>{
    return this.httpClient.get<Company>(this.httpUrl + id);
  }

  updateCompany(company:Company):Observable<Company>{
    return this.httpClient.put<Company>(this.httpUrl + company.id,company);
  }

}
