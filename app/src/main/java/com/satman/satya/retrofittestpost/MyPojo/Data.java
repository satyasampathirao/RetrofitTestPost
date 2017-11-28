package com.satman.satya.retrofittestpost.MyPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by satya on 28-11-2017.
 */

public class Data {

    @SerializedName("EmployeeID")
    @Expose
    public String employeeID;
    @SerializedName("EmployeeNAME")
    @Expose
    public String employeeNAME;
    @SerializedName("EmployeeUniqueId")
    @Expose
    public String employeeUniqueId;
    @SerializedName("EmployeeEMAIL")
    @Expose
    public String employeeEMAIL;
    @SerializedName("EmployeeCOMPANY")
    @Expose
    public String employeeCOMPANY;
    @SerializedName("EmployeeDESIG")
    @Expose
    public String employeeDESIG;
    @SerializedName("EmployeeIMAGE")
    @Expose
    public String employeeIMAGE;
    @SerializedName("CompanyID")
    @Expose
    public String companyID;
    @SerializedName("CompanyNAME")
    @Expose
    public String companyNAME;
    @SerializedName("CompanyEMAIL")
    @Expose
    public String companyEMAIL;
    @SerializedName("company_address")
    @Expose
    public String companyAddress;
    @SerializedName("CompanyPHONE")
    @Expose
    public String companyPHONE;


    @Override
    public String toString() {
        return "Data{" +
                "employeeID='" + employeeID + '\'' +
                ", employeeNAME='" + employeeNAME + '\'' +
                ", employeeUniqueId='" + employeeUniqueId + '\'' +
                ", employeeEMAIL='" + employeeEMAIL + '\'' +
                ", employeeCOMPANY='" + employeeCOMPANY + '\'' +
                ", employeeDESIG='" + employeeDESIG + '\'' +
                ", employeeIMAGE='" + employeeIMAGE + '\'' +
                ", companyID='" + companyID + '\'' +
                ", companyNAME='" + companyNAME + '\'' +
                ", companyEMAIL='" + companyEMAIL + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", companyPHONE='" + companyPHONE + '\'' +
                '}';
    }
}
