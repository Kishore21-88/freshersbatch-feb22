package corejava.assignment.collection;

import java.util.HashSet;

public class Product {
	int id;
	String Name;

	public Product() {
		super();
		
	}

	public Product(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	public static void main(String[] args) {
		HashSet<Product> al = new HashSet<Product>();
		Product p1=new Product(1,"kiki");//1234=1
		Product p2=new Product(2,"kiki");//1233=3
		Product p3=new Product(3,"kiki");//1111=4
		Product p4=new Product(4,"kiki");//2222=1
		Product p5=new Product(5,"kiki");//3333=6
		Product p6=new Product(6,"kiki");//4444=5
	
			
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);
		
		
	
		
	for (Product product : al) {
		System.out.println(product);
	}
		

	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + "]";
	}
	

}
