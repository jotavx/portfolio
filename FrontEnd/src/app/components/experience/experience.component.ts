import { Component, OnInit } from '@angular/core';
import { experiencia } from 'src/app/model/experiencia.model';
import { ExperienciaService } from 'src/app/service/experiencia.service';

@Component({
  selector: 'app-experience',
  templateUrl: './experience.component.html',
  styleUrls: ['./experience.component.css'],
})
export class ExperienceComponent implements OnInit {
  experiencia: experiencia = new experiencia('', '', '', '');

  constructor(public experienciaService: ExperienciaService) {}

  ngOnInit(): void {
    this.experienciaService.getExperiencia().subscribe((data) => {
      this.experiencia = data;
    });
  }
}
