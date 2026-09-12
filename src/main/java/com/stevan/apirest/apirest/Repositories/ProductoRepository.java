package com.stevan.apirest.apirest.Repositories;

import com.stevan.apirest.apirest.Entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {



}
