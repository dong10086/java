package java基础;

//第一节
public class HelloWorld {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//-----java变量名命名规范
		//1.变量名命名严格区分大小写
		//2.变量名不能使用java关键字
//		java关键字：public class static.args...
		//3.变量名不能使用数字开头
		//4.变量名中除了$和_以及￥以外不能包含其他符号
//		int $2;
//		int $a;
//		int _a;
//		int ￥a;
		//5.变量名可以使用中文,但不建议使用
		//6.变量名可以使用拼音
		//7.变量名建议见名知意    (让别人通过命名知道他的意思)
		//8.变量名使用驼峰命名法
//		String className;
		//9.在同一作用域中变量名不能重复
		
//-----java数据类型
//-----基本数据类型（此排列从小到大）
//		byte b=100; //字节型
//		short s=22222; //短整型
//		int i=21000000; //整型
//		long l=23333333333333333L; //长整型
//		float f=3.14F; //单精度浮点型 
//		double d=3.14; //双精度浮点型
//		char c='男'; //字符型 0-65535
//		boolean boo=true; //取值只能是true或false
		
//-----引用数据类型
		String str;
		
//-----数据类型转换
		//（取值范围）大转小， 强制类型转换，注意可能会造成精度丢失
		//还要注意容量的溢出
		int i1=(int)3.14; //将3.14转换成int类型，不用再定义double数据类型
//		上面代码与下面代码相同
//		double dou=3.14;
//		int i1=(int)dou;
		System.out.println(i1);
		
		//小转大，自动类型转换，
		double dou=3; //3.0
		System.out.println(dou);
		
		double i= 7.0/2;//两个整数相除，最终结果一定是整型，而且无条件舍弃小数位
		double b=6/2;
		int c=19%2;//取余
		System.out.println(i);
		System.out.println(b);
		System.out.println(c);
		
		int i2=10;
		int i3=i2++ - 5 + --i2 +10 - ++i2;//i2++ -5一运算i2就加1，后面也一样
		System.out.println(i2);	
		System.out.println(i3);
		
		int i4=6;
		System.out.println(4<5 & i4<4);//&:有一个假则判断假，但全部都运行判断，第一个判断错了，后面也会运算，与|判断相同
		int i5=8;
		System.out.println(5<4 && i5<10);//&&:有一个假则判断假，只要第一个判断假后面就不执行，与||判断相同
		System.out.println(!(5>4));//取反
		
		//赋值运算符 = +
		int a3=10;
		int a6=10;
		int a4=++a3;//先加1再运算，=号也是运算符
		int a5=a6++;//先运算再加1，=号也是运算符
		System.out.println(a4);
		System.out.println(a5);
		int a7=4;
		a7++;//这样才是单独使用,加1
		System.out.println(a7);
		
		//+若+两边都是数值类型，则做加法运算
		//只要任意一边是字符串类型，则做字符串拼接
		System.out.println(1+2+3+"123"+4+5+"78");
		
		//扩展运算符
		//+= -= *= /= %=
		int b1=0;
		b1=b1+5;
		b1 +=5;
		
		short s1=10;
		s1+=5;
		// s1=s1+5;//数据类型不一致不能相加
		s1=(short)(s1+5);//强制类型转换，先右边运算再转换
	}
}
