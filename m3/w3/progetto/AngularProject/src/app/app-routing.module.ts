import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { NewPostComponent } from './pages/posts/new-post/new-post.component';
import { PostsComponent } from './pages/posts/posts.component';
import { UsersComponent } from './pages/users/users.component';
import { RegisterComponent } from './auth/register/register.component';
import { AuthGuard } from './auth.guard';

const routes: Routes = [
  {
    path: '',
    component : HomeComponent,
  },
  {
    path:'dashboard',
    component : DashboardComponent,
    
  },
  {
    path:'signIn',
    component : RegisterComponent
  },
  {
    path : 'newPost',
    component : NewPostComponent
  },
  {
    path:'posts',
    component : PostsComponent
  },
  {
    path:'users',
    component : UsersComponent,
    canActivate: [AuthGuard]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
