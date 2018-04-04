import java.util.*;


class multi_table
{
	int i = 0 ;
	public void solution(int n)
	{
		for (i=1;i<=10 ;i++ )
		 {
			System.out.println(n+"*"+i+"="+(n*i));	
		}
	}
	public static void main(String[] args) {
		int x = 0 ;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();

		multi_table mul = new multi_table();
		mul.solution(x);
	}
}