package Programs;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class randonNumbersString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Generating integer
		Random ran=new Random();
		System.out.println(ran.nextInt(99));
		
		
		//Generating double
		System.out.println(""+ran.nextDouble()); //0.7244505197932335    # 0.0 and less than 1.0
		
		
		
		
		//#2 Math.Random generates Decimal
		System.out.println(Math.random()); //0.4123479237018548
		
		
		//#3 ApacheCommons
		
		System.out.println(RandomStringUtils.randomNumeric(10));
		System.out.println(RandomStringUtils.randomAlphabetic(10));
//		5470447133
//		YlbZuPAqeo
		
		
		
		
		

	}

}
