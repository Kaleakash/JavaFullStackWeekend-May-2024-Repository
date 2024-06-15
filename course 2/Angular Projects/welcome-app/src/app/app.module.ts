import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { MainComponent } from './main/main.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { StringInterpolationComponent } from './string-interpolation/string-interpolation.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    MainComponent,
    DataBindingComponent,
    StringInterpolationComponent
  ],
  imports: [
    BrowserModule
  ],
  //providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }