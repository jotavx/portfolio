import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { skills } from '../model/skills.model';

@Injectable({
  providedIn: 'root',
})
export class SkillsService {
  URL = 'http://localhost:8080/skills';

  constructor(private http: HttpClient) {}

  public getSkills(): Observable<skills[]> {
    return this.http.get<skills[]>(this.URL + '/traer');
  }

  public createSkills(skills: skills): Observable<skills> {
    return this.http.post<skills>(this.URL + '/crear', skills);
  }

  public editSkills(skills: skills): Observable<skills> {
    return this.http.put<skills>(this.URL + '/editar', skills);
  }

  public deleteSkills(id: number): Observable<void> {
    return this.http.delete<void>(this.URL + `/borrar/${id}`);
  }
}
