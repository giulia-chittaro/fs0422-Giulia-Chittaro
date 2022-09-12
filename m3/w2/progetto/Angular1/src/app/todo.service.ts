import { Injectable } from '@angular/core';
import { Todo } from './todo';

@Injectable({
  providedIn: 'root'
})
export class TodoService {
  edit(editodo: Todo) {
    throw new Error('Method not implemented.');
  }

  constructor() { }

  apiUrl : string = 'http://localhost:3000/todo'


  getallTodo() : Promise<Todo[]> {
    return new Promise<Todo[]>((resolve, reject) => {
      setTimeout(() =>{
        let call = fetch(this.apiUrl).then(res => res.json())
        resolve(call)
      },2000)
  })
  }

  addTodo(todo : Todo) : void{
    fetch(this.apiUrl, {
      method: 'POST',
      body: JSON.stringify(todo),
      headers:{
        "content-type":"application/json"
    }
    })
    .then(res => res.json())
}

deleteTodo(todo : Todo): void {
  fetch(this.apiUrl+'/'+todo.id,{
    method: 'DELETE',
    body: JSON.stringify(todo),
    headers:{
        "content-type":"application/json"
    }})
    .then(res => res.json())
}

completedTodo(todo:Todo):void{
  fetch(this.apiUrl+'/'+todo.id,{
  method: 'PUT',
  body: JSON.stringify(todo),
  headers:{
      "content-type":"application/json"
  }})
  .then(res => res.json())
}




  }





