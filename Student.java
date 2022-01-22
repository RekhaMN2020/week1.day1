package Started;

public class Student {
	//Global variable declaration
	String name="Rekha";
	int rollNo=19;
	
	
//using public as access modifier	
public void collegeName()
{	System.out.println("Using public as access modifier");
	String name1="TestLeaf";
	System.out.println(name1);
}


//using private as access modifier

/*private void collegeName()
{	System.out.println("Using private as access modifier");
	String name1="TestLeaf";
	System.out.println(name1);
}

*/
//Default access modifier
/*void collegeName()
{	System.out.println("Using Default as access modifier");
	String name1="TestLeaf";
	System.out.println(name1);
}
*/
public static void main(String[] args) {
	Student obj=new Student();
	System.out.println(obj.name);
	System.out.println(obj.rollNo);
	obj.collegeName();
}

}
