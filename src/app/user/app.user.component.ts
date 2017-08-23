import { Component, OnInit } from '@angular/core';
import { User } from "../model/User";
import { UserService } from "../services/UserService";
import { Cookie } from 'ng2-cookies/ng2-cookies';
import { RouterModule, Routes, Router, NavigationExtras } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './app.user.component.html',
  providers:[UserService]
})


export class UserComponent {

    status = new String("Not sent");

    usr = new User();
    constructor(private userService: UserService, private router:Router) 
    {  
        alert("entered");
    }


   public addUser()
    {
        let navigationExtras: NavigationExtras = {
            queryParamsHandling: 'preserve',
            preserveFragment: true
          };
        this.userService.addUserervice(this.usr).subscribe(
            response => {
              this.usr = response;
              this.router.navigate(["/applications"], navigationExtras);
            },
            error => { console.log("Error happened" + error)}
            );      


    } 

}