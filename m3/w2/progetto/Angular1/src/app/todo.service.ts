import { Injectable } from '@angular/core';
import { Todo } from './todo';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  constructor() { }

  apiUrl : string = 'http://localhost:3000/todo'

  allTodo : Todo[] = [];

  getallTodo() : Promise<Todo[]> {
    return new Promise<Todo[]>((resolve, reject) => {
      setTimeout(() =>{
        let call = fetch(this.apiUrl).then(res => res.json())
        resolve(call)
      },2000)
  })
  }

  addTodo(todo : Todo) : Promise <Todo[]>{
    return new Promise((resolve, reject) => {
      setTimeout(() =>{

    let todoCreate = Object.assign({},todo)

    let option = {
      method : 'POST',
      body : JSON.stringify(todoCreate),
      headers : {'content-type': 'application/json'},
    };
    resolve(fetch('apiUrl', option).then((res) => res.json()))
  },2000)
})
}

deleteTodo(id:number| undefined):Promise<Todo[]> {
  return new Promise((resolve, reject) => {
    setTimeout(() =>{
      let option = {
        method: 'DELETE',
        headers: {
          'content-type': 'application/json',
        },
      };

      resolve(fetch('apiUrl'+id, option).then((res) => res.json()))
    },2000)
  })
}

  }





