package com;

import java.util.ArrayList;

import com.entities.Customer;
import com.entities.Department;
import com.entities.Employee;
import com.entities.Payment;
import com.entities.Product;
import com.entities.Provider;

public class Init {
    public static void main(String args[]) {
    		Customer customer1 = new Customer("Andres Felipe","Lobaton Z","20-10-2001","M","4543508673627");
    		Customer customer2 = new Customer("Pepe","Caca","20-10-2001","M","100867337");
    		Customer customer3 = new Customer("Juan","Pasa","20-10-2001","M","100864527");

    		Provider provider1 = new Provider("Pedro","Lopez","20-10-2001","M","56804534527");
    		Provider provider2 = new Provider("Camilo","Telles","20-10-2001","M","3400864527");
    		Provider provider3 = new Provider("Sasha","Perez","20-10-2001","F","4500864527");


    		Employee employee1 = new Employee("Jose","Vivas","20-10-2001","M","568045345527","TRABAJADOR",900000.0f);
    		Employee employee2 = new Employee("Armando","Colmenares","20-10-2001","M","34008645237","TRABAJADOR",900000.0f);
    		Employee employee3 = new Employee("Ivan","Torres","20-10-2001","M","568045345327","TRABAJADOR",900000.0f);
    		Employee employee4 = new Employee("Angelino","Alvarex","20-10-2001","F","45006864527","TRABAJADOR",900000.0f);
    		Employee employee5 = new Employee("Angelica","Zoscate","20-10-2001","F","34040864527","TRABAJADOR",900000.0f);
    		Employee employee6 = new Employee("Andres","Chacuma","20-10-2001","M","450408644527","TRABAJADOR",900000.0f);
    		Employee employee7 = new Employee("Felipe","Matata","20-10-2001","M","568045334527","TRABAJADOR",900000.0f);
    		Employee employee8 = new Employee("Oscar","Perez","20-10-2001","M","34008645527","TRABAJADOR",900000.0f);
    		Employee employee9 = new Employee("Manuel","Rodrigez","20-10-2001","M","45060864527","TRABAJADOR",900000.0f);
    		Employee employee10 = new Employee("Dario","Sanches","20-10-2001","M","568024534527","TRABAJADOR",900000.0f);
    		Employee employee11 = new Employee("Zeps","Mesa","20-10-2001","F","34008645427","TRABAJADOR",900000.0f);
    		Employee employee12 = new Employee("Macha","Lopaz","20-10-2001","F","45008664527","TRABAJADOR",900000.0f);

    		Product product1 = new Product("Papa",100,500.00f);
			Product product2 = new Product("Queso",3,5000.00f);
			Product product3 = new Product("Mentas",100,100.00f);
			Product product4 = new Product("Arroz",2,5.00f);
			Product product5 = new Product("Lenteja",2,5.00f);
			Product product6 = new Product("Alverja",2,5.00f);
			Product product7 = new Product("Leche",2,5.00f);
			Product product8 = new Product("Garbanzo",2,5.00f);
			Product product9 = new Product("Moto",2,5.00f);
			Product product10 = new Product("Carro",2,5.00f);
			Product product11 = new Product("Cicla",2,5.00f);
			Product product12 = new Product("Zamahoria",2,5.00f);
			Product product13 = new Product("Platano",2,5.00f);
			Product product14 = new Product("Pera",2,5.00f);
			Product product15 = new Product("Manzana",2,5.00f);
			Product product16 = new Product("Otro1",2,5.00f);
			Product product17 = new Product("Otro2",2,5.00f);
			Product product18 = new Product("Otro3",2,5.00f);
			Product product19 = new Product("Otro4",2,5.00f);
			Product product20 = new Product("Otro5",2,5.00f);
			Product product21 = new Product("Otro6",2,5.00f);

			Department department1 = new Department("401",employee1);
			Department department2 = new Department("402",employee2);
			Department department3 = new Department("403",employee3);

			department1.addEmployee(employee4);
			department1.addEmployee(employee5);
			department1.addEmployee(employee6);

			department2.addEmployee(employee7);
			department2.addEmployee(employee8);
			department2.addEmployee(employee9);

			department3.addEmployee(employee10);
			department3.addEmployee(employee11);
			department3.addEmployee(employee12);

			provider1.addProduct(product1);
			provider1.addProduct(product2);
			provider1.addProduct(product3);
			provider1.addProduct(product4);
			provider1.addProduct(product5);
			provider1.addProduct(product6);
			provider1.addProduct(product7);

			provider2.addProduct(product8);
			provider2.addProduct(product9);
			provider2.addProduct(product10);
			provider2.addProduct(product11);
			provider2.addProduct(product12);
			provider2.addProduct(product13);
			provider2.addProduct(product14);

			provider3.addProduct(product15);
			provider3.addProduct(product16);
			provider3.addProduct(product17);
			provider3.addProduct(product18);
			provider3.addProduct(product19);
			provider3.addProduct(product20);
			provider3.addProduct(product21);


			Payment payment1 = new Payment(customer1,"2021-05-12",0f);
			Payment payment2 = new Payment(customer1,"2021-05-34",0f);
			Payment payment3 = new Payment(customer1,"2021-04-11",0f);
			payment1.addProduct(product1);
			payment1.addProduct(product2);

			payment2.addProduct(product3);
			payment2.addProduct(product4);

			payment3.addProduct(product5);
			payment3.addProduct(product6);

			Payment payment4 = new Payment(customer2,"2021-05-12",0f);
			Payment payment5 = new Payment(customer2,"2021-05-34",0f);
			Payment payment6 = new Payment(customer2,"2021-04-11",0f);
			payment4.addProduct(product7);
			payment4.addProduct(product8);
			payment5.addProduct(product9);
			payment5.addProduct(product10);

			payment6.addProduct(product11);
			payment6.addProduct(product12);
			payment6.addProduct(product13);
			payment6.addProduct(product14);


			Payment payment7 = new Payment(customer3,"2021-05-12",0f);
			payment7.addProduct(product15);
			payment7.addProduct(product16);
			payment7.addProduct(product17);
			payment7.addProduct(product18);
			payment7.addProduct(product19);
			payment7.addProduct(product20);
			payment7.addProduct(product21);


			// Parte final
			ArrayList<Department> departments = new ArrayList<Department>();
			departments.add(department1);
			departments.add(department2);
			departments.add(department3);
			ArrayList<Payment> payments = new ArrayList<Payment>();
			payments.add(payment1);
			payments.add(payment2);
			payments.add(payment3);
			payments.add(payment4);
			payments.add(payment5);
			payments.add(payment6);
			payments.add(payment7);

			System.out.println("Nombres de todos los usuarios");
			System.out.println("Directores: ");
			for (Department department :departments) {
				Employee director = department.getDirector();
				System.out.println(director.getLastname());
				System.out.println("Empleados del apartamento: "+department.getName());
				for(Employee employee :department.getEmployess()){
					System.out.println(employee.getLastname());
				}
			}

			int spendCustomer1 = Init.getTotalPyByUser(payments, customer1);
			int spendCustomer2 = Init.getTotalPyByUser(payments, customer2);
			int spendCustomer3 = Init.getTotalPyByUser(payments, customer3);

			System.out.println("El cliente1 pago : "+Integer.toString(spendCustomer1)+" sin impuesto");
			System.out.println("El cliente1 pago : "+Integer.toString(spendCustomer2)+" sin impuesto");
			System.out.println("El cliente1 pago : "+Integer.toString(spendCustomer3)+" sin impuesto");

		}
    public static int getTotalPyByUser(ArrayList<Payment> payments,Customer customer) {
    	return  payments.stream()
				.filter((item)->item.getCustomer()==customer)
				.map((item)->(int)item.getNetValueProducts())
				.reduce(0,(a,b)->a-=b);
    }
}
