/* Aim:- Practical No.1
   Author:- Pranali Mohanakar
   Version:- 21.0.2
   Date:- 30 Jan 2024

*/

class PracticalN1
{
public static void main(String []argv)
{
   CompanyData SBJIT = new CompanyData("Pranali Mohankar", 20, "Female", D003);
   SBJIT.display();
} 
}

class CompanyData
{
String name;
int age;
String gender;
int empid;

CompanyData()
{

	System.out.println("Inside Default Constructor");

}
CompanyData(String nm, int ag, String gen, int em)
{ 
	System.out.println("Inside Parametrised Constructor");

	this.name=nm;
	this.age=ag;
	this.gender=gen;
	this.empid=em;

}


public void display()
{ 
 	System.out.println("Name -"+this.name  +"Age -"+this.age  +"Gender -"+this.gender  +"EmpId -"+this.empid);
}

}

