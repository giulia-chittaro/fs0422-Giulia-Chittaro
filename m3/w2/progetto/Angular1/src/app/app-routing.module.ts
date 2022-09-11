import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CompletedComponent } from './pages/completed/completed.component';
import { TodoComponent } from './pages/todo/todo.component';
import { UpdateComponent } from './pages/todo/update/update.component';

const routes: Routes = [
  {
  path: 'todo',
  component : TodoComponent,
},
{
  path: 'completed',
  component : CompletedComponent,
},
{
  path: 'update/:id',
  component : UpdateComponent
},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
