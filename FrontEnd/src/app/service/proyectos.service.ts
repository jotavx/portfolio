import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { proyectos } from '../model/proyectos.model';

@Injectable({
  providedIn: 'root',
})
export class ProyectosService {
  URL = 'http://localhost:8080/proyectos';

  constructor(private http: HttpClient) {}

  public getProyectos(): Observable<proyectos[]> {
    return this.http.get<proyectos[]>(this.URL + '/traer');
  }

  public createProyectos(proyectos: proyectos): Observable<proyectos> {
    return this.http.post<proyectos>(this.URL + '/crear', proyectos);
  }

  public editProyectos(proyectos: proyectos): Observable<proyectos> {
    return this.http.put<proyectos>(this.URL + '/editar', proyectos);
  }

  public deleteProyectos(id: number): Observable<void> {
    return this.http.delete<void>(this.URL + `/borrar/${id}`);
  }
}
