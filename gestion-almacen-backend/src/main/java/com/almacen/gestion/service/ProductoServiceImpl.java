package com.almacen.gestion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.almacen.gestion.model.Producto;
import com.almacen.gestion.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<Producto> findAll() {
		return productoRepository.findAll();
	}
	
	@Override
	public Optional<Producto> findById(Integer id) {
		return productoRepository.findById(id);
	}

}
