import { Component } from '@angular/core';
import { FakeService } from '../fake.service';

@Component({
  selector: 'app-fake',
  templateUrl: './fake.component.html',
  styleUrls: ['./fake.component.css']
})
export class FakeComponent {

  constructor(public fs:FakeService){  // DI for FakeService 

  }

  loadFakeData(): void {
    //alert("event fired")
    this.fs.loadFakeService();    // calling service layer 
  }
}
