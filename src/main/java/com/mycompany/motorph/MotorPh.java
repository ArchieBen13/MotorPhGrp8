
package com.mycompany.motorph;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


/**
 *
 * @author UERM
 */
public class MotorPh {

public static void main(String[] args) {
    try {
      File myObj = new File("D:\\Comp Prog Group 8\\EmployeeMotorph\\Employees.csv");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] cols = data.split("\",\"", 0);
        for (String col : cols)
            System.out.println(col);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */