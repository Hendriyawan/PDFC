package com.glanexdev.pdf.compressor;

import java.io.*;
import java.text.*;

public class FileSize
{
	/** FileSize
	* @param file
	*/
	public static String getSizeFile(File file){
		String size = "";
		if(file.length() > 1024){
			//get size MB
			size = new DecimalFormat("##.##").format((double)file.length() / (1024*1024))+"MB";
		}
		else {
			//get size KB
			size = new DecimalFormat("##.##").format((double)file.length() / 1024)+"KB";
		}
		return size;
	}
}
