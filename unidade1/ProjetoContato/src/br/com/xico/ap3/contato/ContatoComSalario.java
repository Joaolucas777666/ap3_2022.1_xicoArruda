package br.com.xico.ap3.contato;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.xico.ap3.contato.endereco.Endereco;

public class ContatoComSalario extends Contato implements Pessoa, Serializable {

    @Override
    public String toString() {
        return "ContatoComSalario [salario=" + salario + "]";
    }

    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
