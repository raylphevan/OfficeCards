/*
 Raylph Evangelista
 revange9@my.smccd.edu
 CIS 135OL
 Employee.java

 This file is the Employee class file. This file will basically describe what an Employee object is
 and will include 3 instance data variables as well as a constructor with all three of them as
 parameters. This file will also include getters and setters for the instance data.

 Assignment #4
 4/6/18
 */
package com.evangelista.officecards;

import android.media.Image;

public class Employee
{
    private String empName;
    private String empPosition;
    private int empPicture;

    public Employee(String empName, String empPosition, int empPicture)
    {
        this.empName = empName;
        this.empPosition = empPosition;
        this.empPicture = empPicture;
    }

    public String getEmpName()
    {
        return empName;
    }

    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public String getEmpPosition()
    {
        return empPosition;
    }

    public void setEmpPosition(String empPosition)
    {
        this.empPosition = empPosition;
    }

    public int getEmpPicture()
    {
        return empPicture;
    }

    public void setEmpPicture(int empPicture)
    {
        this.empPicture = empPicture;
    }
}
