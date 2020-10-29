import { Component, OnInit } from '@angular/core';

import { MeteoService } from 'src/app/services/meteo.service';
import { Infometeo } from 'src/app/models/infometeo.model';

@Component({
  selector: 'app-principal',
  templateUrl: './principal.component.html',
  styleUrls: ['./principal.component.css']
})
export class PrincipalComponent implements OnInit {

  constructor(private meteoService: MeteoService, ) {
  }

  pastSearch: Infometeo[] = [];
  meteo: Infometeo;
  errMsg: string;

  ngOnInit(): void {
    this.getPastSearch();
  }

  search(city: string) {
    this.errMsg = null;
    this.meteo = null
    this.meteoService.getMeteoByCity(city).subscribe(
      (resp: Infometeo) => this.meteo = resp,
      err => {
        if (err.error.mensaje) this.errMsg = err.error.mensaje
        else this.errMsg = err.statusText;
      }
    )
    this.getPastSearch();
  }

  getPastSearch() {
    this.meteoService.getPastSearch().subscribe((resp: Infometeo[]) => this.pastSearch = resp);
  }

}
