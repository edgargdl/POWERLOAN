import { Component, OnInit } from '@angular/core';
import { UserService } from "../services/UserService";
import { Credentials } from "../model/Credentials";
import { Observable } from 'rxjs/Observable';
import { User } from "../model/User";
import { Router,
  NavigationExtras } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
   providers:[UserService], 
})

export class LoginComponent  {


credentials = new Credentials();

private user = new User();

 private anyErrors: boolean;
 private finished: boolean;

 constructor(private userService: UserService, private router:Router ) { }

login(){
  let navigationExtras: NavigationExtras = {
    queryParamsHandling: 'preserve',
    preserveFragment: true
  };

  this.userService.loginService(this.credentials).subscribe(
    response => {
      this.user = response;
      alert("reached 3" + JSON.stringify(response));
      this.router.navigate(["/main"], navigationExtras);
    },
    error => { console.log("Error happened" + error)}
    );      
    
}
}
