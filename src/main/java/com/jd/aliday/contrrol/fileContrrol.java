package com.jd.aliday.contrrol;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

public class fileContrrol {
	public void getRainImg(HttpServletResponse response){
		response.setContentType("/image/gif");
		File file = new File("c:"+File.separator+"sun.jpg");
		FileInputStream fis=null;
		OutputStream output=null;
		try {
			fis=new FileInputStream(file);
			output =response.getOutputStream();
			byte[] buffer=new byte[fis.available()];
			fis.read(buffer);
			output.write(buffer);
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
