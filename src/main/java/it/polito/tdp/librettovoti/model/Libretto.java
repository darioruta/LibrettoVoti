package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {
	
	private List <Voto> voti;

	public Libretto() {
		this.voti = new LinkedList <Voto> ();;
	}
	
	public void add(Voto v) {
		voti.add(v);
	}
	
	public String toString() {
		
		String ret  = "";
		for (Voto v : voti) {
			ret += v.toString()+ "\n";
			}
		
		return ret;
	}
	/*
	public void stampaVotiUguali(int punteggio) {
		//il libretto stampa da solo i voti;
	}
	
	public String votiUguali (int punteggio) {
		//calcola una string che contiene i voti
		//sara poi il chiamante a stamparli
		return null;
	}
	
	*/
	
	public List <Voto> listavotiUguali2 (int punteggio){
	
		//restituisce solo i voti uguali al criterio.
		//la migliore soluzione tra i 3 metodi; ma espone esternamente che struttura uso
		//sistemare i dati.
		LinkedList <Voto> ret = new LinkedList<Voto> ();
		for (Voto v: voti) {
			if (v.getVoto() == punteggio ) {
				ret.add(v);
			}
		}
		
		return ret;
		
	}

}
