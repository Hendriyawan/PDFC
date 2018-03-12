package com.glanexdev.pdf.compressor;

public class Loading extends Thread
{
	public boolean setRunning = true;
	private String message;
	private String[] animation;
	//console
	private Console console = new Console();

	public Loading(String message, String[] type){
		this.message = message;
		this.animation = type;
	}

	@Override
	public void run(){
		while(setRunning){
			for (int x = 0; x < animation.length; x++){
				console.printLoading("\r"+message+" "+animation[x]);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e){
					//handle exception
					console.printError("\n"+e.toString());
				}
			}
		}
		System.out.println("\r\n"+message+" "+"Done !\n");
	}
}
