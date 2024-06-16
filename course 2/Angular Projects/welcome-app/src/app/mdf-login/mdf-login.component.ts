import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

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

msg:string ="";
checkUser():void {
  //alert("event fired")
  let login = this.loginRef.value;
  if(login.emailid=="akash@gmail.com" && login.password=="123"){
      this.msg="successfully login"
  }else {
      this.msg="failure try once again"
  }
  this.loginRef.reset();
}

}
