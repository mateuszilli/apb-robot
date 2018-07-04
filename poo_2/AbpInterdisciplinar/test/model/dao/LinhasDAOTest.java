/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Linhas;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author maria
 */
public class LinhasDAOTest {

    public LinhasDAOTest() {
    }

    @Test
    public void inserir() {

        Linhas lin = new Linhas();
        lin.setIdLinha(1);
        lin.setOrdemLinha(3);
        lin.setSentidoLinha("H");
        lin.setDescricaoLinha("Sono");
        
        LinhasDAO dao = new LinhasDAO();

        if (dao.save(lin)) {
            System.out.println("Salvo");
        } else {
            System.out.println("Erro ao salvar");
        }
    }

    @Ignore
    @Test
    public void listar() {
        LinhasDAO dao = new LinhasDAO();

        for (Linhas l : dao.findAll()) {
            System.out.println(l.getIdLinha());
            System.out.println(l.getOrdemLinha());
            System.out.println(l.getSentidoLinha());
            System.out.println(l.getDescricaoLinha());
        }
    }

//    @Ignore

    @Test
    public void atualizar() {

        Linhas lin = new Linhas("teste1");
        lin.setIdLinha(1);
        LinhasDAO dao = new LinhasDAO();

        if (dao.update(lin)) {
            System.out.println("Salvo");
        } else {
            System.out.println("Erro ao salvar");
        }
    }

    @Ignore
    @Test
    public void deletar() {

        Linhas lin = new Linhas();
        lin.setIdLinha(1);

        LinhasDAO dao = new LinhasDAO();

        if (dao.delete(lin)) {
            System.out.println("Salvo");
        } else {
            System.out.println("Erro ao salvar");
        }
    }
}
