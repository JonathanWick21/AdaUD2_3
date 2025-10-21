package model;

enum Estado{
    DISPONIBLE, ASIGNADO, BAJA
}

public class Dispositivos {
    private int id;
    private String etiqueta;
    private String tipo;
    private Estado estado;
}
