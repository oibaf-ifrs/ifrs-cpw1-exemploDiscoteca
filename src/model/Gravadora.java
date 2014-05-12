package model;


/**
 * Write a description of class Gravadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gravadora implements Comparable
{
    private String nome;
    private String cnpj;

    /**
     * Constructor for objects of class Gravadora
     */
    public Gravadora(String nome, String cnpj)
    {
        this.nome = nome;
        this.cnpj = cnpj;
    }
    
    public String getNome(){
        return nome;
    }

    public String getCNPJ(){
        return cnpj;
    }

    @Override
    public String toString() {
        return "Gravadora{" + "nome=" + nome + ", cnpj=" + cnpj + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 89 * hash + (this.cnpj != null ? this.cnpj.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gravadora other = (Gravadora) obj;
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if ((this.cnpj == null) ? (other.cnpj != null) : !this.cnpj.equals(other.cnpj)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object t) {
        int retorno = 0;
        if ((t != null) && (t instanceof Gravadora)) {
            Gravadora outro = (Gravadora) t;
            retorno = this.nome.compareTo(outro.nome);
        }
        return retorno;
    }
}