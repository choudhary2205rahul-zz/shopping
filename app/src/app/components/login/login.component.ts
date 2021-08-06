import { Component, OnInit } from '@angular/core';
import {LoginService} from "../../services/login.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  credentials = {username:'', password: ''}
  loggedIn:boolean = false;

  constructor(private loginService:LoginService) { }

  ngOnInit(): void {
    this.loginService.checkSession().subscribe((res:any) => {
      this.loggedIn = true;
    }, (error: any) => {
      this.loggedIn = false;
    })
  }

  onSubmit() {
    this.loginService.sendCredentials(this.credentials.username, this.credentials.password).subscribe((res: { token: string; }) => {
      console.log(res);
      localStorage.setItem("xAuthToken", res.token);
      this.loggedIn=true
    }, (error: any) => {
      console.log(error);
    });
  }

}
