package practice5;

import java.io.*;

class Product {
	
	String name;
	int price;
	
	void setName(String n) {
		name = n;
	}
	
	String getName() { 
		return name;
	}
	
	void setPrice(int p) {
		price = p;
	}
	
	int getPrice() {
		return price;
	}
}
	
 public class Practice_08 {											
	  
	  public static void main(String[] args) throws IOException
		{	  
		  BufferedReader br = 
					 new BufferedReader(new InputStreamReader(System.in));
		  
		  System.out.println("商品名を入力してください。");
		  String n1 = br.readLine();
		  
		  System.out.println("値段を入力してください。");
		  int p1 = Integer.parseInt(br.readLine());
		  
		  Product pro1 = new Product();
		  
		  pro1.setName(n1);
		  pro1.setPrice(p1);

		  System.out.println("商品名を入力してください。");
		  String n2 = br.readLine();
		  
		  System.out.println("値段を入力してください。");
		  int p2 = Integer.parseInt(br.readLine());
		  
		  Product pro2 = new Product();
		  
		  pro2.setName(n2);
		  pro2.setPrice(p2);
		  
		  System.out.println("1つ目の商品：" + pro1.getName() 
		  + "、" + pro1.getPrice() + "円");
		  
		  System.out.println("2つ目の商品：" + pro2.getName() 
		  + "、" + pro2.getPrice() + "円");
		}
}