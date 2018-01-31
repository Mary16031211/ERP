package pratice.leetcode;
import java.util.*;
public class problem12 {
	public static String intToRoman(int num) {
		if(num<0||num>3999)
			return null;
        Map<Integer,String> map=new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        String res="";
        if(num>=1000){
        	for(int i=1;i<=num/1000;i++){
        		res+=map.get(1000);
        	}
        	num=num%1000;
        }
        if(num>=900){
        	res+=map.get(900);
        	num=num-900;
        }
        if(num>=500){
        	res+=map.get(500);
        	num=num-500;
        }
        if(num>=400){
        	res+=map.get(400);
        	num=num-400;
        }
        if(num>=100){
        	for(int i=1;i<=num/100;i++){
        		res+=map.get(100);
        	}
        	num=num%100;
        }
        if(num>=90){
        	res+=map.get(90);
        	num=num-90;
        }
        if(num>=50){
        	res+=map.get(50);
        	num=num-50;
        }
        if(num>=40){
        	res+=map.get(40);
        	num=num-40;
        }
        if(num>=10){
        	for(int i=1;i<=num/10;i++){
        		res+=map.get(10);
        	}
        	num=num%10;
        }
        if(num==9){
        	res+=map.get(9);
        	return res;
        }
        if(num>=5){
        	res+=map.get(5);
        	num=num-5;
        }
        if(num==4){
        	res+=map.get(4);
        	return res;
        }
        if(num>=1){
        	for(int i=1;i<=num/1;i++){
        		res+=map.get(1);
        	}
        	num=num%1;
        }
        return res;
    }
	public static void main(String[] args){
		int num=4;
		System.out.println(intToRoman(num));
	}
}
