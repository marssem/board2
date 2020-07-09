package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
		String[] fNames = {"김","이","박","최","맹","신","조"};
		String[] lNames = {"동동","나나","진수","명희","철수","명호","둘리"};
		
		List<Student> stList = new ArrayList<>();//같은 패키지 안에 있기에 Student 사용 가능
		Random r =new Random();
		
		for(int i=1;i<=20;i++) {
			String fName = fNames[r.nextInt(7)];
			String lName = lNames[r.nextInt(7)];
			Student s = new Student();
			s.setName(fName+lName);
			s.setGrade(r.nextInt(3)+1);
			stList.add(s);
			//System.out.println(s);
		}
		
		
		/*
		 * 위의 리스트는 1~3학년 까지 랜덤하게 들어간 리스트입니다.
		 * 각 학년당 몇 명의 학생이 있는지 출력하는 프로그램을 만들어주세요.
		 */
		
		
		
		
		int[] nums = new int[3];
		for(Student s:stList) {
		//	System.out.println(s);
			for(int i=0;i<nums.length;i++) {
				if(s.getGrade()==(i+1)) {
					nums[i]++;
				}
			}
		}
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				//System.out.println(i+1+" 학년: "+nums[i]+"명");
			}
		}
		List<Student> oneList = new ArrayList<>();
		List<Student> twoList = new ArrayList<>();
		List<Student> threeList = new ArrayList<>();
		
		for(Student s:stList) {
			
			if(s.getGrade()==1) {
				oneList.add(s);	
			}
			
			if(s.getGrade()==2) {
				twoList.add(s);
			}
			if(s.getGrade()==3) {
				threeList.add(s);
			}
			
		}
		
		
		
		
		if(oneList.size()>0) {
			System.out.print("1학년: "+oneList.size()+"명 /");
			for(Student s : oneList) {
			System.out.print(s.getName()+", ");
			}
		}	
		System.out.println();
		
		if(twoList.size()>0) {
			System.out.print("2학년: "+twoList.size()+"명 /");
			for(Student s : twoList) {
			System.out.print(s.getName()+", ");
			}
		}	
		System.out.println();
		
		if(threeList.size()>0) {
			System.out.print("3학년: "+threeList.size()+"명 /");
			for(Student s : threeList) {
			System.out.print(s.getName()+", ");
			}
		}	
		int a= 0;
		int b= 0;
		int c= 0;
		
		
		for(Student s:stList) {
			
			if(oneList.size()!=0) {
			//	System.out.println(s.getName());
				
			}
			
			
			
		/*	if(s.getGrade()==1) {
				a++;
			}
			if(s.getGrade()==2) {
				b++;
			}
			if(s.getGrade()==3) {
				c++;
			} */
		}
	/*	if(a==0) {
			System.out.println("1학년 없음.");
		}else {
			System.out.println("1학년 :" +a);
		}
		if(b==0) {
			System.out.println("2학년 없음.");
		}else {
			System.out.println("2학년 :" +b);
		}
		if(c==0) {
			System.out.println("3학년 없음.");
		}else {
			System.out.println("3학년 :" +c);
		} */
		
		if(a!=0) {
			System.out.println("1학년 :" +a);
		}
		if(b!=0) {
			System.out.println("2학년 :" +b);
		}
		if(c!=0) {
			System.out.println("3학년 :" +c);
		}
		
	}

}
