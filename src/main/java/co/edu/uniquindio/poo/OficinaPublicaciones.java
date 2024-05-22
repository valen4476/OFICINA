package co.edu.uniquindio.poo;

import java.util.Collection;

public class OficinaPublicaciones {
 private String nombre;
 private Collection<EquipoElectronico> listaEquipoElectronicos;
 private CentroImpresion centroImpresion;
 private Collection<Publicacion>solicitudes;
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public Collection<EquipoElectronico> getListaEquipoElectronicos() {
    return listaEquipoElectronicos;
}
public void setListaEquipoElectronicos(Collection<EquipoElectronico> listaEquipoElectronicos) {
    this.listaEquipoElectronicos = listaEquipoElectronicos;
}
public CentroImpresion getCentroImpresion() {
    return centroImpresion;
}
public void setCentroImpresion(CentroImpresion centroImpresion) {
    this.centroImpresion = centroImpresion;
}
public Collection<Publicacion> getSolicitudes() {
    return solicitudes;
}
public void setSolicitudes(Collection<Publicacion> solicitudes) {
    this.solicitudes = solicitudes;
}
public OficinaPublicaciones(String nombre, Collection<EquipoElectronico> listaEquipoElectronicos,
        CentroImpresion centroImpresion, Collection<Publicacion> solicitudes) {
    this.nombre = nombre;
    this.listaEquipoElectronicos = listaEquipoElectronicos;
    this.centroImpresion = centroImpresion;
    this.solicitudes = solicitudes;
}

public void imprimirPublicacion(Publicacion publicacion){

    if(getCentroImpresion() != null){
        getCentroImpresion().imprimirPublicacion(publicacion);
    }
}
}
