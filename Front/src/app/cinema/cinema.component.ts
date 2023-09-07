import { Component } from '@angular/core';
import {Session} from "./Session";
import {HttpService} from "./HttpService";

@Component({
  selector: 'app-cinema',
  templateUrl: './cinema.component.html',
  styleUrls: ['./cinema.component.css']
})
export class CinemaComponent {

  sessions: Session[] = [];

  items = new Array(9);

  constructor(private httpService: HttpService) { }

  ngOnInit(): void {
    this.httpService.getSession().subscribe((data: Session[]) => {
      this.sessions = data;
    });
  }

}
