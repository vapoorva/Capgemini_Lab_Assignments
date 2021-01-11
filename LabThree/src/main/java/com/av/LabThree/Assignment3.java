/**
 * @author Ap00rva
 * Date :11/1/2021
 * Create a method which accepts a String and replaces all the consonants
 *  in the String with the next alphabet
 */
package com.av.LabThree;

import java.util.Scanner;

public class Assignment3 {

	private static String ReplaceConsonants(String string) {
		StringBuilder newWord = new StringBuilder();
		int flag = 0; // to check if character in string is a vowel
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < string.length(); i++) {

			flag = 0;
			for (char char2 : vowels) {
				// check if character matches a vowel if yes push it directly to buffer
				if (string.charAt(i) == char2) {
					newWord.append(string.charAt(i));
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				// if the char not a vowel change it to next alphabet push it in buffer
				if (string.charAt(i) == 'z')
					//if char is z append a into the string buffer
					newWord.append('a');
				else {
					char newChar = (char) ((int) string.charAt(i) + 1);
					newWord.append(newChar);
				}

			}

		}
		return newWord.toString().toUpperCase();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next().toLowerCase();
		System.out.println(ReplaceConsonants(string));
		sc.close();
	}

}
