package think.java.work1;

public class HomeWork3 {
	//作业1打印1-100的整数
	public static void prf1_100(){
		for(int i=1;i<=100;i++){
			System.out.print(i+" ");
			if(i%10==0)
				System.out.println();
		}
	}
	//作业2，修改作业1，增加break
	public static void prf1_100_2(){
		for(int i=1;i<=100;i++){
			System.out.print(i+" ");
			if(i==47)
				return;
		}
	}
	//作业3，将switch放入for中测试去掉break是什么情况
	public static void switch_test(){
		for(int i=0;i<5;i++){
			switch (i){
				case 0:System.out.println("我是一个人");
				case 1:System.out.println("我们是4个人");
				case 2:System.out.println("我是学生");
				case 3:System.out.println("我是研究生");
				default:System.out.println("我是成年人");
			}
		}
	}
	public static void main(String[] args){
//		System.out.println("c3作业1：");
//		prf1_100();
//		System.out.println("c3作业2：");
//		prf1_100_2();
		System.out.println("c3作业3：");
		switch_test();
	}
}
