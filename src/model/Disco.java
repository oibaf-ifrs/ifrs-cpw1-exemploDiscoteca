package model;

/*
 * Disco.java
 *
 * Created on 25 de Outubro de 2003, 12:18
 */

/**
 *
 * @author  Karen
 */
public class Disco implements Comparable {
    
     private String titulo;
     private Interprete cantor;
     private Gravadora gravadora;
     private int ano;
     private int nroFaixas;
     private Usuario registro;
        
    public Disco(String titulo,Interprete cantor,int nroFaixas, int ano) {
        this.titulo = titulo;
        this.cantor = cantor;
        this.nroFaixas = nroFaixas;
        this.ano = ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void setGravadora(Gravadora gravadora) {
        this.gravadora = gravadora;
    }
   
    public String getTitulo(){
        return titulo;
    }
    
    public Interprete getCantor(){
        return cantor;
    }
    
    public int getAno(){
        return ano;
    }
    
    public Gravadora getGravadora(){
        return gravadora;
    }
    
    public int getNroFaixas() {
        return nroFaixas;
    }

    @Override
    public String toString() {
        return "Disco{" + "titulo=" + titulo + ", cantor=" + cantor + ", ano=" + ano + ", responsavel=" + registro + '}';
    }  

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.titulo != null ? this.titulo.hashCode() : 0);
        hash = 97 * hash + (this.cantor != null ? this.cantor.hashCode() : 0);
        hash = 97 * hash + (this.gravadora != null ? this.gravadora.hashCode() : 0);
        hash = 97 * hash + this.ano;
        hash = 97 * hash + this.nroFaixas;
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
        final Disco other = (Disco) obj;
        if ((this.titulo == null) ? (other.titulo != null) : !this.titulo.equals(other.titulo)) {
            return false;
        }
        if (this.cantor != other.cantor && (this.cantor == null || !this.cantor.equals(other.cantor))) {
            return false;
        }
        if (this.gravadora != other.gravadora && (this.gravadora == null || !this.gravadora.equals(other.gravadora))) {
            return false;
        }
        if (this.ano != other.ano) {
            return false;
        }
        if (this.nroFaixas != other.nroFaixas) {
            return false;
        }
        return true;
    }


    @Override
    public int compareTo(Object o) {
        int retorno = 0;
        if ((o != null) && (o instanceof Disco)) {
            Disco outro = (Disco) o;
            retorno = this.titulo.compareTo(outro.titulo);
        }
        return retorno;
    }

    /**
     * @return the registro
     */
    public Usuario getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(Usuario registro) {
        this.registro = registro;
    }
   
}
