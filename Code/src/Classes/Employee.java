/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author HP
 */
public class Employee extends Person{
    private String role;

    public Employee(int id, String name, String phoneNo, String role) {
        super(id, name, phoneNo);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    void describe(){ 
        System.out.println("Employee's ID: " + getId() + ", Employee's name: " + getName() + "Employee's PhoneNo: " + getPhoneNo() + "Employee's role: " + getRole());
    }
    
}
