package com.cch.biblia.service;

import java.util.List;

import com.cch.biblia.model.Capitulo;
import com.cch.biblia.model.Libro;
import com.cch.biblia.model.Pasaje;
import com.cch.biblia.model.Versiculo;
import com.cch.biblia.model.Version;

/**
 * En esta clase no debe hacer nada agregue la implementación de los metodos en la clase BibleServiceImpl
 * que se encuentra en el paquete com.cch.biblia.service.impl
 * @author andreslizano
 *
 */
public interface BibleService {
	
	/**
	 * Devuele la lista de libros (para hacer tabla de contenidos o ver libro siguiente y anterior
	 * @return List Libro
	 */
	public List<Libro> getLibros();
	
	/**
	 * Devuelve las versiones disponibles
	 * @return List Version
	 */
	public List<Version> getVersiones();
	
	/**
	 * Devuelve la lista de capitulos de un libro
	 * @param abrev Abreviatura de libro
	 * @return Lista de Capitulos
	 */
	public List<Capitulo> getCapitulos(String abrev);
	
	/**
	 * Devuelve la lista de versiculos de un capitulo
	 * @param abrev abreviatura del libro
	 * @ncap numero del capitulo del libro
	 * @return
	 */
	public List<Versiculo> getVersiculos(String abrev, int ncap);
	
	/**
	 * Para este metodo puede llamar a getcapitulos con el parametro abrev y luego devolver el cpitulo con el param ncap 
	 * @param abrev abreviatura del libro
	 * @return
	 */
	public Capitulo getCapitulo(String abrev, int ncap);
	
	/**
	 * De la misma forma puede llamar a getVersiculos y devolver el versiculo deseado
	 * @param abrev
	 * @param ncap
	 * @param nver
	 * @return
	 */
	public Versiculo getVersiculo(String abrev, int ncap, int nver);
	
	/**
	 * devuelve el pasaje utilizando los parametros
	 * @param abrev
	 * @param ncap
	 * @param verInicial
	 * @param verFinal
	 * @return
	 */
	public Pasaje getPasaje(String abrev, int ncap, int verInicial, int verFinal);
	
	

}
