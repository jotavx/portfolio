import { Component, OnInit } from '@angular/core';
import { estudios } from 'src/app/model/estudios.model';
import { EstudiosService } from 'src/app/service/estudios.service';

@Component({
  selector: 'app-estudios',
  templateUrl: './estudios.component.html',
  styleUrls: ['./estudios.component.css'],
})
export class EstudiosComponent implements OnInit {
  estudios: estudios = new estudios('', '', '', '');

  constructor(public estudiosService: EstudiosService) {}

  ngOnInit(): void {
    this.estudiosService.getEstudios().subscribe((data) => {
      this.estudios = data;
    });
  }
}
