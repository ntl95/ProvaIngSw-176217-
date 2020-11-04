package it.unical.ingswLab.ProvaLaboratorio;

import java.util.Collections;
import java.util.List;


public class MyListUtil {
	
	public List<Integer> sortList (List<Integer> input, String ordinamento){
		
		if(ordinamento == "crescente") {
			Collections.sort(input);		
		}
		else {
			Collections.sort(input);
			Collections.reverse(input);
		}
		
		return input;
	}

}
