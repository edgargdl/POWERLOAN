import { Component, OnInit } from '@angular/core';
import { Application } from "../model/Application";
import { ApplicationService } from "../services/ApplicationService";


@Component({
  selector: 'app-application',
  templateUrl: './app.application.component.html',
  providers:[ApplicationService]
})


export class ApplicationComponent {

    app = new Application();
    constructor(private applicationService: ApplicationService) 
    {  
         alert("entered");
    }


   public addApp()
    {
        this.applicationService.addApplication(this.app);
    } 

}