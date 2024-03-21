/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Hungly1402
 */
public class Invoice {
    private Integer saleId;
    private Integer invoiceId;
    private Integer customerId;
    private String customerName;
    private int totalQty;
    private Double totalBill;
    private String status;
    private Double balance;

    public Invoice(int saleId, int invoiceId, int customerId, String customerName, int totalQty, Double totalBill, String status, Double balance) {
        this.saleId = saleId;
        this.invoiceId = invoiceId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.totalQty = totalQty;
        this.totalBill = totalBill;
        this.status = status;
        this.balance = balance;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }

    public Double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(Double totalBill) {
        this.totalBill = totalBill;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    
    
    
}
