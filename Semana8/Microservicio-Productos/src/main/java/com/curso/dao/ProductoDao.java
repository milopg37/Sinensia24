package com.curso.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.curso.model.Producto;

public interface ProductoDao extends JpaRepository<Producto, Integer> {
	
	/**
	 * Query
	 * Metodo
	 * Si no tiene el Tag Modifying crashea
	 */
	@Transactional
	@Modifying
	@Query("UPDATE Producto p SET p.stock = p.stock - :restarStock WHERE p.codProducto = :codProducto")
	void actualizarStock(@Param("codProducto") int codProducto, @Param("restarStock") int restarStock);
	
	/**
	 * Query
	 * Metodo
	 * @return
	 */
	@Query("SELECT p.precio FROM Producto p WHERE p.codProducto = :codProducto")
	int obtenerPrecio(@Param("codProducto") int codProducto);
}