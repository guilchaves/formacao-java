package br.com.guilherme.java.io.test;

import java.io.Serializable;

public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String cpf;
    private String occupation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
