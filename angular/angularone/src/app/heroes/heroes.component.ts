import { Component, OnInit } from '@angular/core';
import { Hero} from './hero';
import { HEROES} from './models/heroes';
@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
export class HeroesComponent implements OnInit {
  hero: Hero = {
    id: 101,
    name: 'Sri'
  };
  heroes = HEROES;
  constructor() { }

  ngOnInit() {
  }

}
