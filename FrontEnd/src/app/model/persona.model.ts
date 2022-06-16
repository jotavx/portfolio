export class persona {
  id?: number;
  nombre: String;
  apellido: String;
  domicilio: String;
  titulo: String;
  sobremi: String;
  img: String;

  constructor(
    nombre: String,
    apellido: String,
    domicilio: String,
    titulo: String,
    sobremi: String,
    img: String
  ) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.domicilio = domicilio;
    this.titulo = titulo;
    this.sobremi = sobremi;
    this.img = img;
  }
}
