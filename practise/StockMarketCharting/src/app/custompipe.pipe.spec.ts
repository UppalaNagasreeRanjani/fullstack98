import { CustompipePipe } from './custompipe.pipe';

describe('CustompipePipe', () => {
  it('create an instance', () => {
    const pipe = new CustompipePipe();
    expect(pipe).toBeTruthy();
  });
});
function greeting(){
return 'good morning!';
}
// function add(){
//   return 5;
// }
describe('greeting message',()=>
{
  let expected='';
  beforeEach(()=>{
  expected='good morning!';
  });
  afterEach(()=>{
    expected='';
  });
  it('my greeting message',()=>{
    expect(greeting()).toEqual(expected) 
   });
});
// describe('sum',()=>
// {
//   let expected='';
//   beforeEach(()=>{
//   expected=2+3;
//   });
//   afterEach(()=>{
//     expected='';
//   });
//   it('sum',()=>{
//     expect(add()).toEqual(expected) 
//    });
// });