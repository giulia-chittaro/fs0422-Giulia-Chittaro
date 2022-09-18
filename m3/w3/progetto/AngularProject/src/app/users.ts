export class Users {

    id:number | undefined;
    email:string;
    password?:string | undefined;
    name?:string ;
    surname?:string ;
    constructor(email:string, password:string | undefined) {
       
        this.email = email;
    this.password = password
       
  }
}
