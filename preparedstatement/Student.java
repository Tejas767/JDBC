package com.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Student {

	
	 public void insert() 
	    {
	        try 
	        {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3307/student","root","Root");
	            
	            String query = "insert into studentdetails values (?,?,?,?)";
	            PreparedStatement ps = c.prepareStatement(query);
	            
	            Scanner sc = new Scanner(System.in);
	            
	            System.out.println("Enter Student Id: ");
	            int id = sc.nextInt();
	            
	            System.out.println("Enter Student Name: ");
	            String name = sc.next();
	            
	            System.out.println("Enter Student Course: ");
	            String course = sc.next();
	            
	            System.out.println("Enter Student City: ");
	            String city = sc.next();
	            
	            ps.setInt(1, id);
	            ps.setString(2, name);
	            ps.setString(3, course);
	            ps.setString(4, city);
	            
	            int i = ps.executeUpdate();
	            if (i > 0)  System.out.println("Data Inserted");
	            else        System.out.println("Data Not Inserted");
	           
	           
	            }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }

	    public void update() 
	    {
	        try 
	        {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3307/student","root","Root");

	            String query = "update studentdetails set name=?, course=?, city=? where id=?";
	            PreparedStatement ps = c.prepareStatement(query);

	            Scanner sc = new Scanner(System.in);

	            System.out.println("Enter Student Id where you want to Update: ");
	            int id = sc.nextInt();

	            System.out.println("Enter New Student Name: ");
	            String name = sc.next();

	            System.out.println("Enter New Student Course: ");
	            String course = sc.next();

	            System.out.println("Enter New Student City: ");
	            String city = sc.next();

	            ps.setString(1, name);
	            ps.setString(2, course);
	            ps.setString(3, city);
	            ps.setInt(4, id);

	            int i = ps.executeUpdate();

	            if (i > 0)  System.out.println("Data Updated Successfully");
	            else        System.out.println("Data Not Updated");

	            
	        } 
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }


	    public void delete() 
	    {
	        try 
	        {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3307/student","root","Root");
	            
	            String query = "delete from studentdetails where id=?";
	            PreparedStatement ps = c.prepareStatement(query);
	            
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter Id to Delete Data: ");
	            int id = sc.nextInt();
	            
	            ps.setInt(1, id);  
	            
	            int i = ps.executeUpdate();
	            if (i > 0)  System.out.println("Data Deleted.");
	            else        System.out.println("Data Not Deleted");
	            
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    }

	    public void display() 
	    {
	        try 
	        {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "Root");
	            
	            String query = "select * from studentdetails";
	            PreparedStatement ps = c.prepareStatement(query);
	            
	            ResultSet rs = ps.executeQuery();
	            
	            System.out.println("\n*************************************************");
	            System.out.println("                📋 Student Records📋            ");
	            System.out.println("*************************************************");

	            while (rs.next())
	            {
	                int id = rs.getInt(1);
	                String name = rs.getString(2);
	                String course = rs.getString(3);
	                String city = rs.getString(4);

	                // Corrected the format specifier for course (from %d to %s)
	                System.out.printf("Student ID: %d\nStudent Name: %s\nStudent Course: %s\nStudent City: %s\n", id, name, course, city);
	                System.out.println("-------------------------------------------------");
	            }

	            System.out.println("*************************************************\n\n");
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    }


	}
	
	
	
	

