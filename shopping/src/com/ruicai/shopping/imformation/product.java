package com.ruicai.shopping.imformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.ruicai.shopping.main.TestMain;

public class product {
	private int id;
	private String name;
	private int price;
	private int num;
	/*
	 * 定义一个静态的List<product> pt 用来存放商品信息
	 * 
	 */
	public static List<product> pt = getProduct();
	
	
	public product(String name,int num,int price,int id) {
		super();
		this.id = id;
		this.name = name;	
		this.price = price;
		this.num = num;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	/*
	 * 打印提示信息
	 */
	public static void prompt(){
		System.out.println("1.逛一逛 2.我的购物车 3.退出");
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		switch (str) {
		case "1":
			printProduct();//打印商品信息
			break;
		case "2":
			if((TestMain.spc.getHm()).isEmpty()){
				System.out.println("购物车空空如也，请再逛逛");	
				printProduct();//打印商品信息
			}else{
				//打印购物车内商品信息
				ShoppingCart.printShoppingCart(TestMain.spc.getHm());
				
			}
			break;
		default:
			System.exit(0);
			break;
		}
		
	}
	/*
	 * 打印商品信息：
	 * id值
	 * 名称
	 * 价格
	 * 库存
	 * 
	 */
	public static void printProduct(){
		
		for(int i = 0;i <pt.size();i++){
			System.out.println(pt.get(i).id+". "+pt.get(i).name+
					"价格:"+pt.get(i).price+"库存:"+pt.get(i).num);
		}
	}

	public static List<product> getProduct(){
		List<product> products = new ArrayList<product>();
/*
 * 添加商品
 */
		products.add(new product("小米手机",100,1000,1));
		products.add(new product("iphone6",200,4000,2));
		products.add(new product("充气女朋友",200,1000,3));
		
		return products;
	}
	
}

