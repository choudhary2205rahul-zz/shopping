import { Component, OnInit } from '@angular/core';
import {LoginService} from "../../services/login.service";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  loggedIn:boolean = false;

  constructor(private loginService:LoginService) { }

  ngOnInit(): void {
    this.loginService.checkSession().subscribe((res:any) => {
      console.log("check-session is successful");
      this.loggedIn = true;
    }, (error: any) => {
      console.log("check-session is not successful");
      console.log(error);
      this.loggedIn = false;
    })
  }

  logout() {
    this.loginService.logout().subscribe((res:any) => {
      console.log("logout is successful");
      this.loggedIn = false;
      localStorage.clear();
    }, (error: any) => {
      console.log("logout is not successful");
      console.log(error);
      this.loggedIn = true;
    })
  }

}
