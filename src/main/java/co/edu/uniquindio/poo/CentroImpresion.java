package co.edu.uniquindio.poo;

import java.util.Collection;

import javax.swing.JOptionPane;

public class CentroImpresion {
 private String nombre;
 private Collection<Publicacion>publicaciones;
 private Impresora impresoraConectada;
public void setImpresoraConectada(Impresora impresoraConectada) {
  this.impresoraConectada = impresoraConectada;
}
public Impresora getImpresoraConectada() {
  return impresoraConectada;
}
public CentroImpresion(String nombre, Collection<Publicacion> publicaciones) {
  this.nombre = nombre;
  this.publicaciones = publicaciones;
}
public String getNombre() {
  return nombre;
}
public void setNombre(String nombre) {
  this.nombre = nombre;
}
public Collection<Publicacion> getPublicaciones() {
  return publicaciones;
}
public void setPublicaciones(Collection<Publicacion> publicaciones) {
  this.publicaciones = publicaciones;
}
public void conectarImpresora(Impresora impresora){
        setImpresoraConectada(impresora);
        impresora.conectarImpresora();
    }
    public void desconectarImpresora( ){
        getImpresoraConectada().desconectarImpresora();
        setImpresoraConectada(null);
        
    }
    public void imprimirPublicacion(Publicacion publicacion){
        if(verificarConexionImpresora()){
            getImpresoraConectada().imprimir(publicacion);
        }else{
            JOptionPane.showMessageDialog(null,"No Hay Impresoras ");
        }
    }

    public boolean verificarConexionImpresora(){
       return getImpresoraConectada() != null  && getImpresoraConectada().getEstado() == Estado.CONECTADA;
    }
  }

