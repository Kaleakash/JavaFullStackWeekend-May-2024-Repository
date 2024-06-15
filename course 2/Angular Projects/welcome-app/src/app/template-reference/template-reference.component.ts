import { Component } from '@angular/core';

@Component({
  selector: 'app-template-reference',
  templateUrl: './template-reference.component.html',
  styleUrls: ['./template-reference.component.css']
})
export class TemplateReferenceComponent {
  msg:string="";
  passValue(nameRef:any): void {
    let name = nameRef.value;
    alert("welcome user "+name)
  }

  checkUser(a:any,b:any):void {
    //console.log(a)
    let emailid = a.value;
    let passowrd = b.value;
   
    if(emailid=="akash@gmail.com" && passowrd=="123"){
        this.msg="success"
    }else {
        this.msg="failure"
    }

    a.value=""    // we want reset value in text field 
    b.value=""
  }
}
