import { Component, OnInit } from '@angular/core';
import { skills } from 'src/app/model/skills.model';
import { SkillsService } from 'src/app/service/skills.service';

@Component({
  selector: 'app-hys',
  templateUrl: './hys.component.html',
  styleUrls: ['./hys.component.css'],
})
export class HysComponent implements OnInit {
  skills: skills = new skills('', '');

  constructor(public skillsService: SkillsService) {}

  ngOnInit(): void {
    this.skillsService.getSkills().subscribe((data) => {
      this.skills = data;
    });
  }
}
