package Chap_09;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

import javax.swing.text.AbstractDocument.Content;

public class P01_FileMethod {
	private static final String foldername = "H:\\English";
	private static final String filename = "H:\\English\\\\[English] The philosophy of Stoicism - Massimo Pigliucci [DownSub.com].txt";

	public static void main(String[] args) {
//		myprint("FileMethod");
		File fileobj = new File(foldername);
		if (fileobj.exists()) {
			//lấy đến tên file
			myprint("getAbsolutePath() : " + fileobj.getAbsolutePath());
			//lấy folder chứa file
			myprint("getParrent() : " + fileobj.getParent());
			//canRead
			myprint("canread : " + fileobj.canRead());
			//canWrite
			myprint("canWrite : " + fileobj.canWrite());
			//chiều dài file (số ký tự)
			myprint("length : " + fileobj.length());
			//chỉnh sửa lần cuối
			Date dateobj = new Date(fileobj.lastModified());
			myprint("last modified: " + dateobj);
			//kiểm tra xem nó là thư mục hay tập tin
			myprint("directory :" +fileobj.isDirectory());
			myprint("file" + fileobj.isFile());
			myprint("=----------------=");
			File[] listfile = fileobj.listFiles();
			myprint(listfile.length+"");
			for (int i = 0; i < listfile.length; i++) {
				File filetmp = listfile[i];
				if (filetmp.isDirectory()) {
					myprint("Folder: " + filetmp.getName());
				}else if(filetmp.isFile()) {
				myprint("File: " +filetmp.getName());
			}}
		}else {
			try {
				fileobj.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			myprint("F*ck you, where is the file?");
		}
	}

	private static File listfile(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void myprint(String content) {
		System.out.println(content);

	}
}
