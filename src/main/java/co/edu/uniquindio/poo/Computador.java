package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Computador extends EquipoElectronico {
private int velocidadDeProcesamiento;

public Computador(String codigo,String nombre,String marca,LocalDate fechaAdquisicion,int velocidadDeProcesamiento) {
    super(codigo, nombre, marca, fechaAdquisicion);
    this.velocidadDeProcesamiento = velocidadDeProcesamiento;
}

public int getVelocidadDeProcesamiento() {
    return velocidadDeProcesamiento;
}

public void setVelocidadDeProcesamiento(int velocidadDeProcesamiento) {
    this.velocidadDeProcesamiento = velocidadDeProcesamiento;
}
}
