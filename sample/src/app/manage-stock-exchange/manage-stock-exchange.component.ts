import { Component, OnInit } from '@angular/core';
import { CompanyService } from 'src/app/services/company.service';
import { Router } from '@angular/router';
import { Company } from 'src/app/models/company';
import { StockExchangeService } from 'src/app/services/stock-exchange.service';
import { StockExchange } from 'src/app/models/stock-exchange';

@Component({
  selector: 'app-manage-stock-exchange',
  templateUrl: './manage-stock-exchange.component.html',
  styleUrls: ['./manage-stock-exchange.component.css']
})
export class ManageStockExchangeComponent implements OnInit {

  ses:StockExchange[];

  constructor(private seService:StockExchangeService,private router:Router) { }

  ngOnInit() {
    this.seService.getAllStockExchanges().subscribe(data=>{
      this.ses=data;
    });
  }

  updateStockExchange(se:StockExchange){
    localStorage.removeItem('seId');
    localStorage.setItem('seId',se.id.toString());
    this.router.navigate(['update-stock-exchange']);
  }

}
