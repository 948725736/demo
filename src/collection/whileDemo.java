package collection;
/*
 * ����С��������ÿ�����2.5ԪǮ���������������
 * ���ǣ�ÿ����һ���Ǵ�Ǯ�ĵ����������5�ı����Ļ�
 * ���ͻỨȥ6ԪǮ�����������������Դ浽100Ԫ
 * 
 * ������
 * A��С��������ÿ�����2.5Ԫ
 * double dayMoney=2.5;
 * B:�����������
 * double daySum=0;
 * C:�ӵ�һ�쿪ʼ�洢��
 * int dayCount=1;
 * D:���������죬�ſ��Դ浽100
 * double result=100��
 * E����һ���Ǵ�Ǯ�ĵ��������5�ı����Ļ����ͻ�6Ԫ
 * ˵��Ҫ�ж�dayCount��ֵ�������5�����ͼ�ȥ6Ԫ
 * daySum -=6��
 * ���ص�һ�����⡣������5�ı����Ļ���ǮҪ�ۼ�
 * daySum +=dayMoney��
 * F����Ϊ��֪���Ƕ����죬������ѭ��������100ʱ�˳�ѭ��
 * */
public class whileDemo {
	public static void main(String []args){
		double dayMoney=2.5;
		double daySum=0;
		int dayCount=1;
		int result=100;
		while(true){
			//�ۼ�Ǯ
			daySum +=dayMoney;
			//һ������100���˳�ѭ��
			if(daySum>=result){
				System.out.println("������"+dayCount+"��洢��100ԪǮ");
				break;
			}
			if(dayCount%5==0){
				daySum -=6;
				System.out.println("��"+dayCount+"�컨��6ԪǮ");
			}
			dayCount++;
		}
	}
}
