/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author khang
 */
abstract public class Person {
    private int Id;
    private String name;
    private String phoneNo;
    public Person(int Id, String name, String phoneNo) {
        this.Id = Id;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.phoneNo = phoneNo;
    }
    abstract void describe();
}
