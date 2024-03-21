/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author HP
 */
public class Customer extends Person{

    public Customer(int id, String name, String phoneNo) {
        super(id, name, phoneNo);
    }
    @Override
    void describe(){
        System.out.println("Customer's name: " + getName() + ", Customer's ID: " + getId() + ", Customer's PhoneNo: " + getPhoneNo());
    }
}
