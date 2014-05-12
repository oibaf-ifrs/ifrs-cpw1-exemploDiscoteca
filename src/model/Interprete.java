package model;


/**
 * Write a description of class Interprete here.
 * 
 * @author Marcos
 * @version 1.0
 */
public class Interprete implements Comparable
{
    private String nome;
    private Estilo estilo;

    public Interprete(String nome, Estilo estilo) {
        this.nome = nome;
        this.estilo = estilo;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public String getNome() {
        return nome;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false; //nenhum objeto pode ser igual a null
        }
        if (obj instanceof Interprete == false) { //uma pessoa só pode ser igual a outra pessoa
            return false;
        }
        Interprete other = (Interprete) obj;
        if (this.nome == null) //se não houver titulo não há como testar 
        {
            return false;
        } else {
            return this.nome.equals(other.nome);
        }
    } // fecha equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return ("\nCantor = " + nome + 
                "\nEstilo = " + estilo);
    }

    @Override
    public int compareTo(Object t) {
        int retorno = 0;
        if ((t != null) && (t instanceof Interprete)) {
            Interprete outro = (Interprete) t;
            retorno = this.nome.compareTo(outro.nome);
            // aproveita a implementação do compareTo de String
        }
        return retorno;
    }

    
}
