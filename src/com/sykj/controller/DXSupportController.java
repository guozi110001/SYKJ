package com.sykj.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;

public class DXSupportController extends Controller {
	
	public void index(){
		
	}
	
	public void uploadPics(){
		 UploadFile uploadFile=this.getFile();
	
	        
	     String fileName=uploadFile.getOriginalFileName();
	        
	     System.out.println("fileName:"+fileName);
	     File file=uploadFile.getFile();    
//	     FileService fs=new FileService();    
	     File t=new File("D:\\file\\"+UUID.randomUUID().toString());
	     try {
            t.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//        fs.fileChannelCopy(file, t);
//        file.delete();
        this.renderHtml("success,<a href=\"./\">back</a>");
	}
}
