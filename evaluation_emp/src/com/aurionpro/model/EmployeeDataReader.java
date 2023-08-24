package com.aurionpro.model;


import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDataReader {
	try{
	    FileOutputStream writeData = new FileOutputStream("peopledata.ser");
	    ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

	    writeStream.writeObject(people);
	    writeStream.flush();
	    writeStream.close();

	}catch (IOException e) {
	    e.printStackTrace();
	}
}