package com.bridgelabz;
import java.util.HashMap;

public class Hash_Table_Main {
	public static void main(String[] args) {
		String string = "“Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] words = string.split(" ");

		Linked_Hash_Map linked_Hash_Map = new Linked_Hash_Map();

		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			Integer value = linked_Hash_Map.get(word);
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			linked_Hash_Map.put(word, value);
		}
		System.out.println(linked_Hash_Map);
	}

}
