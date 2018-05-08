package com.android.uiautomator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileUtils {

	public static void writeLine(String text){
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					"locators.txt"), true));
			bw.write(text);
			bw.newLine();
			bw.close();
		} catch (Exception e) {
		}
	}
	
}
