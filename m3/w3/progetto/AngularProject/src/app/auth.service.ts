import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Users } from './users';
import { Login } from './models/login'
import { Register } from './models/register';



type AuthResponse = {
  accessToken: string,
  user:Users
}

@Injectable({
  providedIn: 'root'
})

export class AuthService {

  constructor(private http:HttpClient) { }

  apiUrl:string = 'http://localhost:3000'

  register(loginData:Users){
    return this.http.post<AuthResponse>(this.apiUrl+'/users', loginData)
  }

  login(loginData:Login){
    return this.http.post<AuthResponse>(this.apiUrl+'/login', loginData)
  }

  isUserLogged():boolean{
    return localStorage.getItem('access') != null
  }

  getLoggedUser(){
    let db = localStorage.getItem('access')
    return db ? JSON.parse(db).user : null
  }
  getAccessToken(){
    let db = localStorage.getItem('access')
    return db ? JSON.parse(db).accessToken : null
  }

  saveAccessData(data:AuthResponse){
    localStorage.setItem('access',JSON.stringify(data))
  }

  logOut(){
    localStorage.removeItem('access')
  }




}
