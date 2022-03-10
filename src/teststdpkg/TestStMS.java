package teststdpkg;

import java.util.Scanner;
import stdutil.StudentException;
import stdpkg.Student;

public class TestStMS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1;
		Student s=new Student();

		do {

			System.out.println("1.Enter Data : \n2.Show Student Data : \n3.Update Score : \n4.Exit : \nEnter the choice = ");
			int ch=sc.nextInt();
			switch (ch) {
			case 1: try {

				System.out.println("Enter the number of student u want to add : ");
				int n=sc.nextInt();
				if(n>0)
					s.addStd(n);
				else throw new StudentException();
			} catch (StudentException e) {
				System.out.println(s);
			}

			break;

			case 2: 

				s.showStdData();

				break;

			case 3:{
				System.out.println("Enter the Roll number u want to update Score : ");
				int k=sc.nextInt();
				s.updateScore(k);

				break;
			}
			case 4: { i=0;
			System.out.println("Exit Successfully ...");
			}
			break;
			default:
				System.out.println("Plz Enter the correct choice !!!!");
			}
		}while(i!=0);
	}
}
/* OUTPUT :
1.Enter Data : 
2.Show Student Data : 
3.Update Score : 
4.Exit : 
Enter the choice = 
5
Plz Enter the correct choice !!!!
1.Enter Data : 
2.Show Student Data : 
3.Update Score : 
4.Exit : 
Enter the choice = 
1
Enter the number of student u want to add : 
5
Enter the Student roll no : 
1
Enter the name of Student : 
Sachin
Enter the score of Student : 
95
Enter the grade of Student : 
A
Student add successfully...
Enter the Student roll no : 
2
Enter the name of Student : 
Rahul
Enter the score of Student : 
55
Enter the grade of Student : 
C
Student add successfully...
Enter the Student roll no : 
3
Enter the name of Student : 
Sharda
Enter the score of Student : 
74
Enter the grade of Student : 
B
Student add successfully...
Enter the Student roll no : 
4
Enter the name of Student : 
Nayana
Enter the score of Student : 
80
Enter the grade of Student : 
A
Student add successfully...
Enter the Student roll no : 
5
Enter the name of Student : 
Akash
Enter the score of Student : 
45
Enter the grade of Student : 
C
Student add successfully...
1.Enter Data : 
2.Show Student Data : 
3.Update Score : 
4.Exit : 
Enter the choice = 
2
---------------------------------------------------------
Roll No.	 Name		 Score		 Grade
---------------------------------------------------------
1			Sachin		 95		 A
2			Rahul		 55		 C
3			Sharda		 74		 B
4			Nayana		 80		 A
5			Akash		 45		 C
---------------------------------------------------------
1.Enter Data : 
2.Show Student Data : 
3.Update Score : 
4.Exit : 
Enter the choice = 
3
Enter the Roll number u want to update Score : 
5
Enter updated score : 
77
Enter updated grade : 
A
1.Enter Data : 
2.Show Student Data : 
3.Update Score : 
4.Exit : 
Enter the choice = 
2
---------------------------------------------------------
Roll No.	 Name		 Score		 Grade
---------------------------------------------------------
1			Sachin		 95		 A
2			Rahul		 55		 C
3			Sharda		 74		 B
4			Nayana		 80		 A
5			Akash		 77		 A
---------------------------------------------------------
1.Enter Data : 
2.Show Student Data : 
3.Update Score : 
4.Exit : 
Enter the choice = 
4
Exit Successfully ...
 */
