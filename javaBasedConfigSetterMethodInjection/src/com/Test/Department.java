package com.Test;

public class Department 
{
    private int DepartmentId;
    private String DepartmentName;
    

   public int getDepartmentId() {
		return DepartmentId;
	}

    public void setDepartmentId(int departmentId) {
		DepartmentId = departmentId;
	}

    public String getDepartmentName() {
		return DepartmentName;
	}


    public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}


    @Override
	public String toString() {
		return "Department [DepatmentId=" + DepartmentId + ", Departmentname=" + DepartmentName + "]";
	}

	
    
    
}
