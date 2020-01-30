import { Pipe, PipeTransform } from '@angular/core';
import { Message } from '@angular/compiler/src/i18n/i18n_ast';
import { stringify } from 'querystring';

@Pipe({
  name: 'pipecustom'
})
export class CustompipePipe implements PipeTransform {

  transform(digit:number ,power:number): any {
    return Math.pow(digit,power);
  //return msg.length;
  }


}
