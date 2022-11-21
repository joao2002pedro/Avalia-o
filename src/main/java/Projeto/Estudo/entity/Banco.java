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
    private Double valorParcImprestimo;

    public Banco(String nomeBanco, String numDaConta, Double valorParaImprestimo) {
        this.nomeBanco = nomeBanco;
        this.numDaConta = numDaConta;
        this.valorParcImprestimo = valorParaImprestimo;
    }

    public Banco() {
    }
    //Um construtor vazio sempre

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

    public Double getValorParcImprestimo() {
        return valorParcImprestimo;
    }

    public void setValorParcImprestimo(Double valorParcImprestimo) {
        this.valorParcImprestimo = valorParcImprestimo;
    }
    //Essa são as construção de construter e getter and setter (Vale a pena lembrar que o setId deve-se tirar)
}
