package Projeto.Estudo.Controller;

import Projeto.Estudo.entity.Cliente;
import Projeto.Estudo.Repository.RepositoryCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
        @GetMapping("/{id}")
    @ResponseBody
        public Optional<Cliente> getClienteById(@PathVariable Long id)
        {
            Optional<Cliente> clienteReturned = repositoryCliente.findById(id);
            return clienteReturned;
        }
    @DeleteMapping("/{id}") //Deleta tal cliente atraves do id
    public String deleteClienteById(@PathVariable Long id) {
    try {
        Optional<Cliente> cliente = Optional.of(repositoryCliente.getById(id));
        if (cliente.isPresent()) {
            repositoryCliente.deleteById(id);
            return "Cliente de " + id + "deletado com sucesso! ";
        } else {
            throw new Exception("Cliente inexistente");   //throw significa jogar
        }
    } catch (Exception e) {
        e.printStackTrace();
        return "O cliente de " + id + " não existe para ser deletado! ";
    }
}
    @GetMapping //Puxa todos os cliente
    public List<Cliente> clienteList() {
        return repositoryCliente.findAll();
    }

}
