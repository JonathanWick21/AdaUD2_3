package model;

import java.time.LocalDate;

public class Asignaciones {
    private int id;
    private int id_empleado;
    private int dispositivo_id;
    private LocalDate fecha;
    private String observaciones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getDispositivo_id() {
        return dispositivo_id;
    }

    public void setDispositivo_id(int dispositivo_id) {
        this.dispositivo_id = dispositivo_id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
