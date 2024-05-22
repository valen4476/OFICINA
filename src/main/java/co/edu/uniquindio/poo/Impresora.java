package co.edu.uniquindio.poo;

public abstract class Impresora implements Imprimible{
private String modelo;
private Estado estado;
public Estado getEstado() {
    return estado;
}

public Impresora(String modelo) {
    this.modelo = modelo;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}
public void setEstadoImpresora(Estado estado) {
    this.estado = estado;
}
protected abstract void conectarImpresora();
protected abstract void desconectarImpresora();

public void imprimirPublicacion(String publicacion) {
    System.out.println("Imprimiendo publicación: " + publicacion);
}
}
