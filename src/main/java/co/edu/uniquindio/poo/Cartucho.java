package co.edu.uniquindio.poo;



public class Cartucho extends Impresora {
  public Cartucho(String modelo){
    super(modelo);
  }
  @Override
  protected void conectarImpresora() {
      // Implementación específica para conectar una impresora a cartucho
      System.out.println("Conectando impresora a cartucho: " + getModelo());
  }

  @Override
  protected void desconectarImpresora() {
      // Implementación específica para desconectar una impresora a cartucho
      System.out.println("Desconectando impresora a cartucho: " + getModelo());
  }
  @Override
    public void imprimir(Publicacion publicacion) {
        System.out.println("Imprimiendo desde impresora a cartucho: " + publicacion);
    }
    }

