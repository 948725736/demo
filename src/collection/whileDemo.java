package collection;
/*
 * 需求：小芳的妈妈每天给她2.5元钱，他都会存起来，
 * 但是，每当这一天是存钱的第五天或者是5的倍数的话
 * 他就会花去6元钱，经过多少天他可以存到100元
 * 
 * 分析：
 * A：小芳的妈妈每天给她2.5元
 * double dayMoney=2.5;
 * B:他都会存起来
 * double daySum=0;
 * C:从第一天开始存储：
 * int dayCount=1;
 * D:经过多少天，才可以存到100
 * double result=100；
 * E：这一天是存钱的第五天或者5的倍数的话，就花6元
 * 说明要判断dayCount的值，如果对5整除就减去6元
 * daySum -=6；
 * 隐藏的一个问题。若不是5的倍数的话，钱要累加
 * daySum +=dayMoney；
 * F：因为不知道是多少天，则用死循环，超过100时退出循环
 * */
public class whileDemo {
	public static void main(String []args){
		double dayMoney=2.5;
		double daySum=0;
		int dayCount=1;
		int result=100;
		while(true){
			//累加钱
			daySum +=dayMoney;
			//一旦超出100就退出循环
			if(daySum>=result){
				System.out.println("共花了"+dayCount+"天存储了100元钱");
				break;
			}
			if(dayCount%5==0){
				daySum -=6;
				System.out.println("第"+dayCount+"天花了6元钱");
			}
			dayCount++;
		}
	}
}
