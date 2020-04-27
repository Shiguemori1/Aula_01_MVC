package model.service;

import java.io.IOException;

import model.dao.FilmeDAO;
import model.entity.Filme;

public class FilmeService {

	public int inserirFilme(Filme filme) throws IOException {
		FilmeDAO dao = new FilmeDAO();
		return dao.inserirFilme(filme);
	}

	public Filme buscarFilme(int id) throws IOException {
		FilmeDAO dao = new FilmeDAO();
		return dao.buscarFilme(id);
	}
}
