package co.edu.uniquindio.poo;


public class Publicacion  {
private String titulo;
private String estado;
private TipoPublicacion tipoPublicacion;
public Publicacion(String titulo, String estado, TipoPublicacion tipoPublicacion) {
  
    this.titulo = titulo;
    this.estado = estado;
    this.tipoPublicacion = tipoPublicacion;
}
public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public String getEstado() {
    return estado;
}
public void setEstado(String estado) {
    this.estado = estado;
}
public TipoPublicacion getTipoPublicacion() {
    return tipoPublicacion;
}
public void setTipoPublicacion(TipoPublicacion tipoPublicacion) {
    this.tipoPublicacion = tipoPublicacion;
}
}
