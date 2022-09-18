import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/auth.service';
import { Register } from 'src/app/models/register';
import { Users } from 'src/app/users';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  form!: FormGroup
  isFormValid!: boolean;
  
  constructor(private auth: AuthService, private router: Router) { }

  ngOnInit(): void {
    this.form = new FormGroup({
      name: new FormControl(null, Validators.required),
      email: new FormControl(null, Validators.required),
      password: new FormControl(null, Validators.required)
    })
  }

  save() : void {
    if(this.form.valid){
      this.auth.register(this.form.value)
      .subscribe(res => { alert(`user ${res.user.email} registred successfully`) 
      //so che non vuoi Alert ma sono impazzita dietro a Sweet Alert!!
        this.auth.saveAccessData(res)
        this.form.reset();
        this.router.navigate(['/dashboard']);
      })
    
  }



}
}
