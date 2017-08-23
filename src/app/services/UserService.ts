
import { Injectable } from '@angular/core';
import {Http, Response} from '@angular/http';
import { Headers, RequestOptions } from '@angular/http';
import { User } from "../model/User";
import { RouterModule, Routes } from '@angular/router';
import { Credentials } from "../model/Credentials";
import {Observable} from 'rxjs/Rx';
// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';




@Injectable()
export class UserService
{
    constructor(private http:Http) {
        
    }

    public loginService(credential:Credentials):Observable<User>
    {
        let headers = new Headers({ 'Content-Type': 'application/json' });
        let options = new RequestOptions({ headers: headers });        
        return this.http.post
        ("http://localhost:8090/Users/"+credential.username, JSON.stringify(credential),options)
        .map((res) => res.json())
        .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
    };

 
    public addUserervice(usr:User):Observable<User>
    {
        let headers = new Headers({ 'Content-Type': 'application/json' });
        let options = new RequestOptions({ headers: headers });
        return this.http.post("http://localhost:8090/Users", JSON.stringify(usr),options).map((res) => res.json()).catch((error:any) => Observable.throw(error.json().error || 'Server error'));
    }

}