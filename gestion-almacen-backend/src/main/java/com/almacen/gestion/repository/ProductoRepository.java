package com.almacen.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.almacen.gestion.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
