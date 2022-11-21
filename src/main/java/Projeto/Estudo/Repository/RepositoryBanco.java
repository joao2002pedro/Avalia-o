package Projeto.Estudo.Repository;

import Projeto.Estudo.entity.Banco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryBanco extends JpaRepository<Banco, Long> {
}
