package aplicacaopm;

import telas.*;
import bancoSQL.Tabelas;

public class AplicacaoPM {

    public static void main(String[] args) throws ClassNotFoundException {
        
        //Cria tabelas de banco de dados. Necessário dodas apenas uma vez.
        //Tabelas tabelas = new Tabelas();   
        
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }
    
}
