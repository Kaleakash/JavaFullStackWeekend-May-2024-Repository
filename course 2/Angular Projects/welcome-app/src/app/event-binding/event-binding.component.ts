import { Component } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent {
  msg:string ="Hi";

  fun1(): void {
    //alert("event fired")
    this.msg="hello..."
  }


}
