import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { MyService } from '../custom.service';

@Component({
  selector: 'app-tdf-login',
  templateUrl: './tdf-login.component.html',
  styleUrls: ['./tdf-login.component.css']
})
export class TdfLoginComponent {
msg:string ="";
  checkUser(logingRef:NgForm): void {
    console.log("event fired")
    console.log(logingRef.value)
    let login = logingRef.value;
   alert(JSON.stringify(logingRef.value))
    // if(login.emailid=="akash@gmail.com" && login.password=="123"){
    //     this.msg="successfully login";
    // }else {
    //   this.msg="failure";
    // }
    let obj = new MyService();
    this.msg = obj.checkUserInfo(login);
    logingRef.reset();
  }
}



