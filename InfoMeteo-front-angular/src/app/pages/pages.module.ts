import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { PrincipalComponent } from './principal/principal.component';
import { MapComponent } from '../components/map/map.component';
import { SearchComponent } from '../components/search/search.component';
import { CardComponent } from '../components/card/card.component';
import { TablaComponent } from '../components/tabla/tabla.component';
import { FormsModule } from '@angular/forms';
import { MaterialModule } from '../shared/material.module';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

@NgModule({
  declarations: [
    PrincipalComponent,
    MapComponent,
    SearchComponent,
    CardComponent,
    TablaComponent,
    PageNotFoundComponent],
  imports: [
    CommonModule,
    FormsModule,
    HttpClientModule,
    MaterialModule
  ],
  providers: []
})
export class PagesModule { }
