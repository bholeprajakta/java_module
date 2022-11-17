import java.util.*;
class GrandParent
{
	String grandFatherName;
	String grandMotherName;
	
	GrandParent(String grandFatherName,String grandMotherName)
	{
		this.grandFatherName=grandFatherName;
		this.grandMotherName=grandMotherName;
		
		System.out.println("GrandFatherName:"+grandFatherName);
		System.out.println("GrandMotherName:"+grandMotherName);
	}
}
class Parent extends GrandParent
{
	String FatherName;
	String MotherName;
	
	Parent(String FatherName,String MotherName,String grandFatherName,String grandMotherName)
	{
		this(grandFatherName,grandMotherName);
		
		this.FatherName=FatherName;
		this.MotherName=MotherName;		
		
		System.out.println("FatherName:"+FatherName);
		System.out.println("MotherName:"+MotherName);
	}
	Parent(String grandFatherName,String grandMotherName)
	{
		super(grandFatherName,grandMotherName);
	}
}

class Child extends Parent
{
	Child(String FatherName,String MotherName,String grandFatherName,String grandMotherName)
	{
		super(FatherName,MotherName,grandFatherName,grandMotherName);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your grandfather name:");
		String gf=sc.next();
		System.out.println("Enter your grandmother name:");
		String gm=sc.next();
		System.out.println("Enter your father name:");
		String f=sc.next();
		System.out.println("Enter your mother name:");
		String m=sc.next();
		
		System.out.println("==================");
		Child C=new Child(f,m,gf,gm);		
	}
}