import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient) { }

  sendCredentials(username:string, password:string):any {
    const url = "http://localhost:8080/token";
    const encodedCredentials = btoa(username+":"+password);
    const basicHeader = "Basic "+encodedCredentials;
    let headers = new HttpHeaders ({
      'Content-Type': 'application/x-www-form-urlencoded',
        'Authorization': basicHeader
    });
    return this.http.get(url, {headers: headers});
  }

  checkSession():any {
    const url = "http://localhost:8080/checkSession";

    let xAuthToken = localStorage.getItem("xAuthToken") || '';
    let headers = new HttpHeaders ({
      'x-auth-token': xAuthToken
    });
    return this.http.get(url, {headers: headers});
  }

  logout() {
    const url = "http://localhost:8080/user/logout";
    let xAuthToken = localStorage.getItem("xAuthToken") || '';
    let headers = new HttpHeaders ({
      'x-auth-token': xAuthToken
    });
    return this.http.post(url, '', {headers: headers});
  }
}
