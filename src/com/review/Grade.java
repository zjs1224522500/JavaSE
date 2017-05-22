package com.review;

import java.util.Scanner;

/**
 * 
 */
public class Grade {

	public static void main(String[] args) {
		int count = 0;
		int grade;
		int totalGrade = 0;
		double avg;
		
		Scanner in = new Scanner(System.in);
		
		while(true){
			grade = in.nextInt();
			if(grade == -1){
				System.out.println("成绩输入完毕！！");
				break;
			}else if(grade > -1){
				count++;
				totalGrade+=grade;
			}
		}
		
		System.out.println("有效的学生成绩的个数：" + count);
		System.out.println("总分和：" + totalGrade);
		
		//为了避免报数学异常，对作为除数的count率先进行判断
		if(count != 0 ){
			avg = totalGrade/count;
			System.out.println("平均值：" + avg);
		}
		
		
		
		in.close();
	}

}
