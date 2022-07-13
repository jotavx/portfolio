export class persona {
  id?: number;
  nombre: string;
  apellido: string;
  domicilio: string;
  titulo: string;
  sobremi: string;
  img: string;

  constructor(
    nombre: string,
    apellido: string,
    domicilio: string,
    titulo: string,
    sobremi: string,
    img: string
  ) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.domicilio = domicilio;
    this.titulo = titulo;
    this.sobremi = sobremi;
    this.img = img;
  }
}
