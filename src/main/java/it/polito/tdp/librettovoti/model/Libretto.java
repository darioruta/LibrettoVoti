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
	
	
	

}
