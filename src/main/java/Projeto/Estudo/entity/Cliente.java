package Projeto.Estudo.entity;

import javax.persistence.*;
import java.util.List;

@Entity                 //Criação de coluna no banco
public class Cliente
{
    @Id                 //Mostrar id
    @GeneratedValue(strategy = GenerationType.AUTO)         //Função da biblioteca que gera automaticamente id
    private Long id;
    private String nome;
    private String cpf;
    private Double valorImprestimo;
    private Integer quantParcelas;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Banco> banco;
//Essa é a primeira parte para acrescentar ao postman, apos a lista do Banco deve-se constar
// [
// {
// }
// ]
//



    public Cliente(String nome, String cpf, Double valorImprestimo, Integer quantParcelas, List<Banco> banco) {
        this.nome = nome;
        this.cpf = cpf;
        this.valorImprestimo = valorImprestimo;
        this.quantParcelas = quantParcelas;
        this.banco = banco;
    }

    public Cliente() {
    }
    //Um construtor vazio sempre

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getValorImprestimo() {
        return valorImprestimo;
    }

    public void setValorImprestimo(Double valorImprestimo) {
        this.valorImprestimo = valorImprestimo;
    }

    public Integer getQuantParcelas() {
        return quantParcelas;
    }

    public void setQuantParcelas(Integer quantParcelas) {
        this.quantParcelas = quantParcelas;
    }

    public List<Banco> getBanco() {
        return banco;
    }

    public void setBanco(List<Banco> banco) {
        this.banco = banco;
    }
    //Essa são as construção de construter e getter and setter (Vale a pena lembrar que o setId deve-se tirar)
}
