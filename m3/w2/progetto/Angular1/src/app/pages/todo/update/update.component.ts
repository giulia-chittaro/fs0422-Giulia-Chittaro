import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Todo } from 'src/app/todo';
import { TodoService } from 'src/app/todo.service';


//sono sincera mi sono fatta aiutare dal santo Gral GOOGLE


@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.scss']
})
export class UpdateComponent implements OnInit {
  
  constructor( private activeRoute : ActivatedRoute, private todoSvc : TodoService, private router : Router) { }

  editodo! : Todo 

  ngOnInit(): void {

    let apiUrl:string = 'http://localhost:3000/todo'
    let id:number = Number(this.activeRoute.snapshot.paramMap.get('id'))
    fetch(apiUrl+'/'+id)
    .then(res => res.json())
      .then(todo => { 
    if(todo){
      this.edit = todo
    }else{
      this.router.navigate(['/todo'])
    }
  })
  }


  edit(){
    this.todoSvc.addTodo(this.editodo)
  }

}
