package com.atul;

import java.util.*;
import java.lang.*;
import java.io.*;

class KeyPadTyping {
	
	int number;
	char character;
	String string;
	
    
    public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public char getCharacter() {
		return character;
	}
	public void setCharacter(char character) {
		this.character = character;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public int hashCode() {

		int returnNumber = 0;
		
		if(character == 'A' || character == 'B' || character == 'C') {
			returnNumber = 2;
		}
		
		if(character == 'D' || character == 'E' || character == 'F') {
			returnNumber = 3;
		}
		
		if(character == 'G' || character == 'H' || character == 'I') {
			returnNumber = 4;
		}
		
		return returnNumber;
	}
		
	
	public boolean equals(Object kepad) {
		return false;
	}
	
	
	public static void main (String[] args) {
		KeyPadTyping keyPadA = new KeyPadTyping();
		KeyPadTyping keyPadB = new KeyPadTyping();
		KeyPadTyping keyPadC = new KeyPadTyping();
		KeyPadTyping keyPadD = new KeyPadTyping();
		keyPadA.setCharacter('A');
		keyPadB.setCharacter('D');
		keyPadC.setCharacter('F');
		keyPadD.setCharacter('G');
	    HashMap<KeyPadTyping,String> map = new HashMap<KeyPadTyping,String>();
	    map.put(keyPadA, "A");
	    map.put(keyPadB, "D");
	    map.put(keyPadC, "F");
	    map.put(keyPadD, "G");
	    System.out.println(map);
	    
		
	}
}