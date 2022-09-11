import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/todo';
import { TodoService } from 'src/app/todo.service';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.scss']
})
export class CreateComponent implements OnInit {
 

  constructor(private todoSvc : TodoService) { }

  newTodo : Todo = new Todo ('');

  ngOnInit(): void {
  }

  aggiungi(){
    this.todoSvc.addTodo(this.newTodo)
  }
  



}
