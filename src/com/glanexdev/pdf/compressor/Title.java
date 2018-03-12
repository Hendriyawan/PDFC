package com.glanexdev.pdf.compressor;

public class Title
{
	public static void setTitle(String title){
		
		String[] color_number = { "126", "125", "124", "124", "124", "124", "124", "124", "125", "126" };
		//line upper
		for (int i = 0; i < color_number.length; i++){
			System.out.print("\033[38;5;"+color_number[i]+"m"+"=="+"\033[0m");
		}
		System.out.println();
		//title
		System.out.println("  \033[48;5;15;38;5;232m"+title+"\033[0m");
		//line lowwer
		for (int i = 0; i < color_number.length; i++){
			System.out.print("\033[38;5;"+color_number[i]+"m"+"=="+"\033[0m");
		}
		System.out.println();
	}
}
