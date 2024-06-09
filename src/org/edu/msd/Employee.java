
package org.edu.msd;

/**
 * Description: 
 * Author: mohpreetsingh
 * Date: 08-06-2024 05:59 pm
 */
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private Integer departmentCode;
    private Double salary;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(Integer departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(Integer employeeId, String employeeName, Integer departmentCode, Double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.departmentCode = departmentCode;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", departmentCode=" + departmentCode +
                ", salary=" + salary +
                '}';
    }

    public void printDetails(){
        System.out.println(this);
    }
}
