package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;


//POJO 
//Java Bean
//questa classe è un contenitore di dati -- non ha logica;

/**
 * Memorizza il risuktato di un esame singolo
 * 
 * @author Acer
 *
 */

public class Voto {
	
	private String nomeCorso;
	private int voto; //occhio come rappresento 30L
	private LocalDate data;
	
	public Voto(String nomeCorso, int voto, LocalDate data) {
		
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.data = data;
	}
	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return this.getNomeCorso()+" "+this.getVoto()+ " "+ this.getData();
	}
	
	
	
}
