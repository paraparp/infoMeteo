import { Component, OnInit, Input } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';

import { Infometeo } from 'src/app/models/infometeo.model';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  @Input() public infoMeteo: Infometeo;

  googlemapsUrl;

  constructor(public sanitizer: DomSanitizer) {
  }

  ngOnInit() { }

  getColor(temp: number): string {
    if (temp > 10) return 'accent';
    return 'warn';
  }

}
