import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { Task1aComponent } from './task1/a/task1a.component';
import { Task2Component } from './task2/task2.component';
import { Task3Component } from './task3/task3.component';
import {Task1bComponent} from './task1/b/task1b.component';

export const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'task1/a', component: Task1aComponent },
  { path: 'task1/b/:country_id', component: Task1bComponent },
  { path: 'task2', component: Task2Component },
  { path: 'task3', component: Task3Component }
];
