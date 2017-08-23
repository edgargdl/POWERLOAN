
import { Injectable } from '@angular/core';
import {Http} from '@angular/http';
import { Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
import { Application } from "../model/Application";
import { ApplicationComponent } from "../application/app.application.component";



@Injectable()
export class ApplicationService
{
   
    constructor(private http:Http) {

     }

        
     public addApplication(app:Application)
    {
        let headers = new Headers({ 'Content-Type': 'application/json' });
        let options = new RequestOptions({ headers: headers });
        this.http.post("http://localhost:8080/Applications", JSON.stringify(app),options).subscribe(r=>{});

    }
       
}
        
        
    
