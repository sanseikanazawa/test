package jp.co.internous.action;

public class Capsule{
	public static void main(String[] arg){
	Person taro=new Person("山田太郎",20);
	System.out.println(taro.getName());
	taro.setName("taro");
	System.out.println(taro.getName());
	}
}
