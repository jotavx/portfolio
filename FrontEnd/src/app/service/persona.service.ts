import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from '../model/persona.model';

@Injectable({
  providedIn: 'root',
})
export class PersonaService {
  URL = 'http://localhost:8080/personas/';

  constructor(private http: HttpClient) {}

  public getPersona(): Observable<persona> {
    return this.http.get<persona>(this.URL + 'traer/perfil');
  }

  public createPersona(persona: persona): Observable<persona> {
    return this.http.post<persona>(this.URL + '/crear', persona);
  }

  public editPersona(persona: persona): Observable<persona> {
    return this.http.put<persona>(this.URL + '/editar/${id}', persona);
  }

  public deletePersona(id: number): Observable<void> {
    return this.http.delete<void>(this.URL + '/borrar/${id}');
  }
}
