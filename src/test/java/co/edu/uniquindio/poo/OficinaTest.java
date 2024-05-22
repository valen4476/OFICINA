package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.jupiter.api.Test;

public class OficinaTest {
    @Test
    public void testImprimirPublicacion() {
        // Crear una instancia de la impresora laser
        Impresora impresora = new Laser("ELSON388492");
        
        // Crear una instancia de la publicación
        Publicacion publicacion = new Publicacion("Max","bien",TipoPublicacion.LIBRO);
        
        // Realizar la prueba de impresion
        String expectedOutput = "Imprimiendo desde impresora laser: " + publicacion.getTipoPublicacion();
        
        // Obtener la salida de la impresion
        String actualOutput = realizarImpresion(impresora, publicacion);
        
        // Verificar si la salida coincide con la esperada
        assertEquals(expectedOutput, actualOutput);
    }
    
    // Método para simular la impresion y capturar la salida
    private String realizarImpresion(Impresora impresora, Publicacion publicacion) {
        // Imprimir mensaje en la consola indicando que se está realizando la impresion de la publicación
        System.out.println("Imprimiendo la publicación: " + publicacion.getTipoPublicacion());
        
        // Capturar la salida estandar
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        // Realizar la impresión de la publicación
        impresora.imprimir(publicacion);
        
        // Devolver la salida capturada como una cadena
        return outputStream.toString().trim();
    }
   
}

