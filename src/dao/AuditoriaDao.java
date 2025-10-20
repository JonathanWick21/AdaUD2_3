package dao;

import dataSource.DsProvider;
import model.Auditoria;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AuditoriaDao {
    private final DataSource ds;

    public AuditoriaDao() {
        this.ds = DsProvider.get();
    }

    public void insertarAuditorias(Auditoria[] auditorias){
        String query = "INSERT INTO auditoria (evento, detalle) values (?,?)";

        for (Auditoria auditoria: auditorias){
            try (Connection con = ds.getConnection()){
                con.setAutoCommit(true);
                try(PreparedStatement ps = con.prepareStatement(query)){
                    ps.setString(1, auditoria.getEvento());
                    ps.setString(2, auditoria.getDetalle());
                    ps.executeUpdate();
                    System.out.println("Se ha insertado la auditoria con id: " + auditoria.getId() + " con exito");
                } catch (SQLException e) {
                    System.err.println("Error");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
