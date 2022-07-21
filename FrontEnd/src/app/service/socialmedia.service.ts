import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { socialmedia } from '../model/socialmedia';

@Injectable({
  providedIn: 'root',
})
export class SocialmediaService {
  URL = 'http://localhost:8080/socialmedia';

  constructor(private http: HttpClient) {}

  public getSocialMedia(): Observable<socialmedia[]> {
    return this.http.get<socialmedia[]>(this.URL + '/traer');
  }

  public createSocialMedia(socialmedia: socialmedia): Observable<socialmedia> {
    return this.http.post<socialmedia>(this.URL + '/crear', socialmedia);
  }

  public editSocialMedia(socialmedia: socialmedia): Observable<socialmedia> {
    return this.http.put<socialmedia>(this.URL + '/editar', socialmedia);
  }

  public deleteSocialMedia(id: number): Observable<void> {
    return this.http.delete<void>(this.URL + `/borrar/${id}`);
  }
}
