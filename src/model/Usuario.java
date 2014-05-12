/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Karen
 */
public class Usuario implements Serializable{
    
    private String cpf;
    private String nome;
    private String login;
    private String senha;
    private int tipo;

    public Usuario(String cpf, String nome, String login, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cpf=" + cpf + ", nome=" + nome + ", login=" + login + ", senha=" + senha + ", tipo=" + tipo + '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Usuario other = (Usuario) obj;
//        if ((this.cpf == null) ? (other.cpf != null) : !this.cpf.equals(other.cpf)) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.cpf != null ? this.cpf.hashCode() : 0);
        return hash;
    }
    
    
}
