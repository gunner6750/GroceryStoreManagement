package OOP_Project;

import java.util.Scanner;

class Product
{
	private
		int id;
		String name;
		int quantity;
	protected
		float price;
	public
		Product(int id, String name, int quantity, float price)
		{
			this.id = id;
			this.name = name;
			this.quantity = quantity;
			this.price = price;
		}
		int getId()
		{
			return id;
		}
		String getName()
		{
			return name;
		}
		int getQuantity()
		{
			return quantity;
		}
		float getPrice()
		{
			return price;
		}
		void describe()
		{
			System.out.println("Product ID: " + id + ", Name: " + name + ", Quantity: " + quantity + ", Price: " + price);
		}
}
//Abstract class
abstract class Person
{
	private
		int id;
		String name;
		String phone_no;
		String address;
	public
		Person(int id, String name, String phone_no, String address)
		{
			this.id = id;
			this.name = name;
			this.phone_no = phone_no;
			this.address = address;
		}
		int getId()
		{
			return id;
		}
		String getName()
		{
			return name;
		}
		String getPhone_no()
		{
			return phone_no;
		}
		String getAddress()
		{
			return address;
		}
		abstract void describe();
}
//Super class
class Customer extends Person
{
	private
		int customer_id;
	public
		Customer(int customer_id, int id, String name, String phone_no, String address)
		{
			super(id, name, phone_no, address);
			this.customer_id = customer_id;
		}
		void describe()
		{
			System.out.println("CustomerId: " + customer_id + "Id: " + getId() + "Customer's name: " + getName() + ", Customer_no: " + getPhone_no() + "Customer's address: " + getAddress());
		}
}
//Super class
class Employee extends Person
{
	private
		int employee_id;
		String position;
	protected
		float salary;
	public
		Employee(int employee_id, String position, float salary, int id, String name, String phone_no, String address)
		{
			super(id, name, phone_no, address);
			this.employee_id = employee_id;
			this.position = position;
			this.salary = salary;
		}
		void describe()
		{
			System.out.println("EmployeeId: " + employee_id + ", Employee's position: " + position + "Employee's salary: " + salary + "Id: " + getId() + "Employee's name: " + getName() + ", Employee_no: " + getPhone_no() + "Employee's address: " + getAddress());
		}
}
class Cart
{
	private
		int cart_id;
		Customer customer;
		Product[] listOfProducts;
		int product_count;
	public
		Cart(int cart_id, Customer customer, int maxProducts)
		{
			this.cart_id = cart_id;
			this.customer = customer;
			this.listOfProducts = new Product[maxProducts];
			this.product_count = 0;
		}
		int getCart_id()
		{
			return cart_id;
		}
		Customer getCustomer()
		{
			return customer;
		}
		Product[] getlistOfProducts()
		{
			return listOfProducts;
		}
		void addItem(Product product)
		{
			if(product_count < listOfProducts.length)
			{
				listOfProducts[product_count++] = product;
			}
			else
			{
				System.out.println("Cart is full! Can not add more items!");
			}
		}
		double calculateTotal()
		{
			double total = 0;
			for(int i = 0; i < product_count; i++)
			{
				total += listOfProducts[i].getPrice();
			}
			return total;
		}
}
class Supplier
{
	private
		int shipping_id;
		String shipping_type;
		String location;
	protected
		float shipping_cost;
	public
		Supplier(int shipping_id, String shipping_type, String location, float shipping_cost)
		{
			this.shipping_id = shipping_id;
			this.shipping_type = shipping_type;
			this.location = location;
			this.shipping_cost = shipping_cost;
		}
		int getShipping_id()
		{
			return shipping_id;
		}
		String getShipping_type()
		{
			return shipping_type;
		}
		String getLocation()
		{
			return location;
		}
		float getShipping_cost()
		{
			return shipping_cost;
		}
		void describe()
		{
			System.out.println("Shipping ID: " + shipping_id + ", Shipping type: " + shipping_type + ", Location: " + location + ", Shipping cost: " + shipping_cost);
		}
}
class Payment
{
	private
		String card_type;
		int card_no;
	protected
		float money;
	public
		Payment(String card_type, int card_no, float money)
		{
			this.card_type = card_type;
			this.card_no = card_no;
			this.money = money;
		}
		String getCard_type()
		{
			return card_type;
		}
		int getCard_no()
		{
			return card_no;
		}
		void describe()
		{
			System.out.println("Card type: " + card_type + ", Card number: " + card_no + ", Balance: " + money);
		}
}
public class GroceryStoreManagementSystem
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		final int maxPeople = 100;
		Person[] people = new Person[maxPeople];
		int personCount = 0;
		
		while(true)
		{
			System.out.println("\nGrocery Store Management System");
			System.out.println("1. Add Customer");
			System.out.println("2. Add Employee");
			System.out.println("3. List people");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");
			int choice = input.nextInt();
			input.nextLine();
			
			switch (choice) {
            case 1:
                if (personCount < maxPeople) {
                    System.out.print("Enter Customer ID: ");
                    int customerId = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Name: ");
                    String customerName = input.nextLine();
                    System.out.print("Enter Phone No: ");
                    String customerPhoneNo = input.nextLine();
                    System.out.print("Enter Address: ");
                    String customerAddress = input.nextLine();
                    people[personCount] = new Customer(customerId, personCount + 1, customerName, customerPhoneNo, customerAddress);
                    personCount++;
                    System.out.println("Customer added successfully.");
                } else {
                    System.out.println("Maximum number of people reached.");
                }
                break;
            case 2:
                if (personCount < maxPeople) {
                    System.out.print("Enter Employee ID: ");
                    int employeeId = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Name: ");
                    String employeeName = input.nextLine();
                    System.out.print("Enter Phone No: ");
                    String employeePhoneNo = input.nextLine();
                    System.out.print("Enter Address: ");
                    String employeeAddress = input.nextLine();
                    System.out.print("Enter Position: ");
                    String position = input.nextLine();
                    System.out.print("Enter Salary: ");
                    float salary = input.nextFloat();

                    if (personCount < maxPeople) {
                        people[personCount] = new Employee(employeeId, position, salary, personCount + 1, employeeName, employeePhoneNo, employeeAddress);
                        personCount++;
                        System.out.println("Employee added successfully.");
                    } else {
                        System.out.println("Maximum number of people reached.");
                    }
                }
                break;

            case 3:
                System.out.println("List of People:");
                for (int i = 0; i < personCount; i++) {
                    people[i].describe();
                }
                break;
            case 4:
                System.out.println("Thank you for using the Grocery Store Management System.");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
}