import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


import { URL_SERVICIOS } from '../config/config';

//Servicio para el acceso a la API Rest InfoMeteo

@Injectable({
  providedIn: 'root'
})
export class MeteoService {

  constructor(private http: HttpClient) { }

  getMeteoByCity(city: string) {
    let url = URL_SERVICIOS + `/meteo?city=${city}`;
    return this.http.get(url);
  }

  getPastSearch(): any {
    let url = URL_SERVICIOS + `/past`;
    return this.http.get(url);
  }
}
