import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { skills } from '../model/skills.model';

@Injectable({
  providedIn: 'root',
})
export class SkillsService {
  URL = 'http://localhost:8080/skills/';

  constructor(private http: HttpClient) {}

  public getSkills(): Observable<skills> {
    return this.http.get<skills>(this.URL + 'traer/perfil');
  }
}
