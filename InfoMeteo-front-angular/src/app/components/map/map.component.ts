import { Component, OnInit, AfterViewInit, Input } from '@angular/core';

import * as L from 'leaflet';

import { Infometeo } from 'src/app/models/infometeo.model';

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})

//Crea un mapa de Openstreetmapcon una coordenadas dadas
export class MapComponent implements AfterViewInit {
  @Input()
  public infoMeteo: Infometeo;
  private map;

  constructor() { }

  ngAfterViewInit(): void {
    this.initMap();
  }

  private initMap(): void {
    this.map = L.map('map', {
      center: [this.infoMeteo.lat, this.infoMeteo.lng],
      zoom: 12
    });

    const tiles = L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
      maxZoom: 20,
      attribution: '© <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
    });

    const marker = L.circleMarker([this.infoMeteo.lat, this.infoMeteo.lng], { radius: 2 })

    marker.addTo(this.map);
    tiles.addTo(this.map);

  }
}
