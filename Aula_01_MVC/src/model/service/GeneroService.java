package model.service;

import java.io.IOException;
import java.util.ArrayList;

import model.dao.GeneroDAO;
import model.entity.Genero;

public class GeneroService {
	public ArrayList<Genero> listarGeneros() throws IOException {
		GeneroDAO dao = new GeneroDAO();
		return dao.listarGeneros();
	}
}
