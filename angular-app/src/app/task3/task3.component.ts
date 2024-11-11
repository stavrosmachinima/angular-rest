import {Component, Injectable, OnInit} from '@angular/core';
import {NgForOf} from "@angular/common";
import {HttpClient} from '@angular/common/http';
import {Router} from '@angular/router';
import {Observable} from 'rxjs';
import {FormsModule} from '@angular/forms';
import { NgxPaginationModule } from 'ngx-pagination';

@Component({
  selector: 'app-task3',
  standalone: true,
  imports: [
    NgForOf,
    FormsModule,
    NgxPaginationModule
  ],
  templateUrl: './task3.component.html',
  styleUrl: './task3.component.css'
})
@Injectable({
  providedIn: 'root'
})
export class Task3Component implements OnInit {
  mixedData:any[]=[];
  filteredData: any[] = [];
  regions: string[] = [];
  selectedRegion: string = '';
  dateFrom: string | null = null;
  dateTo: string | null = null;
  p: number = 1;

  constructor(private http: HttpClient, private router: Router) {}


  ngOnInit() {
    this.showMixedData().subscribe(data => {
      this.mixedData = data;
      this.filteredData=data;
      this.regions=[...new Set(data.map(item => item.region_name))];
    });
  }

  showMixedData(): Observable<any[]> {
    return this.http.get<any[]>('/api/mixed-data');
  }

  filterData() {
    this.filteredData = this.mixedData.filter(item => {
      const matchesRegion = this.selectedRegion ? item.region_name === this.selectedRegion : true;
      const matchesDateFrom = this.dateFrom ? item.year >= this.dateFrom : true;
      const matchesDateTo = this.dateTo ? item.year <= this.dateTo : true;
      return matchesRegion && matchesDateFrom && matchesDateTo;
    });
  }
}
