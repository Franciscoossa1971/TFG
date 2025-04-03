package com.almacen.gestion.service;

import java.util.List;
import java.util.Optional;

import com.almacen.gestion.model.Producto;


public interface ProductoService {
	public List<Producto> findAll();
	public Optional<Producto> findById(Integer id);
}
