package modelo;

import java.util.Vector;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Sistema de Colocación de Publicaciones
//  @ File Name : Publicacion.java
//  @ Date : 26/04/2015
//  @ Author : 
//
//




public abstract class Publicacion {
	private int codigo;
	private String titulo;
	private String editor;
	private String tema;
	private String subtema;
	private String publico;
	private int periodicidad;
	private String idioma;
	private String paisDeOrigen;
	private Vector<Edicion> ediciones;
	public abstract void getUltimasTresEdiciones();
}
