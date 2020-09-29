package Ariketa1;

import java.util.HashMap;

public class OrdezkatzeHiztegia {
	
	private String gakoa = "ZXCVBNMASDFGHJKLQWERTYUIOP";
	private HashMap<Character, Character> enkrip=new HashMap<Character,Character>();
	private HashMap<Character, Character> desenkrip=new HashMap<Character,Character>();

	public OrdezkatzeHiztegia(){
		char hitza='A';
		int i=0;
		while(i<gakoa.length()){ //hasieratzeko HashMap.
			desenkrip.put(gakoa.charAt(i),hitza);
			enkrip.put(hitza, gakoa.charAt(i));
			i++;
			hitza++;
		}
	}
	
	
	
	public String zifratu(String mezua){
		String emaitza="";
		int i=0;
		while(i<mezua.length()){
			if(enkrip.containsKey(mezua.charAt(i))){ //ziurtatzeko sartu dudan key-a balore bat duela.
				emaitza=emaitza+enkrip.get(mezua.charAt(i));
			}
			else{// ez da izango letra bat , adb hutsune bat
				emaitza=emaitza+mezua.charAt(i);
			}
			i++;
		}
		return emaitza;
	}
	
	
	
	
	public String deszifratu(String kripto){
		String emaitza="";
		int i=0;
		while(i<kripto.length()){
			if(desenkrip.containsKey(kripto.charAt(i))){
				emaitza=emaitza+desenkrip.get(kripto.charAt(i));
			}
			else{
				emaitza=emaitza+kripto.charAt(i);
			}
			i++;
		}
		return emaitza;
	}
}
