package com.lw.eeg.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Data {
	private static CSVHelper csvHelper = new CSVHelper();
	protected String filepath;
	private int[] size=new int[2];
	
	public Data(String _filepath){
		filepath=_filepath;
	}
	
	public String[][] init()throws Exception{
		csvHelper.setFilename(filepath);
		size=csvHelper.count();
		String[][] initdata = new String[size[0]][size[1]];
		//System.out.println("init()"+ initdata.length);
		return initdata;
	}
	protected String[][] readData(String[][] data) {
		return null;
		
	}
	public String[][] getTotolData(String[][] eeg, String[][] hb, String[][] sensor){
		/*for(int i=0; i < eeg.length; i++){
			System.out.print("\n row "+i + ":   ");
			for(int j=0; j< eeg[0].length; j++){		
				System.out.print(eeg[i][j]);
			}
		}*/
		
		
		return null;
	}

}



