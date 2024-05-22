package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;

/*
 * 응용문제 1.
 * D:\에 product directory 4개의 Image
 * 해당 Image upload라는 directory에 복사
 * 
 */
public class file16 {
	public static void main(String[] args) {
		String path = "D:\\product\\";
		String copyPath = "D:\\upload\\";
		
		File dir = new File(path);
		
		FilenameFilter filter = new FilenameFilter() {
			  @Override
			  public boolean accept(File f, String name) {
				  return name.contains("pd");
			  }
		};
		
		
		String[] fileNames = dir.list(filter);
		
		try {
			int w = 0;
			while(w < fileNames.length) {
				FileInputStream fs = new FileInputStream(path + fileNames[w]);
				byte[] by = new byte[fs.available()/1024];
				
				FileOutputStream os = new FileOutputStream(copyPath + fileNames[w]);
				
				int b = 0;
				while(true) {
					b = fs.read(by);
					if(b == -1) {
						break;
					} else {
						os.write(by,0,b);
					}
				}
				w++;
				os.flush();
				os.close();
				fs.close();
			}			
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
