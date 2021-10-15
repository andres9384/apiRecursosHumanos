package co.usa.recursoshumanos.recursoshumanos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.recursoshumanos.recursoshumanos.model.Empleado;
import co.usa.recursoshumanos.recursoshumanos.repositorio.EmpleadoRepositorio;

@Service

public class EmpleadoServicio {
    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    public List<Empleado> obtenerTodo() {
        return empleadoRepositorio.obtenerTodo();
    }

    public Optional<Empleado> obtenerEmpleado(int id) {
        return empleadoRepositorio.obtenerEmpleado(id);
    }

    public Empleado guardar(Empleado empleado){
        if (empleado.getNumId()==null) {
            return empleadoRepositorio.guardar(empleado);
        }else{
            Optional<Empleado> consulta= empleadoRepositorio.obtenerEmpleado(empleado.getNumId());
            if (consulta.isEmpty()) {
                return empleadoRepositorio.guardar(empleado);
            }else{
                return empleado;
            }
        }
   
    }
}
