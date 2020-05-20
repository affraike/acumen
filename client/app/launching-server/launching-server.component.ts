import { Component, OnInit } from '@angular/core';
import { LaunchingService } from '../services/launching-service.service';

@Component({
  selector: 'app-launching-server',
  templateUrl: './launching-server.component.html',
  styleUrls: ['./launching-server.component.css']
})
export class LaunchingServerComponent implements OnInit {
  statusServer;

  constructor(public launch: LaunchingService) { }

  ngOnInit() {
  }

  getStatusServer(){
    this.launch.areYouHere()
  }
}
