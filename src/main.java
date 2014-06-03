/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import model.*;

/**
 *
 * @author fabio
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void oldMain(String[] args) {
        List<Disco> discoteca = new ArrayList<Disco>();
        int opcao=0;
        String nomeDisco, nomeInterprete, strEstilo, output;
        Estilo estilo=Estilo.ROCK;
        int numFaixas, anoDisco, escolhaEstilo ,count;
        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção:\n1 - Inserir\n2 - Ordenar ASC\n3 - Ordenar DESC\n99 - Sair"));
                switch(opcao) {
                    case 1:
                        nomeDisco = JOptionPane.showInputDialog("Informe o nome do disco");
                        nomeInterprete = JOptionPane.showInputDialog("Informe o nome do intérprete");
                        do {
                            strEstilo="";
                            escolhaEstilo=count=0;
                            for (Estilo opcoesEstilo : Estilo.values()) {
                                count++;
                                strEstilo+= (Integer.toString(count)+" - "+opcoesEstilo.name()+"\n");
                            }
                            try {
                                escolhaEstilo = Integer.parseInt(JOptionPane.showInputDialog("Informe o estilo:\n"+strEstilo));
                                estilo = Estilo.values()[escolhaEstilo-1];
                            } catch(Exception e) {
                                escolhaEstilo=0;
                            }
                        }while(escolhaEstilo==0);
                        numFaixas=anoDisco=0;
                        do {
                            try {
                                numFaixas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de faixas do disco:\n"));
                            } catch(Exception e) {
                                numFaixas=0;
                            }
                        }while(numFaixas==0);
                        do {
                            try {
                                anoDisco = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do disco:\n"));
                            } catch(Exception e) {
                                anoDisco=0;
                            }
                        }while(anoDisco==0);
                        discoteca.add(new Disco(nomeDisco,new Interprete(nomeInterprete,estilo),numFaixas,anoDisco));
                        break;
                    case 2:
                        Collections.sort(discoteca, new DiscoComparatorAnoAsc());
                        output="";
                        for (Disco disco : discoteca) {
                            output+=disco;
                            output+="\n===\n";
                        }
                        JOptionPane.showMessageDialog(null, output);
                        break;
                    case 3:
                        output="";
                        Collections.sort(discoteca, new DiscoComparatorAnoDesc());
                        for (Disco disco : discoteca) {
                            output+=disco;
                            output+="===";
                        }
                        JOptionPane.showMessageDialog(null, output);
                        break;
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        } while(opcao!=99);
        System.exit(0);
    }
    
    public static void main(String[] args) {
        Usuario u1,u2,u3;
        u1 = new Usuario("1", "João", null, null);
        u2 = new Usuario("2", "Maria", null, null);
        u3 = new Usuario("3", "José", null, null);
        HashMap mapa = new HashMap();
        mapa.put(u1.getCpf(), u1);
        mapa.put(u2.getCpf(), u2);
        mapa.put(u3.getCpf(), u3);
        Set lista = mapa.keySet();
        Iterator it = lista.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        lista = mapa.entrySet();
        it = lista.iterator();
        Map.Entry entry;
        while(it.hasNext()) {
            entry = (Map.Entry)it.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.exit(0);
    }
}
