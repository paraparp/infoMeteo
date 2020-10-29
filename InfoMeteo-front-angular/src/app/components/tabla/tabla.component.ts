import { Component, OnInit, ViewChild, Input } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { MatSort, MatSortable } from '@angular/material/sort';

import { Infometeo } from 'src/app/models/infometeo.model';


@Component({
  selector: 'app-tabla',
  templateUrl: './tabla.component.html',
  styleUrls: ['./tabla.component.css']
})
export class TablaComponent implements OnInit {

  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;

  @Input()
  public pastSearch: Infometeo[];

  displayedColumns: string[] = ['createdAt', 'cityName', 'countryName', 'temperature'];
  dataSource = new MatTableDataSource<Infometeo>();


  constructor() { }

  ngOnInit() {
    this.dataSource = new MatTableDataSource(this.pastSearch)
    this.dataSource.paginator = this.paginator;
    this.sort.sort(({ id: 'createdAt', start: 'desc' }) as MatSortable);
    this.dataSource.sort = this.sort;
  }

}
