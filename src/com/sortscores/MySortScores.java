package com.sortscores;
import java.util.Arrays;//导入java.util.Arrays包
/*
 * 功能：将考试成绩(82,73,94,58,62,97,88)排序并输出，返回成绩的个数
 * 定义一个包含整型数组参数的方法，传入成绩数组
 * 使用Arrays类对成绩数组进行排序并输出
 * 方法执行后返回数组中元素的个数*/

public class MySortScores {
	public static void main(String[] args) {
		int[] scores = {82,73,94,58,62,97,88};
		
		//实例化对象
		MySortScores sortScoresOb = new MySortScores();
		int scoresLen = sortScoresOb.sortScores(scores);
		System.out.println("数组中元素的个数为：" + scoresLen);
	}
	
	public int sortScores(int[] scores){
		//使用Arrays类对成绩进行排序并输出
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		int scoresLen = scores.length;
		
		return scoresLen;
	}
}
