package com.sortscores;
import java.util.Arrays;//����java.util.Arrays��
/*
 * ���ܣ������Գɼ�(82,73,94,58,62,97,88)������������سɼ��ĸ���
 * ����һ������������������ķ���������ɼ�����
 * ʹ��Arrays��Գɼ���������������
 * ����ִ�к󷵻�������Ԫ�صĸ���*/

public class MySortScores {
	public static void main(String[] args) {
		int[] scores = {82,73,94,58,62,97,88};
		
		//ʵ��������
		MySortScores sortScoresOb = new MySortScores();
		int scoresLen = sortScoresOb.sortScores(scores);
		System.out.println("������Ԫ�صĸ���Ϊ��" + scoresLen);
	}
	
	public int sortScores(int[] scores){
		//ʹ��Arrays��Գɼ������������
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		int scoresLen = scores.length;
		
		return scoresLen;
	}
}
