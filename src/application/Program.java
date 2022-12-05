package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Client;
import entites.Order;
import entites.OrderItem;
import entites.Product;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String clienteName = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): ");
		String date = sc.next();
		Date BirthDate = sdf.parse(date);
		
		Client client = new Client(clienteName, email, BirthDate);
		
		System.out.println();
		System.out.println("Eneter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		
		System.out.print("How many items to this order?");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.println("Enter #" + (i+1) + " items to this order");
			System.out.print("Product name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			
			Product product = new Product(name, price);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, price, product);
			
			order.addItems(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMARY: ");
		System.out.println(order);
		
		
		sc.close();
	}
}
