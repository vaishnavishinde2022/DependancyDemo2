package com.example;

import org.springframework.stereotype.Component;

//this annotation is used to denote a class as componant.It means that spring boot will autodetect this class for dependency injection.
@Component
public class Customers
{
   private int custId;
   private String custName;
   private String courseName;
   
   public int getCustId() 
   {
	return custId;
    }
 public void setCustId(int custId) 
{
	this.custId = custId;
}


public String getCustName() 
{
	return custName;
}
public void setCustName(String custName) 
{
	this.custName = custName;
}


public String getCourseName()
{
	return courseName;
}
public void setCourseName(String courseName)
{
	this.courseName = courseName;
}

public void dispaly()
{
	System.out.println("customers object returned successfully..");
}

}//class end
