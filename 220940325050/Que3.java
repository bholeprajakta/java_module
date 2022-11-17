
class Shape
{
	void draw()
	{
		System.out.println("Draw shape");
	}
	void erase()
	{
		System.out.println("Erase shape");
	}
}
class Circle extends Shape
{
	void draw()
	{
		//super.draw();  // if we want to aceess parent method also then use super
		System.out.println("Draw Circle");
	}
	void erase()
	{
		//super.erase(); // if we want to aceess parent method also then use super
		System.out.println("Erase Circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		//super.draw(); // if we want to aceess parent method also then use super
		System.out.println("Draw Triangle");
	}
	void erase()
	{
		//super.erase(); // if we want to aceess parent method also then use super
		System.out.println("Erase Triangle");
	}
}
class Square extends Shape
{
	void draw()
	{
		//super.draw(); // if we want to aceess parent method also then use super
		System.out.println("Draw square");
	}
	void erase()
	{
		//super.erase(); // if we want to aceess parent method also then use super
		System.out.println("Erase square");
	}
}

class Que3
{
	public static void main(String args[])
	{
		Shape circle=new Circle(); // here i used upcating
		Shape triangle=new Triangle();
		Shape square=new Square();
		circle.draw();
		circle.erase();
		triangle.draw();
		triangle.erase();
		square.draw();
		square.erase();	
	}
}