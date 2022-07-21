import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { experiencia } from '../model/experiencia.model';

@Injectable({
  providedIn: 'root',
})
export class ExperienciaService {
  URL = 'http://localhost:8080/experiencias';

  constructor(private http: HttpClient) {}

  public getExperiencia(): Observable<experiencia[]> {
    return this.http.get<experiencia[]>(this.URL + '/traer');
  }

  public createExperiencia(experiencia: experiencia): Observable<experiencia> {
    return this.http.post<experiencia>(this.URL + '/crear', experiencia);
  }

  public editExperiencia(experiencia: experiencia): Observable<experiencia> {
    return this.http.put<experiencia>(this.URL + '/editar', experiencia);
  }

  public deleteExperiencia(id: number): Observable<void> {
    return this.http.delete<void>(this.URL + `/borrar/${id}`);
  }
}
