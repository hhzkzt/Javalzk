package com.ruicai.shopping.imformation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class ShoppingCart {
	/*
	 * ����HashMap<Integer,Integer>���ϴ����Ʒid��ͬһ����Ʒ����
	 */
	private  HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
	/*
	 * ����hm
	 * ��ӡ���ﳵ��Ʒ��Ϣ��
	 * ��Ʒ��
	 * ����
	 */
	public static void printShoppingCart(HashMap<Integer,Integer> hm){
		Iterator<Entry<Integer, Integer>> it = hm.entrySet().iterator();
		while(it.hasNext()){
			Entry<Integer, Integer> entry = (Entry<Integer, Integer>)it.next();	
			switch (entry.getKey()) {
				case 1:{
					System.out.println("��Ʒ����С���ֻ���"+"������"+entry.getValue());
					break;
				}
				case 2:{
					
					System.out.println("��Ʒ����ƻ���ֻ���"+"������"+entry.getValue());
					break;
				}
				case 3:{
					System.out.println("��Ʒ��������Ů���ѡ�"+"������"+entry.getValue());
					break;
				}
			}
		}
	}
	public HashMap<Integer, Integer> getHm() {
		return hm;
	}
}
