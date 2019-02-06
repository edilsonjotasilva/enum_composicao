package application;

import java.util.Date;
import java.util.Scanner;

import entities.Order;
import entities.enuns.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		Order order = new Order(1080, new Date(),OrderStatus.PENDING_PAYMENT);
		System.out.println(order.toString());
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		System.out.println("Entre com um valor:\"DELIVERED,PENDING_PAYMENT,PROCESSING,SHIPPED \" ");
		String valor = in.next().toUpperCase();
		
		OrderStatus os2 = OrderStatus.valueOf(valor);
		
		System.out.println("Constante "+os1);
		System.out.println("String :"+ os2);
		
		
		
		in.close();
	}

}
