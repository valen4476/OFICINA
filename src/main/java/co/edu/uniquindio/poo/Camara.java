package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Camara extends EquipoElectronico {
private int resolucion;

public Camara(String codigo,String nombre, String marca,LocalDate fechaAdquisicion,int resolucion) {
     super(codigo, nombre, marca, fechaAdquisicion);
    this.resolucion = resolucion;
}

public int getResolucion() {
    return resolucion;
}

public void setResolucion(int resolucion) {
    this.resolucion = resolucion;
}
}
