package com.livraria.livraria.Services;

import com.livraria.livraria.Entity.Clientes;
import com.livraria.livraria.Repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesServices {
    @Autowired
    private ClientesRepository clientesRepository;

    public ClientesServices(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }
    public void cadastrarCliente(Clientes clientes) {
        clientesRepository.save(clientes);
    }
    public Optional <Clientes> buscarCliente (long id){
        return clientesRepository.findById(id);
    }
    public void deletarCliente(Long id){
        clientesRepository.deleteAllById(id);
    }
    public Clientes editar(Clientes clientes){
        return clientesRepository.save(clientes);
    }
    public List<Clientes> listarCliente(){
        List<Clientes> Cls = clientesRepository.findAll();
        return Cls;
    }

//   public void inativar(Long id) {
//       Optional<Clientes> optionalClientes = clientesRepository.findById(id);
//       if (optionalClientes.isPresent()) {
//           Clientes clientes = optionalClientes.get();
//           clientes.setAtivo(false);
//           clientesRepository.save(clientes);
//       } else {
//           //notificacao caso nao for encontrado
//           throw new RuntimeException("cliente não encontrado com o ID" + id);
//       }
//   }
}
