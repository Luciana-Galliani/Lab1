package it.polito.tdp.Lab01.model;

import java.util.List;
import java.util.*;

public class Parole {
	//attributi
	LinkedList<String> paroleInserite;
		
	public Parole() {
		//TODO
		//inizializzo gli attributi
		this.paroleInserite= new LinkedList<String>();
	}
	
	public void addParola(String p) {
		paroleInserite.add(p);
		//TODO
	}
	
	public List<String> getElenco() {
		//TODO
		//ordine alfabetico
		Collections.sort(paroleInserite);
		return paroleInserite;
	}
	
	public void reset() {
		// TODO
		paroleInserite.clear();
	}

	//creo i metodi
	
	//rimuovo la parola che seleziono
	public List<String> getLista(String a){
		if(paroleInserite.contains(a))
			paroleInserite.remove(a);
		return paroleInserite;
	}
	
	
}