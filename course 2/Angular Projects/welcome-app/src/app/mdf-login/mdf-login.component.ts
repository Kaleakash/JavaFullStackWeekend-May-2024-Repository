import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { MyService } from '../custom.service';

@Component({
  selector: 'app-mdf-login',
  templateUrl: './mdf-login.component.html',
  styleUrls: ['./mdf-login.component.css']
})
export class MdfLoginComponent {

loginRef = new FormGroup({
  emailid:new FormControl(),
  password:new FormControl()
});
// constructor(){
//   this.loginRef.get("emailid")?.setValue("akash@gmail.com");
// }
msg:string ="";
checkUser():void {
  
  //alert("event fired")
  let login = this.loginRef.value;
  // if(login.emailid=="akash@gmail.com" && login.password=="123"){
  //     this.msg="successfully login"
  // }else {
  //     this.msg="failure try once again"
  // }
  let obj = new MyService();
  this.msg = obj.checkUserInfo(login);
  this.loginRef.reset();
}

}


