import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CompletedComponent } from './pages/completed/completed.component';
import { TodoComponent } from './pages/todo/todo.component';
import { FormsModule } from '@angular/forms';
import { UpdateComponent } from './pages/todo/update/update.component';
import { DeleteComponent } from './pages/todo/delete/delete.component';

@NgModule({
  declarations: [
    AppComponent,
    UpdateComponent,
    DeleteComponent,
    CompletedComponent,
    TodoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
