export class socialmedia {
  id?: number;
  instagram: string;
  facebook: string;
  linkedin: string;

  constructor(instagram: string, facebook: string, linkedin: string) {
    this.instagram = instagram;
    this.facebook = facebook;
    this.linkedin = linkedin;
  }
}
