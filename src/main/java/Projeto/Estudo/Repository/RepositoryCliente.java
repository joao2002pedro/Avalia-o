package Projeto.Estudo.Repository;

import Projeto.Estudo.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCliente extends JpaRepository<Cliente, Long>{
}
