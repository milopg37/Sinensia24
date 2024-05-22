package com.curso.repositorio;

import java.util.List;

import com.curso.modelos.Empleado;

public interface EmpleadoRepository {

	public Empleado encuentraUno(int id_emp);
	public List<Empleado> encuentraTodos();
	public void guardar(Empleado empleado);
	public void eliminar(Empleado empleado);
}
