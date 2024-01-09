package mygame;

import java.util.Scanner;
import java.util.Random;

public class JankenIf {

	public static void main(String[] args) {
		int starttomain=1;
		if(starttomain==1) {
			startToMain();
		}
		}
	
	public static void startToMain() {
		int starttomain=0;
		if(starttomain==0) {
			int user=getUser();//キーボード入力
			int pc=getPc();//手の乱数
			String result=judgeJanken(user,pc);//判定
			showHand(user,pc);	
			int saikai=showResult(user,pc,result);
			starttomain=saikai;
			}if(starttomain==1) {
				startToMain();
			}
	}

	public static int getUser() {
		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("あなたのじゃんけんの手を入力してください");
			System.out.println("グー：０,チョキ：１,パー：２");
			
			if(s.hasNextInt()) {//入力値が整数
				int num=s.nextInt();
				String you="";
				if(num<0||2<num) {
					System.out.println("入力できるのは０～２です");
					continue;
				}
					else{
						return num;
					}
				}
				
			}
		}
	public static int getPc() {
			Random rNum=new Random();
			/*	String aite="";
				for(int a=0;a<3;a++) {
					if(a==rNum.nextInt(3)) {
						if(a==0) {
							aite="グー";
						}else if(a==1) {
							aite="チョキ";
						}else if(a==2) {
							aite="パー";
						}
					}
				}
			System.out.println(aite);*/
			return rNum.nextInt(3);
		}
	public static String judgeJanken(int user,int pc){
		String result="";
		
		if(user==0&&pc==1||
		   user==1&&pc==2||
		   user==2&&pc==0) {
			result="勝ち";
		}else if(user==0&&pc==2||
		   user==1&&pc==0||
		   user==2&&pc==1) {
			result="負け";
		}else {
			result="あいこ";
		}
		return result;
	}
	public static int showResult(int user,int pc,String result) {
		System.out.println("結果は"+result+"です");
		return 1;
	}
	public static void showHand(int user,int pc){
		int n;
		for(n=0;n<3;n++) {
			if(n==0) {
				if(user==n) {
					System.out.println("あなたはグーで、");
				}
				if(pc==n) {
					System.out.println("相手はグー");
				}}
			
			if(n==1) {
				if(user==n) {
					System.out.println("あなたはチョキで、");
						}
				if(pc==n) {
					System.out.println("相手はチョキ");
				}
			}
			if(n==2) {
				if(user==n) {
					System.out.println("あなたはパーで、");
						}
				if(pc==n) {
					System.out.println("相手はパー");
						}
			}		
	}
		
		}}
