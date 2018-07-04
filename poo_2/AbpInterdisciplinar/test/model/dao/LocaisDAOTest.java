/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Locais;
import model.bean.Linhas;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author maria
 */
public class LocaisDAOTest {

    public LocaisDAOTest() {
    }

    @Ignore
    @Test
    public void inserir() {

        Linhas linhas = new Linhas();
        linhas.setIdLinha(1);

        Locais locais = new Locais();
        locais.setIdLocal(1);
        locais.setLinhas(linhas);
        locais.setOrdemLocal(2);
        locais.setTipoLocal("A");
        locais.setDescricaoLocal("Mais teste");
        locais.setHashLocal("AAH");

        LocaisDAO dao = new LocaisDAO();

        if (dao.save(locais)) {
            System.out.println("Salvo");
        } else {
            System.out.println("Erro ao salvar");
        }
    }

//    @Ignore
    @Test
    public void listar() {
        LocaisDAO dao = new LocaisDAO();
        System.out.println("a");
        for (Locais l : dao.findAll()) {
            System.out.println(l.getIdLocal());
            System.out.println(l.getOrdemLocal());
            System.out.println(l.getTipoLocal());
            System.out.println(l.getDescricaoLocal());
            System.out.println(l.getHashLocal());

            System.out.println(l.getLinhas().getIdLinha());
            System.out.println(l.getLinhas().getOrdemLinha());
            System.out.println(l.getLinhas().getSentidoLinha());
            System.out.println(l.getLinhas().getDescricaoLinha());
        }

    }
    
    @Ignore
    @Test
    public void atualizar() {

        Linhas linhas = new Linhas();
        linhas.setIdLinha(1);

        Locais locais = new Locais();
        locais.setIdLocal(1);
        locais.setLinhas(linhas);
        locais.setOrdemLocal(2);
        locais.setTipoLocal("A");
        locais.setDescricaoLocal("Agora Vai");
        locais.setHashLocal("AAH");

        locais.setIdLocal(1);

        LocaisDAO dao = new LocaisDAO();

        if (dao.update(locais)) {
            System.out.println("Salvo");
        } else {
            System.out.println("Erro ao salvar");
        }
    }

    @Ignore
    @Test
    public void deletar() {

        Locais locais = new Locais();
        locais.setIdLocal(1);

        LocaisDAO dao = new LocaisDAO();

        if (dao.delete(locais)) {
            System.out.println("Salvo");
        } else {
            System.out.println("Erro ao salvar");
        }
    }
}
