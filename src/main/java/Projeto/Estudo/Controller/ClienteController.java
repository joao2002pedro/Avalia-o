package Projeto.Estudo.Controller;

import Projeto.Estudo.entity.Cliente;
import Projeto.Estudo.Repository.RepositoryCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cliente/v1")
public class ClienteController {
        @Autowired
        private RepositoryCliente repositoryCliente;
        @PostMapping
        @ResponseBody
    public Cliente create(@RequestBody Cliente cliente)
        {
            Cliente clienteSaved = repositoryCliente.save(cliente);
            return clienteSaved;
        }
}
