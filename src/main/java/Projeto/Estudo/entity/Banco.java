package Projeto.Estudo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banco
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeBanco;
    private String numDaConta;
    private Double valorParaImprestimo;

    public Banco(String nomeBanco, String numDaConta, Double valorParaImprestimo) {
        this.nomeBanco = nomeBanco;
        this.numDaConta = numDaConta;
        this.valorParaImprestimo = valorParaImprestimo;
    }

    public Banco() {
    }

    public Long getId() {
        return id;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNumDaConta() {
        return numDaConta;
    }

    public void setNumDaConta(String numDaConta) {
        this.numDaConta = numDaConta;
    }

    public Double getValorParaImprestimo() {
        return valorParaImprestimo;
    }

    public void setValorParaImprestimo(Double valorParaImprestimo) {
        this.valorParaImprestimo = valorParaImprestimo;
    }
}
