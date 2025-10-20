package app;

import dao.AuditoriaDao;
import model.Auditoria;

public class Main {
    public static void main(String[] args) {

        Auditoria auditoria1 = new Auditoria("evento1", "detalle1");
        Auditoria auditoria2 = new Auditoria(null, "detalle2");

        Auditoria[] auditorias = new Auditoria[]{auditoria1, auditoria2};

        AuditoriaDao auditoriaDao = new AuditoriaDao();

        auditoriaDao.insertarAuditorias(auditorias);

    }
}