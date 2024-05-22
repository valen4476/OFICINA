package co.edu.uniquindio.poo;

public class Laser extends Impresora {
 public Laser(String modelo){
    super(modelo);
 }
 @Override
 protected void conectarImpresora() {
     // Implementación específica para conectar una impresora 
     System.out.println("Conectando impresora laser: " + getModelo());
 }

 @Override
 protected void desconectarImpresora() {
     // Implementación específica para desconectar una impresora 
     System.out.println("Desconectando impresora laser: " + getModelo());
 }
 @Override
 public void imprimir(Publicacion publicacion) {
     System.out.println("Imprimiendo desde impresora laser: " + publicacion.getTipoPublicacion());
 }
}
