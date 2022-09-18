import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { NewPostComponent } from './pages/posts/new-post/new-post.component';
import { PostsComponent } from './pages/posts/posts.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { NewUserComponent } from './pages/users/new-user/new-user.component';
import { UsersComponent } from './pages/users/users.component';

const routes: Routes = [
  {
    path: '',
    component : HomeComponent,
  },
  {
    path:'dashboard',
    component : DashboardComponent
  },
  {
    path:'signIn',
    component : NewUserComponent
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
    component : UsersComponent
  },
  {
    path:'profile',
    component : ProfileComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
