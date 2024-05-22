package com.curso.repositorio;

import java.util.List;

import com.curso.modelos.Departamento;

public interface DepartamentoRepository {

	public Departamento encuentraUno(int id_dept);
	public List<Departamento> encuentraTodos();
	public void guardar(Departamento departamento);
	public void eliminar(Departamento departamento);
}
