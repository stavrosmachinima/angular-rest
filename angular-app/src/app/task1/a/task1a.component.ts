import {Component, Injectable, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Router } from '@angular/router';
import {CommonModule} from '@angular/common';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-task1a',
  imports: [CommonModule],
  styleUrl: './task1a.component.css',
  standalone: true,
  templateUrl: './task1a.component.html',
})
@Injectable({
  providedIn: 'root'
})
export class Task1aComponent implements OnInit{
  countries: any[] = [];

  constructor(private http: HttpClient, private router: Router) {}

  ngOnInit() {
    this.getCountries().subscribe(data => {
      this.countries = data;
    });
  }

  getCountries(): Observable<any[]> {
    return this.http.get<any[]>('/api/countries');
  }

  viewLanguages(country_id: string,country_name: string) {
    this.router.navigate(['/task1/b', country_id,{country_name: country_name}]);
  }
}
