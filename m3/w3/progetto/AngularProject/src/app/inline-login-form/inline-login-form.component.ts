import { Component, OnInit } from '@angular/core';
import { UntypedFormBuilder, UntypedFormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';


@Component({
  selector: 'app-inline-login-form',
  templateUrl: './inline-login-form.component.html'
})
export class InlineLoginFormComponent implements OnInit {
  validateForm!: UntypedFormGroup;
 
  constructor(private fb: UntypedFormBuilder, private router: Router ) {}

  ngOnInit(): void {
    this.validateForm = this.fb.group({
      userName: [null, [Validators.required]],
      password: [null, [Validators.required]],
      remember: [true]
    });
  }

  submitForm(): void {
   
    this.router.navigate(['/dashboard'])
  }

  signIn() : void {

    this.router.navigate(['/signIn'])

  }

  
  

}
