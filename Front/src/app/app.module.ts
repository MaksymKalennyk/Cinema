import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { CinemaComponent } from './cinema/cinema.component';
import {RouterModule, Routes} from "@angular/router";
import { SessionComponent } from './cinema/session/session.component';

const routes: Routes = [
  {
    path: '',
    component: SessionComponent,
    children: [
      { path: 'session', component: SessionComponent },
    ],
  },
];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CinemaComponent,
    SessionComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
  ],
  exports: [RouterModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
