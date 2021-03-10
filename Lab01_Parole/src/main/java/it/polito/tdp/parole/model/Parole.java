package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	private List<String> Parole;
	
	public Parole() {
		Parole = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		Parole.add(p);
		//TODO
	}
	
	public class ComparatoreParole implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
		
	}
	
	public List<String> getElenco() {
		//TODO
		Collections.sort(Parole, new ComparatoreParole());
	
		return Parole;
	}
	
	public void reset() {
		// TODO
		Parole.clear();
	}

	@Override
	public String toString() {
		String elenco = "";
		for(String s: getElenco()) {
			elenco+=s+"\n";
		}
		return elenco;
	}
	
	

}
