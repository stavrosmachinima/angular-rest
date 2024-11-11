import {Component, Injectable, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Router} from '@angular/router';
import {Observable} from 'rxjs';
import {NgForOf} from '@angular/common';

@Component({
  selector: 'app-task2',
  standalone: true,
  imports: [
    NgForOf
  ],
  templateUrl: './task2.component.html',
  styleUrl: './task2.component.css'
})
@Injectable({
  providedIn: 'root'
})
export class Task2Component implements OnInit {
  countryStats:any[]=[];
  constructor(private http: HttpClient, private router: Router) {}


  ngOnInit() {
    this.getMaxGdpPerPopulation().subscribe(data => {
      this.countryStats = data;
    });
  }

  getMaxGdpPerPopulation(): Observable<any[]> {
    return this.http.get<any[]>('/api/max-gdp-per-population');
  }

}
