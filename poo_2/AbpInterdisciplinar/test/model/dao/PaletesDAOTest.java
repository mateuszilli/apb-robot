package model.dao;

import java.util.Date;
import model.bean.Paletes;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author maria
 */
public class PaletesDAOTest {

    public PaletesDAOTest() {
    }

    @Ignore
    @Test
    public void inserir() {

        Paletes paletes = new Paletes();
        paletes.setIdPalete(5);
        paletes.setDescricaoPalete("teste");
        paletes.setValidadePalete("10-10-1998");

        PaletesDAO dao = new PaletesDAO();

        if (dao.save(paletes)) {
            System.out.println("Salvo");
        } else {
            System.out.println("Erro ao salvar");
        }
    }

    @Ignore
    @Test
    public void listar() {
        PaletesDAO dao = new PaletesDAO();

        for (Paletes p : dao.findAll()) {
            System.out.println(p.getIdPalete());
            System.out.println(p.getDescricaoPalete());
            System.out.println(p.getValidadePalete());
        }
    }

//    @Ignore
    @Test
    public void atualizar() {

        Paletes paletes = new Paletes();
        paletes.setIdPalete(1);
        paletes.setDescricaoPalete("Teste");
        paletes.setValidadePalete("05-05-1998");

        paletes.setIdPalete(1);

        PaletesDAO dao = new PaletesDAO();

        if (dao.update(paletes)) {
            System.out.println("Salvo");
        } else {
            System.out.println("Erro ao salvar");
        }
    }

    @Ignore
    @Test
    public void deletar() {

        Paletes paletes = new Paletes();
        paletes.setIdPalete(1);

        PaletesDAO dao = new PaletesDAO();

        if (dao.delete(paletes)) {
            System.out.println("Salvo");
        } else {
            System.out.println("Erro ao salvar");
        }
    }
}
