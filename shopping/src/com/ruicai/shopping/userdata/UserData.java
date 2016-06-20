package com.ruicai.shopping.userdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ruicai.shopping.imformation.ShoppingCart;

public class UserData {
	private String userName;
	private String passWord;
	/*
	 * 用ShoppingCart类组合成UserData类，并初始化。
	 * 因为UsdrDate has  ShoppingCart
	 */
	private ShoppingCart spc = new ShoppingCart();
	/*
	 * 定义静态List<UserData> users 来存放所有注册用户的信息
	 */
	private static List<UserData> users = new ArrayList<UserData>();
	public UserData(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	
/*
 * 提供注册和登录的入口，并返回登录成功的账户的UserData
 */
	public static UserData  logIn(){
		users.add(new UserData("1", "1"));
		boolean flag = true;
		while(flag){
			System.out.println("1,登录 2，注册 3，退出");
			@SuppressWarnings("resource")
			int a = new Scanner(System.in).nextInt();
			switch (a) {
				case 1:{
				  return dengLu();
					
				}	
				case 2:{
					zhuChe();
					break;
				}
					
				case 3:{
					System.exit(0);
					break;
				}
					
				default:{
					System.out.println("输入不合法请重新输入");
					break;
				}
				
			}
		}
		return new UserData("admin","admin");
		
		
	}
	/*
	 * 用户登录，并返回登录成功的账户的UserData
	 */
	public static UserData dengLu(){
			boolean flag = true;
			while (flag){
				System.out.println("请输入用户名");
				Scanner sc = new Scanner(System.in);
				String userName = sc.next();
				System.out.println("请输入密码");
				String passWord = sc.next();
				int i;
//遍历集合users，如果传入的userName和passWord和集合中的数据相同，则登录成功
				for( i = 0;i < users.size();i++){
					if(users.get(i).getUserName().equals(userName)&&
							users.get(i).getPassWord().equals(passWord)){
						System.out.println("登录成功");
						flag = false;
						return new UserData(userName, passWord);
					}
				}
				if(i == users.size()){
					System.out.println("输入错误，请重新输入");
					
				}
					
			}
			return null;
	}
	public ShoppingCart getSpc() {
		return this.spc;
	}
	public static List<UserData> getUsers() {
		return users;
	}
/*
 * 用户注册
 */
	public static void zhuChe(){
		String userName;
		int i = 0;
		while(true){
			System.out.println("请输入用户名");
			Scanner sc = new Scanner(System.in);
			userName = sc.next();
//遍历集合users，如果用户想要注册的userName和已经注册的用户的userName有重名，
//则注册失败，重新注册。
			for(i = 0;i < users.size();i++){
				if (userName.equals(users.get(i).userName)){
					System.out.println("对不起此名字已被占用，请重选用户名");
					break;
				}	
			}
			if(i == users.size()){
				break;
			}
		}
		System.out.println("请输入密码");
		Scanner sc = new Scanner(System.in);
		String passWord = sc.next();
		System.out.println("注册成功");
		users.add(new UserData(userName,passWord));						
	}
}
