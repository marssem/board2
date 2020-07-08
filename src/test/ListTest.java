package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Student{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	private int grade;
	public String toString() {
		return "student [name=" + name + ", grade=" + grade + "]";
	}
	
	
}
public class ListTest {
	public static void main(String[] args) {
		List<Student> strList = new ArrayList<>();
		Random r = new Random();
		
		for(int i=1;i<=5;i++) {
			Student st2 = new Student();
			strList.add(st2);
			st2.setName("이름 " +i);
			st2.setGrade(r.nextInt(10)+1);
			
		}
		for(int i=0;i<strList.size();i++) {
			if(i%2==1){
			Student st = strList.get(i);
			System.out.println(st);
			}
		}
		
		
	/*	for(int i=0;i<strList.size();i++) {
			Student st = strList.get(i);
			int grade = st.getGrade();
			if(grade%2 == 0) {
			System.out.println("이름 : "+st.getName()+","+"학년 : "+st.getGrade());
			}
		}
		*/
		/*
		 * 
		 * 학년을 1 - 10학년까지 랜덤하게 대입해 주세요.
		 * 학년이 짝수일 경우에만 아래의 양식에 맞춰서 출력해주세요.
		 * 아래
		 * 이름 : 갑  학년: 값 ,학년
		 */
	}
}
