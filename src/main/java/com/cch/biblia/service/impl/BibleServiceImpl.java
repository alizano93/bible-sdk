package com.cch.biblia.service.impl;

import java.util.Base64;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cch.biblia.model.Capitulo;
import com.cch.biblia.model.Libro;
import com.cch.biblia.model.Pasaje;
import com.cch.biblia.model.Versiculo;
import com.cch.biblia.model.Version;
import com.cch.biblia.service.BibleService;

public class BibleServiceImpl implements BibleService{

	private final String AUTH = "GeGphOrt9ay4flLYOxR3ZwJaHezPFm0BPUai95Nn:X";
	private final String URL_LIBROS = "URL";
	@Override
	public List<Libro> getLibros() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		
		ResponseEntity<String> response = restTemplate.exchange(URL_LIBROS, HttpMethod.GET, getRequest(), String.class);
		System.out.println(response.getBody());
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
	
	private HttpEntity<String> getRequest(){
		byte[] plainCredsBytes = AUTH.getBytes();
		byte[] base64CredsBytes = Base64.getEncoder().encode(plainCredsBytes);
		String base64Creds = new String(base64CredsBytes);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + base64Creds);
		return new HttpEntity<String>(headers);
	}

}
