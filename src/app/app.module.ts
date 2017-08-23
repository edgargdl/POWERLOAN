import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './root/app.component';
import {HttpModule} from '@angular/http';
import { ApplicationComponent } from "./application/app.application.component";
import {HttpClientModule} from '@angular/common/http';
import { UserComponent } from "./user/app.user.component";
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { OptionsComponent } from './options/options.component';
import { EmitterService } from "./services/EmmiterService";
import { MainComponent } from './main/main.component';
import { BuyingMainComponent } from './buying-main/buying-main.component';


const appRoutes: Routes = [
  { path: 'applications', component: ApplicationComponent },
  { path: 'users', component: UserComponent },
  { path: 'login', component: LoginComponent },
   { path: '', component: OptionsComponent },
   { path: 'main', component: MainComponent },
   { path: 'buying', component: BuyingMainComponent }
];

@NgModule({
  declarations: [
    AppComponent,ApplicationComponent, UserComponent, LoginComponent, OptionsComponent, MainComponent, BuyingMainComponent
  ],
  

  imports: [
    BrowserModule, FormsModule,HttpModule,HttpClientModule,
    RouterModule.forRoot(
      appRoutes,
      {  } // <-- debugging purposes only
    )
  ],
  providers: [EmitterService],
  bootstrap: [AppComponent]
})
export class AppModule { }
