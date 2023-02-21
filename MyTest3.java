import java.util.Scanner;
public class MyTest3 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int choose = sc.nextInt();
		switch (choose){
			case 1:
			case 2:	
			case 3:	
			case 4:	
			case 5:
				System.out.println("上晚自习");
				break;
			case 6:	
			case 7:	
				System.out.println("不上晚自习");
				break;
			default:
				System.out.println("请输入1-7");
		}
		System.out.println("程序结束");
	}
}