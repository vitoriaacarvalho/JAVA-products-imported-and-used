package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProducts;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list=new ArrayList<>();
		
		
		System.out.println("enter the number of products: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.printf("product #%d data: \n", i+1);
			
			System.out.println("common, used or imorted (c/u/i)? ");
			char type=sc.next().charAt(0);
			
			System.out.println("name: ");
			sc.nextLine();
			String name=sc.nextLine();
			
			System.out.println("price: ");
			Double price=sc.nextDouble();
			
			if (type=='i') {
				System.out.println("costums fee: ");
				double costumsfee=sc.nextDouble();
				ImportedProduct imported=new ImportedProduct(name,price,costumsfee);
				list.add(imported);
			}
			else if (type=='u') {
				System.out.println("manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				UsedProducts used=new UsedProducts(name, price, date);
				list.add(used);
			}
			else if(type=='c') {
				Product product=new Product(name,price);
				list.add(product);
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		
		
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		
		
		sc.close();
		
		
		
		
		
		

	}

}

