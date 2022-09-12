import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/todo';
import { TodoService } from 'src/app/todo.service';

@Component({
  selector: 'app-completed',
  templateUrl: './completed.component.html',
  styleUrls: ['./completed.component.scss']
})
export class CompletedComponent implements OnInit {

  constructor(private todoSvc:TodoService) { }

  allTodo : Todo[] = [];
  ngOnInit(): void {
    this.mostratodocompleted();
  }

  mostratodocompleted(){

    this.todoSvc.getallTodo().then(todo => { let check = todo.filter(todo =>todo.completed == true)
      this.allTodo = check
    })
  }

  completa(todo : Todo){
    if (todo.completed == false){
      todo.completed = true
      this.todoSvc.completedTodo(todo)
    }

}



}
