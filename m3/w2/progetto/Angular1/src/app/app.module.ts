import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CompletedComponent } from './pages/completed/completed.component';
import { TodoComponent } from './pages/todo/todo.component';
import { FormsModule } from '@angular/forms';
import { MainComponent } from './main/main.component';


@NgModule({
  declarations: [
    AppComponent,
    CompletedComponent,
    TodoComponent,
    MainComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
