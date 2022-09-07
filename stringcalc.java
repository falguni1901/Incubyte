class StringCalculator{
    int add(int a,int b)
    {
        return a+b;
    }
}
public class Main
{
	public static void main(String[] args) {
		StringCalculator S= new StringCalculator();
	
	int c=	S.add(10,30);
	System.out.println(c);
	}
}
