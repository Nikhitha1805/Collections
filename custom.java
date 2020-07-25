package gprec.cse;

import java.util.*; 

class studentData 
{ 
	int roll; 
	String name; 
	char grade; 
	studentData(int roll, String name, char grade) 
	{ 
		this.roll = roll; 
		this.name = name; 
		this.grade=grade; 
	} 
} 
class CustomArrayList 
{ 
	static ArrayList<studentData> list=new ArrayList<studentData>();
	public static void main(String args[]) 
	{ 
		int n;
		Scanner sc=new Scanner(System.in);
		//CustomArrayList custom = new CustomArrayList(); 
		
		System.out.println("Enter number of students (>10):");
	    n=sc.nextInt();
		while(n<=2)
		{
			System.out.println("Enter number of students (>10):");
			n=sc.nextInt();
		}
		int roll[] = new int[n]; 
		String name[] =new String[n] ; 
		char grade[] = new char[n]; 
        System.out.println("Enter student details");
        for(int i=0;i<n;i++)
        {
        	System.out.println("Enter rollno of student "+(i+1)); 
            roll[i]=sc.nextInt();
            System.out.println("Enter name of student "+(i+1)); 
            sc.nextLine();
            name[i]=sc.nextLine();
            System.out.println("Enter grade of student "+(i+1)); 
            grade[i]=sc.next().charAt(0);
            addValues(roll[i], name[i], grade[i]); 
        }
        printValues(list);
	} 
	public static void addValues(int roll, String name, char grade) 
	{
			 
			list.add(new studentData(roll, name, grade));  
	} 
	public static void printValues(ArrayList<studentData> list) 
	{ 
		System.out.println("Student details:");
		for (int i = 0; i < list.size(); i++) 
		{ 
			studentData data = list.get(i); 
			System.out.println(data.roll+" "+data.name+" "+data.grade); 
		} 
	} 
} 

