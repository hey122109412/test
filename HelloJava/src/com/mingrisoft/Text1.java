package com.mingrisoft;

import java.util.Random;

public class Text1 {

	public static void main(String[] args) {
		String[] titles={"《Java从入门到精通（第2版）》","《Java编程词典》","《视频学Java》"};
		for(int i=0;i<5;i++){
			new Book1(titles[new Random().nextInt(3)]);
		}
		System.out.println("总计销售了"+Book1.getCounter()+"本图书！");
	}

}
