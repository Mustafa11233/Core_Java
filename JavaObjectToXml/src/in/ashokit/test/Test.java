package in.ashokit.test;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import in.ashokit.Employee;

public class Test {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		
		e.setEmpId(120);
		e.setEmpName("Rani");
		e.setEmpSalary(2700.00);
		
		 // convert the object to XML and write it to a file
		try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("D:\\Problems\\RAJA.xml")))) {
		      encoder.writeObject(e);
		    } catch (IOException k) {
		      k.printStackTrace();
		    }
		
		// read the XML file and convert it back into a Java object
//	    try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("D:\\Problems\\RAJA.xml")))) {
//	    	Employee e= (Employee) decoder.readObject();
//	      System.out.println(e.toString());
//	    } catch (IOException e) {
//	      e.printStackTrace();
//	    }
	  }

	}