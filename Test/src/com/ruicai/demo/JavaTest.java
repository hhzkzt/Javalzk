package com.ruicai.demo;

import org.apache.log4j.Logger;

public class JavaTest {
	public static Logger logger = Logger.getLogger(JavaTest.class);
	public static void main(String[] args) {
		try{
			int [] num ={1,2};
			System.out.println(num[2]);
			
		}catch(NullPointerException n){
			System.out.println("1");
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			//给出错误提示
				System.out.println("数组越界异常");
				logger.error("数组越界异常"+e.getMessage());
		}catch(Exception a){
			System.out.println("0");
		}
		System.out.println("哈哈");
	}
}
