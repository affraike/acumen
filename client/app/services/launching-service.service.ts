import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class LaunchingService {

  constructor(private http: HttpClient) { }

  areYouHere(): void {
    this.http.get('server', {responseType: 'text'})
        .subscribe(response => console.log(response));
  }
}
