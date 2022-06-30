import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { estudios } from '../model/estudios.model';

@Injectable({
  providedIn: 'root',
})
export class EstudiosService {
  URL = 'http://localhost:8080/estudios/';

  constructor(private http: HttpClient) {}

  public getEstudios(): Observable<estudios> {
    return this.http.get<estudios>(this.URL + 'traer/perfil');
  }
}
