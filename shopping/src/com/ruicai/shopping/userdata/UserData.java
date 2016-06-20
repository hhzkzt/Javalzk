package com.ruicai.shopping.userdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ruicai.shopping.imformation.ShoppingCart;

public class UserData {
	private String userName;
	private String passWord;
	/*
	 * ��ShoppingCart����ϳ�UserData�࣬����ʼ����
	 * ��ΪUsdrDate has  ShoppingCart
	 */
	private ShoppingCart spc = new ShoppingCart();
	/*
	 * ���徲̬List<UserData> users ���������ע���û�����Ϣ
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
 * �ṩע��͵�¼����ڣ������ص�¼�ɹ����˻���UserData
 */
	public static UserData  logIn(){
		users.add(new UserData("1", "1"));
		boolean flag = true;
		while(flag){
			System.out.println("1,��¼ 2��ע�� 3���˳�");
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
					System.out.println("���벻�Ϸ�����������");
					break;
				}
				
			}
		}
		return new UserData("admin","admin");
		
		
	}
	/*
	 * �û���¼�������ص�¼�ɹ����˻���UserData
	 */
	public static UserData dengLu(){
			boolean flag = true;
			while (flag){
				System.out.println("�������û���");
				Scanner sc = new Scanner(System.in);
				String userName = sc.next();
				System.out.println("����������");
				String passWord = sc.next();
				int i;
//��������users����������userName��passWord�ͼ����е�������ͬ�����¼�ɹ�
				for( i = 0;i < users.size();i++){
					if(users.get(i).getUserName().equals(userName)&&
							users.get(i).getPassWord().equals(passWord)){
						System.out.println("��¼�ɹ�");
						flag = false;
						return new UserData(userName, passWord);
					}
				}
				if(i == users.size()){
					System.out.println("�����������������");
					
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
 * �û�ע��
 */
	public static void zhuChe(){
		String userName;
		int i = 0;
		while(true){
			System.out.println("�������û���");
			Scanner sc = new Scanner(System.in);
			userName = sc.next();
//��������users������û���Ҫע���userName���Ѿ�ע����û���userName��������
//��ע��ʧ�ܣ�����ע�ᡣ
			for(i = 0;i < users.size();i++){
				if (userName.equals(users.get(i).userName)){
					System.out.println("�Բ���������ѱ�ռ�ã�����ѡ�û���");
					break;
				}	
			}
			if(i == users.size()){
				break;
			}
		}
		System.out.println("����������");
		Scanner sc = new Scanner(System.in);
		String passWord = sc.next();
		System.out.println("ע��ɹ�");
		users.add(new UserData(userName,passWord));						
	}
}
