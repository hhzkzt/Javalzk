package com.ruicai.shopping.imformation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class ShoppingCart {
	/*
	 * 定义HashMap<Integer,Integer>集合存放商品id，同一件商品数量
	 */
	private  HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
	/*
	 * 遍历hm
	 * 打印购物车商品信息：
	 * 商品名
	 * 数量
	 */
	public static void printShoppingCart(HashMap<Integer,Integer> hm){
		Iterator<Entry<Integer, Integer>> it = hm.entrySet().iterator();
		while(it.hasNext()){
			Entry<Integer, Integer> entry = (Entry<Integer, Integer>)it.next();	
			switch (entry.getKey()) {
				case 1:{
					System.out.println("商品名：小米手机。"+"数量："+entry.getValue());
					break;
				}
				case 2:{
					
					System.out.println("商品名：苹果手机。"+"数量："+entry.getValue());
					break;
				}
				case 3:{
					System.out.println("商品名：充气女朋友。"+"数量："+entry.getValue());
					break;
				}
			}
		}
	}
	public HashMap<Integer, Integer> getHm() {
		return hm;
	}
}
