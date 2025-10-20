package model;

import java.time.LocalDate;

public class Auditoria {
    private int id;
    private String evento;
    private String detalle;
    private LocalDate ts;

    public Auditoria(String evento, String detalle) {
        this.evento = evento;
        this.detalle = detalle;
        this.ts = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public LocalDate getTs() {
        return ts;
    }

    public void setTs(LocalDate ts) {
        this.ts = ts;
    }
}
