export class Users {

    id:number | undefined;
    email:string;
    password?:string | undefined;
    constructor(email:string, password:string | undefined) {
       
        this.email = email;
    this.password = password
       
  }
}
