package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

class Food{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	private String name;
	private int price;
	private String locale;
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", locale=" + locale + "]";
	}
}
public class ListTest4 {
	public static void main(String[] args) {
		List<Food> fList = new ArrayList<>();
		String[] locales = {"한식","양식","중식","일식","분식","경앙식"};
		
		Random r = new Random();
		for(int i=0;i<30;i++) {
			Food f = new Food();
			f.setLocale(locales[r.nextInt(locales.length)]);
			f.setName("음식"+i);
			/*
			 * 음식 가격은 1000원 부터 10000원까지
			 * 단, 1000원 단위로 이루어져야 함.
			 * 
			 * 제일 비싼 음식과 제일 저렴한 음식을 찾아서 출력해 주시면 됩니다.
			 */
			f.setPrice((r.nextInt(10)+1)*1000);	
		//	int price = (r.nextInt(10)+1)*1000;
		//	f.setPrice(price);
			fList.add(f);
			//System.out.println(f);
			
			int b = f.getPrice();
			int a=0;
			
			}
		int max = 0;
		int min =10000;
		int maxIdx = 0;
		int minIdx = 0;
		for(int i=0;i<30;i++) {
			Food f = fList.get(i);
			if(max<f.getPrice()) {
				max = f.getPrice();
				
			}
			if(min>f.getPrice()) {
				min = f.getPrice();
			}
		}
			Food maxF = fList.get(0);
			Food minF = fList.get(0);
			
		/*		if(maxF.getPrice()<f.getPrice()) {
					
				}
				
				if(minF.getPrice()>f.getPrice()) {
					minF = f;
				
			}
			List<Food> minList = new ArrayList<>()
		*/
		System.out.println("제일 비싼 음식 : ");
		System.out.println("제일 싼 음식 : ");
	
	
		

	int[] nums = new int[locales.length];
	
	for(int i=0;i<locales.length;i++) {
		for(int j=0;j<fList.size();j++) {
			if(locales[i].equals(fList.get(j).getLocale())) {
				nums[i]++;
			}
			}
	}
	for(int i=0;i<locales.length;i++) {
		System.out.println(locales[i]+" 갯수: "+ nums[i]);
	}

}
}


