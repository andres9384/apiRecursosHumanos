package co.usa.recursoshumanos.recursoshumanos.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursoshumanos.recursoshumanos.model.Departamento;
import co.usa.recursoshumanos.recursoshumanos.repositorio.crud.DepartamentoCrudRepositorio;

@Repository
public class DepartamentoRepositorio {
    @Autowired

    private DepartamentoCrudRepositorio departamentoCrudRepositorio;

    public List<Departamento> getAll(){
        return (List<Departamento>)departamentoCrudRepositorio.findAll();
    }
    public Optional<Departamento>obtenerDepartamento(int id){
        return departamentoCrudRepositorio.findById(id);
    }

    public Departamento guardarDepartamento(Departamento dpto){
        return departamentoCrudRepositorio.save(dpto);
    }
    // public Departamento save(Departamento dpto){
    //     return departamentoCrudRepositorio.save(dpto);
    // }
}
