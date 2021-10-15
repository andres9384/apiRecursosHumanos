package co.usa.recursoshumanos.recursoshumanos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.recursoshumanos.recursoshumanos.model.Departamento;
import co.usa.recursoshumanos.recursoshumanos.repositorio.DepartamentoRepositorio;

@Service
public class DepartamentoServicio {
    @Autowired
    private DepartamentoRepositorio departamentoRepositorio;

    public List<Departamento>getAll(){
        return  departamentoRepositorio.getAll();
    }
    public Optional<Departamento>obtenerDepartamento(int id){
        return departamentoRepositorio.obtenerDepartamento(id);
    }
    public Departamento guardarDepartamento(Departamento dpto){
        if(dpto.getNumId()==null){
            return departamentoRepositorio.guardarDepartamento(dpto);

        }else{
            Optional<Departamento> consulta= departamentoRepositorio.obtenerDepartamento(dpto.getNumId());
            if (consulta.isEmpty()) {
                return departamentoRepositorio.guardarDepartamento(dpto);
            }else{
                return dpto;
            }
        }
    }
}
