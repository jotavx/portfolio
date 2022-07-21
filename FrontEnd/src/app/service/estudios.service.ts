import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { estudios } from '../model/estudios.model';

@Injectable({
  providedIn: 'root',
})
export class EstudiosService {
  URL = 'http://localhost:8080/estudios';

  constructor(private http: HttpClient) {}

  public getEstudios(): Observable<estudios[]> {
    return this.http.get<estudios[]>(this.URL + '/traer');
  }

  public createEstudios(estudios: estudios): Observable<estudios> {
    return this.http.post<estudios>(this.URL + '/crear', estudios);
  }

  public editEstudios(estudios: estudios): Observable<estudios> {
    return this.http.put<estudios>(this.URL + '/editar', estudios);
  }

  public deleteEstudios(id: number): Observable<void> {
    return this.http.delete<void>(this.URL + `/borrar/${id}`);
  }
}
