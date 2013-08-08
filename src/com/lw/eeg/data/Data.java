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
		return initdata;
	}
	protected String[][] readData(String[][] data) {
		return null;
		
	}
	public String[][] getTotolData(String[][] eeg, String[][] hb, String[][] sensor){
		for(int i=0; i < eeg.length; i++){
			System.out.print("\n row "+i + ":   ");
			for(int j=0; j< eeg[0].length; j++){		
				System.out.print(eeg[i][j]);
			}
		//System.out.println("\n");
		}
		
		return null;
	}

}



class HBData extends Data{

	public HBData(String _filepath) {
		super(_filepath);
		// TODO Auto-generated constructor stub
	}
	
	protected String[][] readData(String[][] data) {
		try {
			BufferedReader bufRdr;
			bufRdr = new BufferedReader(new FileReader(filepath));
 
			String line = null;
			int row = 0;
			int col = 0;
			 
			//read each line of text file
			
				while((line = bufRdr.readLine()) != null)
				{
					StringTokenizer st = new StringTokenizer(line,",");
					while (st.hasMoreTokens())
					{
						//get next token and store it in the array
						data[row][col] = st.nextToken();
						col++;
					}
					row++;
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			return data;
		
	}
	
}

class SensorData extends Data{

	public SensorData(String _filepath) {
		super(_filepath);
		// TODO Auto-generated constructor stub
	}
	
	protected String[][] readData(String[][] data) {
		try {
			BufferedReader bufRdr;
			bufRdr = new BufferedReader(new FileReader(filepath));
 
			String line = null;
			int row = 0;
			int col = 0;
			 
			//read each line of text file
			
				while((line = bufRdr.readLine()) != null)
				{
					StringTokenizer st = new StringTokenizer(line,",");
					while (st.hasMoreTokens())
					{
						//get next token and store it in the array
						data[row][col] = st.nextToken();
						col++;
					}
					row++;
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			return data;
		
	}
	
}


