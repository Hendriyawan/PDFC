package com.glanexdev.pdf.compressor;

/* 22 Februari 2018
 * by Hendriyawan
 * LoadingType class
 */
public class LoadingType
{
	//WAVE
	static String W_BLUE = Color.L_BLUE+"O"+Color.RESET+"oooo";
	static String W_RED = Color.L_RED+"oO"+Color.RESET+"ooo";
	static String W_YELLOW = Color.L_YELLOW+"ooO"+Color.RESET+"oo";
	static String W_GREEN = Color.L_GREEN+"oooO"+Color.RESET+"o";
	static String W_MAGENTA = Color.L_MAGENTA+"ooooO"+Color.RESET;

	//SPINNER
	static String S_BLUE = Color.L_BLUE+"/"+Color.RESET;
	static String S_RED = Color.L_RED+"-"+Color.RESET;
	static String S_YELLOW = Color.L_YELLOW+"\\"+Color.RESET;
	static String S_GREEN = Color.L_GREEN+"|"+Color.RESET;
	
	//POINT
	static String POINT_1 = Color.L_CYAN+"."+Color.RESET+"...";
	static String POINT_2 = "."+Color.L_CYAN+"."+Color.RESET+"..";
	static String POINT_3 = ".."+Color.L_CYAN+"."+Color.RESET+".";
	static String POINT_4 = "..."+Color.L_CYAN+"."+Color.RESET;
	
	/*wave animation loading.*/
	public static String[] WAVE = { W_BLUE, W_RED, W_YELLOW, W_GREEN, W_MAGENTA };

	/*spinner animation loading.*/
	public static String[] SPINNER = { S_BLUE, S_RED, S_YELLOW, S_GREEN };
	
	/*point animation loading*/
	public static String[] POINT = { POINT_1, POINT_2, POINT_3, POINT_4};
}
