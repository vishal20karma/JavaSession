package lesson1;

import java.io.IOException;

public class externalApps {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

//  How to launch external apps like notepad, vlc, regular chrome etc with Java	
/*  Runtime rt = Runtime.getRuntime();	
	Process pr1 = rt.exec("notepad.exe");
	Thread.sleep(2000);
	pr1.destroy();   */
		
//  For Practice
	Runtime rt = Runtime.getRuntime();
	Process pr1 = rt.exec("notepad.exe");
	pr1.destroy();
	
//  How to launch any saved notepad from computer
/*	Process pr2 = rt.exec("notepad.exe E:\\Selenium + RPA\\Selenium IQ");
	Thread.sleep(2000);
	pr2.destroy();   */
	
//	For Practice
	Process pr2 = rt.exec("notepad.exe E:\\Selenium + RPA + DevOps\\Selenium IQ");
	Thread.sleep(2000);
	pr2.destroy();
	
//  How to open regular chrome
/*	String [] s1 = new String [] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.rahulshettyacademy.com/"};
	Process pr3 = rt.exec(s1);
	Thread.sleep(5000);
	pr3.destroy();   */
	
//  For Practice
	String [] s1 = new String [] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.rahulshettyacademy.com/"};
	Process pr3 = rt.exec(s1);
	Thread.sleep(2000);
	pr3.destroy();
	

	}

}
