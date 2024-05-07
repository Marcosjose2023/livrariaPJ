package com.livraria.livraria.Services;

import com.livraria.livraria.Entity.Funcionarios;
import com.livraria.livraria.Repository.FuncionariosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionariosServices {

    private FuncionariosRepository funcionariosRepository;

    public FuncionariosServices(FuncionariosRepository funcionariosRepository) {
        this.funcionariosRepository = funcionariosRepository;
    }
    public void cadastrarFuncionarios(Funcionarios funcionarios) {
        funcionariosRepository.save(funcionarios);
    }
    public Optional<Funcionarios> buscarFuncionarios (long id){
        return funcionariosRepository.findById(id);
    }
    public void deletarFuncionarios(Long id){
        funcionariosRepository.deleteById(id);
    }
    public Funcionarios editar(Funcionarios funcionarios){
        return funcionariosRepository.save(funcionarios);
    }
    public List<Funcionarios> listarTodosFuncionarios(){
        List<Funcionarios> FU = funcionariosRepository.findAll();
        return FU;
    }
    public Funcionarios atualizarFuncionarios (Funcionarios funcionarios) {
        return funcionariosRepository.save(funcionarios);
    }

}
