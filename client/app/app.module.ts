import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { LaunchingServerComponent } from './launching-server/launching-server.component';
import { LaunchingService } from './services/launching-service.service';

@NgModule({
  declarations: [
    AppComponent,
    LaunchingServerComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    HttpClientModule,

  ],
  providers: [LaunchingService],
  bootstrap: [AppComponent]
})
export class AppModule { }
