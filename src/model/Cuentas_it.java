package model;

import java.time.LocalDate;

public class Cuentas_it {
    private int id;
    private int empleado_id;
    private String username;
    private LocalDate creado_en;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getCreado_en() {
        return creado_en;
    }

    public void setCreado_en(LocalDate creado_en) {
        this.creado_en = creado_en;
    }
}
