package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	private List<String> parole;
	
	public Parole() {
		parole = new ArrayList<String>();
		//Parole = new LinkedList<String>();
	}
	
	
	public void addParola(String p) {
		parole.add(p);
		//TODO
	}
	
	public void removeParola(String p) {
		parole.remove(p);
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
		Collections.sort(parole, new ComparatoreParole());
	
		return parole;
	}
	
	public void reset() {
		// TODO
		parole.clear();
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
