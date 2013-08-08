package com.lw.eeg.Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.omg.CORBA.PRIVATE_MEMBER;


import com.lw.eeg.EEGLog.*;
import com.lw.eeg.data.*;

import edu.emory.mathcs.jtransforms.fft.DoubleFFT_1D;


public class EEGAnalysis {
	private static EEGLog eegLogger;
	//private static double[][] data= new double[1][1000];
	private static Data dataHelper;
	private static EEGData eegData;
	
	public static void main(String[] args) throws Exception{
		eegLogger = new EEGLog();
		String eegFile="C:\\Users\\Leslie\\Desktop\\EEGdata\\"+"20130731_222748.csv";
		String hbFile="";
		String sensorFile="";
		eegData = new EEGData(eegFile);
		dataHelper= new Data(eegFile);
		dataHelper.getTotolData(eegData.readData(eegData.init()), null, null);
		//TODO fft
		//TODO bandpass filter
		//
		
		//DoubleFFT_1D doublefft= new DoubleFFT_1D(eegdata.getsize());
		
	}

	
		
		
}



