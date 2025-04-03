package com.almacen.gestion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.almacen.gestion.model.Producto;
import com.almacen.gestion.service.ProductoService;



@RestController
@CrossOrigin(origins = "http://localhost:5432")
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	@GetMapping("/findAll")
	public List<Producto> findAll() {
		return productoService.findAll();
	}

	@GetMapping("/findById")
	public Optional<Producto> findById(@RequestParam Integer id) {
		return productoService.findById(id);
	}

}
