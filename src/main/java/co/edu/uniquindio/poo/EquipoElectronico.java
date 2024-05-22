package co.edu.uniquindio.poo;

import java.time.LocalDate;

public  abstract class EquipoElectronico {
private String codigo;
private String nombre;
private String marca;
private LocalDate fechaAdquisicion;
public EquipoElectronico(String codigo, String nombre, String marca, LocalDate fechaAdquisicion) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.marca = marca;
    this.fechaAdquisicion = fechaAdquisicion;
}
public String getCodigo() {
    return codigo;
}
public void setCodigo(String codigo) {
    this.codigo = codigo;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public LocalDate getFechaAdquisicion() {
    return fechaAdquisicion;
}
public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
    this.fechaAdquisicion = fechaAdquisicion;
}
}
