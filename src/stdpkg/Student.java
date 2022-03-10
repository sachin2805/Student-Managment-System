package stdpkg;
import java.util.Scanner;
import stdmngpkg.StudentManager;

public class Student  {
	Scanner sc=new Scanner(System.in);


	int i=0;
	int []rno=new int [10];
	String []name=new String[10];
	int []score=new int [10];
	String []grade=new String[10];

	public void addStd(int n)
	{
		for(i=0;i<n;i++) {
			System.out.println("Enter the Student roll no : ");
			rno[i]=sc.nextInt();	
			System.out.println("Enter the name of Student : ");
			name[i]=sc.next();
			System.out.println("Enter the score of Student : ");
			score[i]=sc.nextInt();
			System.out.println("Enter the grade of Student : ");
			grade[i]=sc.next();

			System.out.println("Student add successfully...");
		}

	}
	public void showStdData()
	{
		System.out.println("---------------------------------------------------------");
		System.out.println("Roll No.\t Name\t\t Score\t\t Grade");
		System.out.println("---------------------------------------------------------");
		for(i=0;rno[i]!=0;i++)
			System.out.println(rno[i]+"\t\t\t"+name[i]+"\t\t "+score[i]+"\t\t "+grade[i]);
		System.out.println("---------------------------------------------------------");
	}
	
	public void updateScore(int k) {
		for(i=0;rno[i]!=0;i++)
		{
			if(rno[i]==k)
			{
				System.out.println("Enter updated score : ");
				score[i]=sc.nextInt();
				System.out.println("Enter updated grade : ");
				grade[i]=sc.next();
			}
		}
	}
}




