package com.glanexdev.pdf.compressor;
import java.io.*;
import com.itextpdf.text.DocumentException;

/** PDFC (Pdf Compressor with itextpdf libs)
* 07/03/2018 by Hendriyawan
* @github https://github.com/Hendriyawan
* @email : hendrijs44@gmail.com
* @facebook : www.facebook.com/hendri.glanex
*
*/
public class Main
{
	private static Console console = new Console();
	/**
	* class Main PDFC (PdfCompressor)
	* @param args
	*/
	public static void main(String[] args){
		if(args.length == 2){
			Title.setTitle(" PDF COMPRESSOR ");
			String inputPdfFile = checkInputFile(args[0]);
			String outputPdfFile = args[1];
			
			System.out.println();
			Loading loading = new Loading("Compressing", LoadingType.POINT);
			loading.start();
			try {
				
			    PdfCompressor pdfCompressor = new PdfCompressor();
			    pdfCompressor.setInputFile(inputPdfFile);
			    pdfCompressor.setOutputFile(outputPdfFile);
				pdfCompressor.compress();
				
				
			} catch (IOException | DocumentException e){
				//Handle exception
				System.out.println();
				console.printError(e.toString());
			}
			//stop loading
			loading.setRunning = false;
			System.out.println();
			//check if the file exists, then the process is successful
			if(fileExists(outputPdfFile)){
				System.out.println();
				console.printSucces("Original size    : \033[48;5;192;38;5;27m  "+FileSize.getSizeFile(new File(inputPdfFile))+"  \033[0m");
				console.printSucces("Compressed size  : \033[48;5;192;38;5;27m  "+FileSize.getSizeFile(new File(outputPdfFile))+"  \033[0m");
				System.out.println();
			}
		}
		else {
			Title.setTitle(" PDF COMPRESSER ");
			
			System.out.println("created by Hendriyawan");
			System.out.println();
			console.printError("Usage : pdfc <inputfile> <outputfile> \n");
			System.exit(1);
		}
	}
	
	/*PDFC (Pdf Compressor)
	* @param inputFile
	*/
	public static String checkInputFile(String inputFile){
		String file = "";
		File target = new File(inputFile);
		//check if exists
		if(target.exists()){
			file = inputFile;
		}
		else {
			System.out.println();
			console.printError("No such file or directory : "+inputFile+"\n");
			System.exit(1);
		}
		return file;
	}
	
	/*PDFC (Pdf Compressor)
	* @param outputFile
	*/
	public static boolean fileExists(String outputFile){
		boolean exists = false;
		File file = new File(outputFile);
		if(file.exists()){
			exists = true;
		}
		return exists;
	}
}
