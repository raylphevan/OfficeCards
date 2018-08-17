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
