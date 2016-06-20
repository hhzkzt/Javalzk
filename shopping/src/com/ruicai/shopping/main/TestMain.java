package com.ruicai.shopping.main;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import com.ruicai.shopping.imformation.ShoppingCart;
import com.ruicai.shopping.imformation.product;
import com.ruicai.shopping.userdata.UserData;

public class TestMain {

	public static ShoppingCart spc;
	public static void main(String[] args) {
		System.out.println("��ӭ������Ź���ϵͳ");
		UserData ud= UserData.logIn();
		buy(ud);
	
	}
	/*
	 * ������Ʒ������
	 */

	public static void buy(UserData ud){
		spc = ud.getSpc();
		int sum = 0;
		while(true){	
			product.prompt();//��ӡ��ʾ��Ϣ
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ�������Ʒ���");
			Integer key =  sc.nextInt();
			System.out.println("��������Ҫ������Ʒ������");
			Integer value = sc.nextInt();
			/*
			 * ������㹻������ɹ�������Զ�����
			 * ����治�㣬����ʧ�ܣ����¹�����Ʒ
			 */
			for(int i = 0;i < product.getProduct().size();i++){
				if(product.pt.get(i).getId() == key){
					if (product.pt.get(i).getNum()  >= value ){
						if(spc.getHm().containsKey(key)){
							spc.getHm().put(key, value+spc.getHm().get(key));
						}else{
							spc.getHm().put(key, value);
						}
						Integer c = product.pt.get(i).getNum();
						product.pt.get(i).setNum( c-value);
//						System.out.println(product.pt.get(i).getNum());
					}else{
						System.out.println("��治��");
					}
				}	
			}
		/*
		 * ��Ʒ����
		 */
			System.out.println("1.ȥ���� 2.�ٿ���");
			int b = sc.nextInt();
			switch (b){
				case 1:{
					Iterator<Entry<Integer, Integer>> it = spc.getHm().entrySet().iterator();
					while(it.hasNext()){
						Entry<Integer, Integer> entry = it.next();	
						switch ((Integer)entry.getKey()) {
						case 1:{
							sum += ((Integer)entry.getValue()* 1000);
							break;
						}
						case 2:{
							sum += ((Integer)entry.getValue() * 4000);
							
							break;
						}
						case 3:{
							sum += ((Integer)entry.getValue() * 1000);
							
							break;
						}
								
						default:
							break;
						}
						
					}
					System.out.println("��Ӧ�����:"+sum); 
					System.exit(0);
				}
				case 2:{
					break;
				}
			}
			
			
		}
	}

}
