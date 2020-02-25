package com.collection.maps.testing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Testing2 {

	public static void main(String[] args) throws IOException {
		Map<Integer,File> hm = new HashMap<>();
		 File f1= new File("C:\\Users\\abhimanyum\\Desktop\\code1.txt");
		 File f2= new File("C:\\Users\\abhimanyum\\Desktop\\retrived.txt");
		 hm.put(111,f1);
		 hm.put(222,f2);
		 
		 System.out.println(hm);
		 
		 List<File> fileList= new ArrayList<>(hm.values());
		 File fl1 = fileList.get(0);
		 File fl2 = fileList.get(1);
		 
		 System.out.println(fileList.getClass().getSimpleName());
		 
		 FileReader fr1 = new FileReader(f1);
		 FileReader fr2 = new FileReader(f2);
		 
		 char[] chr1= new char[(int) fl1.length()];
		 char[] chr2= new char[(int) fl1.length()];
		 
		 fr1.read(chr1);
		 fr2.read(chr2);
		 
		 List li1=Arrays.asList(chr1);
		 List li2=Arrays.asList(chr2);
		 
		 System.out.println(li1);
		 System.out.println(li2);
		 
		 System.out.println(chr1);
		 System.out.println(chr2);
		 
		 
	}
}
