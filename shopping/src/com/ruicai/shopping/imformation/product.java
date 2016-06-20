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
	 * ����һ����̬��List<product> pt ���������Ʒ��Ϣ
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
	 * ��ӡ��ʾ��Ϣ
	 */
	public static void prompt(){
		System.out.println("1.��һ�� 2.�ҵĹ��ﳵ 3.�˳�");
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		switch (str) {
		case "1":
			printProduct();//��ӡ��Ʒ��Ϣ
			break;
		case "2":
			if((TestMain.spc.getHm()).isEmpty()){
				System.out.println("���ﳵ�տ���Ҳ�����ٹ��");	
				printProduct();//��ӡ��Ʒ��Ϣ
			}else{
				//��ӡ���ﳵ����Ʒ��Ϣ
				ShoppingCart.printShoppingCart(TestMain.spc.getHm());
				
			}
			break;
		default:
			System.exit(0);
			break;
		}
		
	}
	/*
	 * ��ӡ��Ʒ��Ϣ��
	 * idֵ
	 * ����
	 * �۸�
	 * ���
	 * 
	 */
	public static void printProduct(){
		
		for(int i = 0;i <pt.size();i++){
			System.out.println(pt.get(i).id+". "+pt.get(i).name+
					"�۸�:"+pt.get(i).price+"���:"+pt.get(i).num);
		}
	}

	public static List<product> getProduct(){
		List<product> products = new ArrayList<product>();
/*
 * �����Ʒ
 */
		products.add(new product("С���ֻ�",100,1000,1));
		products.add(new product("iphone6",200,4000,2));
		products.add(new product("����Ů����",200,1000,3));
		
		return products;
	}
	
}

