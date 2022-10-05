package br.com.xico.ap3.contato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import br.com.xico.ap3.contato.endereco.CEP;
import br.com.xico.ap3.contato.endereco.Endereco;
import br.com.xico.ap3.contato.endereco.Estado;

public class TestaContato {
    public static void main(String[] args) {
        Contato contatoXico = new Contato();

        Endereco enderecoDeXico = new Endereco("Rua de Xico");
        enderecoDeXico.setBairro("Bairro de Xico");
        enderecoDeXico.setCidade("Campina Grande");
        enderecoDeXico.setEstado(Estado.PB);
        enderecoDeXico.setNumero(666);
        enderecoDeXico.setCep(new CEP(59000, 000));
        
        LocalDate dataDeNascimento =
        LocalDate.parse("01/09/1999",
        DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        contatoXico.setDataDeNascimento(dataDeNascimento);
        
        contatoXico.setEndereco(enderecoDeXico);
        contatoXico.setNomeCompleto("Xico Arruda");

        System.out.println(contatoXico);
        
        
    }
}
