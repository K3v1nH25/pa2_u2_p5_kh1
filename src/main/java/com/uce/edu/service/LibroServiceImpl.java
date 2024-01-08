package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ILibroRepository;
import com.uce.edu.repository.modelo.Libro;

@Service
public class LibroServiceImpl implements ILibroService {

	@Autowired
	private ILibroRepository ilibroRepository;

	@Override
	public Libro buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ilibroRepository.seleccionar(id);
	}

	@Override
	public void guardar(Libro libro) {
		// TODO Auto-generated method stub
		this.ilibroRepository.insertar(libro);

	}

	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		this.ilibroRepository.actualizar(libro);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.ilibroRepository.eliminar(id);

	}

}