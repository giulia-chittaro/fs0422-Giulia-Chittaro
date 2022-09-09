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

  allTodo : Todo[] = [];
  newTodo : Todo = new Todo('', false);

  constructor(
    private todoSvc : TodoService) 
    { }

  ngOnInit(): void {
    this.getalltodo()
  }

  addtodo():void{

    this.todoSvc.addTodo(this.newTodo)
    this.newTodo = new Todo('', false)

  }

  getalltodo():void{
  this.todoSvc.getallTodo()
    .then(res => {
      this.allTodo = res
    })

  }




}
