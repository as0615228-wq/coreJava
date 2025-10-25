package string;

import java.util.Scanner;

public class Example {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String str=sc.nextLine();
		str=str.toLowerCase();

		int[]freq=new int[26];
		for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);

			if(ch>='a' && ch<='z') {
				freq[ch-'a']++;
			}
		}
		for(int i=0;i<26;i++) {
			if(freq[i]>0) {
				System.out.print((char) (i+'a')+"="+freq[i]);
			}
		}

	}
}


