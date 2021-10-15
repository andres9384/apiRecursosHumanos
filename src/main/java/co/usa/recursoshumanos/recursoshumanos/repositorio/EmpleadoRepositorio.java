package co.usa.recursoshumanos.recursoshumanos.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursoshumanos.recursoshumanos.model.Empleado;
import co.usa.recursoshumanos.recursoshumanos.repositorio.crud.EmpleadoCrudRepositorio;

@Repository
public class EmpleadoRepositorio {
    @Autowired
    private EmpleadoCrudRepositorio empleadoCrudRepositorio;

    public List<Empleado>obtenerTodo(){
        return (List<Empleado>)empleadoCrudRepositorio.findAll();
    }
    public Optional<Empleado>obtenerEmpleado(int id){
        return empleadoCrudRepositorio.findById(id);
    }
    public Empleado guardar(Empleado empleado){
        return empleadoCrudRepositorio.save(empleado);
    }
}
