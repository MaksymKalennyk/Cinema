import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Session} from "./Session";


@Injectable()
export class HttpService{
  constructor(private readonly http: HttpClient) { }

  getSession(){
    return this.http.get<Session[]>("http://localhost:8080/session/find/all");
  }
}
