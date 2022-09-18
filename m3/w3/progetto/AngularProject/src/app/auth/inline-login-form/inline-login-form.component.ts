import { Component, OnInit } from '@angular/core';
import { UntypedFormBuilder, UntypedFormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Login } from '../../models/login';
import { AuthService } from '../../auth.service';


@Component({
  selector: 'app-inline-login-form',
  templateUrl: './inline-login-form.component.html'
})
export class InlineLoginFormComponent implements OnInit {
  validateForm!: UntypedFormGroup;

 
  constructor(private fb: UntypedFormBuilder, private router: Router, private auth:AuthService ) {}

  ngOnInit(): void {
    this.validateForm = this.fb.group({
      userName: [null, [Validators.required]],
      password: [null, [Validators.required]],
      remember: [true]
    });
  }

  loginData:Login = {
    email:'luqujer@mailinator.com',
    password:'Pa$$w0rd!',
  }

  submitForm(): void {
    this.auth.login(this.loginData)
    .subscribe(res=>{
        this.auth.saveAccessData(res)
    this.router.navigate(['/dashboard'])
  })
}
  signIn() : void {

    this.router.navigate(['/signIn'])

  }

}