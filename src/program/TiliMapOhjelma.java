package program;

import java.util.HashMap;
import java.util.Map;

import model.Pankkitili;

public class TiliMapOhjelma {

	public static void main(String[] args) {

		Pankkitili pankkitili0 = new Pankkitili ("F1010101", 100.00,"Yksityinen", "Otto Meikäläinen");
		Pankkitili pankkitili1 = new Pankkitili ("F1010102", 300.00,"Yksityinen", "Eetu Meikäläinen");
		Pankkitili pankkitili2= new Pankkitili ("F1010103", 00.00,"Yksityinen", "Niko Meikäläinen");

		Map<String, Pankkitili> pankkitilit = new HashMap<String, Pankkitili>();
		pankkitilit.put("F1010101",pankkitili0);
		pankkitilit.put("F1010102", pankkitili1);
		pankkitilit.put("F1010103", pankkitili2);
		
		System.out.println(pankkitilit.get("F1010101"));

		
		
	}

}
