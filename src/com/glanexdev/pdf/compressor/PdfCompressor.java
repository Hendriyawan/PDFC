package com.glanexdev.pdf.compressor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;

public class PdfCompressor
{
	private String inputPdfFile;
	private String outputPdfFile;
	private Console console = new Console();
	/**
	* PdfCompresser
	* Constructor
	*/
	public PdfCompressor(){
	}
	
	/**
	* @param inputPdfFile set input pdf file
	*/
	public void setInputFile(String inputPdfFile){
		this.inputPdfFile = inputPdfFile;
	}
	
	/**
	* @param outputPdfFile set output pdf file
	*/
	public void setOutputFile(String outputPdfFile){
		this.outputPdfFile = outputPdfFile;
	}
	
	public void compress() throws IOException, DocumentException {
		
		PdfReader reader = new PdfReader(new FileInputStream(inputPdfFile));
		PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(outputPdfFile));
		//stamper.getWriter().setCompressionLevel(9);
		
		reader.removeFields();
		reader.removeUnusedObjects();
		
		int total = reader.getNumberOfPages() + 1;
		for (int i = 1; i < total; i++){
			reader.setPageContent(i + 1, reader.getPageContent(i + 1));
		}
		try {
			stamper.setFullCompression();
			stamper.close();
			
		} catch (DocumentException e){
			System.out.println();
			console.printError(e.toString());
		}
	}
}
