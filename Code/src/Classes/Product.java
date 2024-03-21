/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Hungly1402
 */
public class Product {
    private Integer id;
    private String name;
    private String category;
    private Integer quantity;
    private Double inPrice;
    private Double outPrice;

    public Product(Integer id, String name, String category, int quantity, double inPrice, double outPrice) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.inPrice = inPrice;
        this.outPrice = outPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getInPrice() {
        return inPrice;
    }

    public void setInPrice(Double inPrice) {
        this.inPrice = inPrice;
    }

    public Double getOutPrice() {
        return outPrice;
    }

    public void setOutPrice(Double outPrice) {
        this.outPrice = outPrice;
    }
    void describe(){
        System.out.println("Product's ID: " + id + ", Product's name: " + name + ", Product's category: " + category + ", Product's quantity: " + quantity + ", Product's inPrice: " + inPrice + ", Product's outPrice: " + outPrice);
    }
    
}
