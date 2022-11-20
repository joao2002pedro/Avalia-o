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
    private String Sobrenome;
    private Double valorImprestimo;
    private Integer quantParcelas;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Banco> banco;
}
