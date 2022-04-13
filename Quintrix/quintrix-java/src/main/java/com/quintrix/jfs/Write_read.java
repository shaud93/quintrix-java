package com.quintrix.jfs;

import java.io.*;

public class Write_read {

	public static void main(String[] args) 
	{
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\TOILETGOD\\Documents\\Temp\\output.txt"));
			bw.write("Hello\n");
			bw.write("World\n");
			bw.close();
			}
		catch(Exception ex) {return;}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\TOILETGOD\\Documents\\Temp\\output.txt"));
			String r;
			
			while((r = br.readLine()) != null)
			{System.out.println(r);}
			
			br.close();
			}
		catch(Exception ex) {return;}
	}

}
