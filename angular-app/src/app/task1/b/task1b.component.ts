import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {ActivatedRoute} from '@angular/router';
import {Observable} from 'rxjs';
import {CommonModule} from '@angular/common';

@Component({
  selector: 'app-task1b',
  // imports: [],
  templateUrl: './task1b.component.html',
  styleUrl: './task1b.component.css',
  standalone: true,
  imports: [CommonModule],
})
export class Task1bComponent implements OnInit {
  languages: any[] = [];
  countryId!: string;
  countryName!:string;

  constructor(private http: HttpClient, private route: ActivatedRoute) {}

  ngOnInit() {
    this.countryId = this.route.snapshot.paramMap.get('country_id')!;
    this.countryName=this.route.snapshot.paramMap.get('country_name')!;
    this.getLanguages(this.countryId).subscribe(data => {
      this.languages = data;
    });
  }

  getLanguages(country_id: string ):Observable<any[]> {
    return this.http.get<any[]>('/api/countries/' + country_id + '/languages');
  }
}
