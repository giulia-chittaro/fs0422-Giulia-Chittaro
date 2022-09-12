import { getLocaleCurrencyCode } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/todo';
import { TodoService } from 'src/app/todo.service';


@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.scss']
})
export class TodoComponent implements OnInit {

  constructor(
    private todoSvc : TodoService) 
    { }
    
    allTodo : Todo[] = [];
    newTodo : Todo = new Todo ('');

  ngOnInit(): void {
    this.getallTodo();
    
  }

  getallTodo(): void {
    this.todoSvc.getallTodo()
    .then(res => {
      this.allTodo = res
    })
  }

  aggiungi(){
    this.todoSvc.addTodo(this.newTodo)
    setTimeout(() => {
      this.getallTodo();
    },100)
  }

  elimina(todo : Todo){
    this.todoSvc.deleteTodo(todo)
    setTimeout(() => {
      this.getallTodo();
    },100)
  }
  
  completa(todo : Todo){
    if (todo.completed == false){
      todo.completed = true
      this.todoSvc.completedTodo(todo)
    }

}
}