import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NZ_I18N } from 'ng-zorro-antd/i18n';
import { en_GB } from 'ng-zorro-antd/i18n';
import { registerLocaleData } from '@angular/common';
import en from '@angular/common/locales/en';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './home/home.component';
import { PostsComponent } from './pages/posts/posts.component';
import { UsersComponent } from './pages/users/users.component';
import { InlineLoginFormComponent } from './inline-login-form/inline-login-form.component';
import { NzButtonModule } from 'ng-zorro-antd/button';
import { NzInputModule } from 'ng-zorro-antd/input';
import { NzLayoutModule } from 'ng-zorro-antd/layout';
import { NzFormModule } from 'ng-zorro-antd/form';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { NewUserComponent } from './pages/users/new-user/new-user.component';
import { NewPostComponent } from './pages/posts/new-post/new-post.component';
import { WithAnIconComponent } from './with-an-icon/with-an-icon.component';
import { NzBreadCrumbModule } from 'ng-zorro-antd/breadcrumb';







registerLocaleData(en);

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    PostsComponent,
    UsersComponent,
    InlineLoginFormComponent,
    DashboardComponent,
    ProfileComponent,
    NewPostComponent,
    WithAnIconComponent,
    NewUserComponent,
  
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    NzFormModule,
    NzInputModule,
    NzButtonModule,
    NzLayoutModule,
    NzBreadCrumbModule,
  
  ],
  providers: [
    { provide: NZ_I18N, useValue: en_GB }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
