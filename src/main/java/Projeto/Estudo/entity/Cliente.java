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
    private String Cpf;
    private Integer quantParcelas;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Banco> banco;

    public Cliente(String nome, String cpf, Integer quantParcelas, List<Banco> banco) {
        this.nome = nome;
        Cpf = cpf;
        this.quantParcelas = quantParcelas;
        this.banco = banco;
    }
    public Cliente() {
    }

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
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
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
}
