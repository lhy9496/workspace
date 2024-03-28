package ncs.test12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropTest {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("1", "apple,1200,3");
		prop.setProperty("2", "banana,2500,2");
		prop.setProperty("3", "grape,4500,5");
		prop.setProperty("4", "orange,800,10");
		prop.setProperty("5", "melon,5000,2");
		
		/*
		Enumeration enumeration = prop.propertyNames(); // key만 모아서 가져오고 싶으면 .propertyNames(); 사용
		
		while(enumeration.hasMoreElements()) {
			String element = (String) enumeration.nextElement(); // key를 하나씩 뽑는다.
			System.out.println(element + " = " + prop.getProperty(element));
			// prop.getProperty(key) => value를 가져오고 있다.
		}
		*/
		
		fileSave(prop);
		fileOpen(prop);
	}
		
	public static void fileSave(Properties p) {
		try {
			p.storeToXML(new FileOutputStream("data.xml"), "Properties Example");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void fileOpen(Properties p) {
		try {
			p.loadFromXML(new FileInputStream("data.xml"));
			Fruit[] fruitArr = new Fruit[p.size()];
			Enumeration enumeration = p.propertyNames();
			
			for(Fruit f : fruitArr) {
				String key = (String) enumeration.nextElement();
				String value = p.getProperty(key);
				String[] values = value.split(",");
				f = new Fruit(values[0], Integer.parseInt(values[1]), 
						      Integer.parseInt(values[2]));
				System.out.println(key + " = " + f.toString());
			}
			
			/*
			while (enumeration.hasMoreElements()) {
				String element = (String) enumeration.nextElement(); // key를 하나씩 뽑는다.
				System.out.println(element + " = " + p.getProperty(element));
				// prop.getProperty(key) => value를 가져오고 있다.
			}
			*/
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
