package com.glanexdev.pdf.compressor;

public class Console
{
	public void printProcess(String message){
		System.out.println(Color.L_BLUE+"[*] "+Color.RESET+message);
	}

	public void printSucces(String message){
		System.out.println("\033[38;5;43m"+"[+] "+Color.RESET+message);
	}

	public void printLoading(String message){
		System.out.print(message);
	}

	public void printError(String message){
		System.out.println(Color.RED+"[!] "+Color.RESET+message);
	}
}
