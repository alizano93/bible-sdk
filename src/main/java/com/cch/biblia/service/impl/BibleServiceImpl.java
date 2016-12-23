package com.cch.biblia.service.impl;

import java.util.List;

import com.cch.biblia.model.Capitulo;
import com.cch.biblia.model.Libro;
import com.cch.biblia.model.Pasaje;
import com.cch.biblia.model.Versiculo;
import com.cch.biblia.model.Version;
import com.cch.biblia.service.BibleService;

public class BibleServiceImpl implements BibleService{

	@Override
	public List<Libro> getLibros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Version> getVersiones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Capitulo> getCapitulos(String abrev) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Versiculo> getVersiculos(String abrev, int ncap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Capitulo getCapitulo(String abrev, int ncap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Versiculo getVersiculo(String abrev, int ncap, int nver) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pasaje getPasaje(String abrev, int ncap, int verInicial, int verFinal) {
		// TODO Auto-generated method stub
		return null;
	}

}
