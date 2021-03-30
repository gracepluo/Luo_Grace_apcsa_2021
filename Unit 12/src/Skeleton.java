//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	private int myHeight;
	private int myWeight;
	private int myAge;

	//write a default Constructor

	public Skeleton() {
		this(0,0,0);
	}

	//write an initialization constructor with an int parameter ht
	
	public Skeleton(int h) {
		this(h, 0, 0);
	}

	//write an initialization constructor with int parameters ht and wt
	
	public Skeleton(int h, int w) {
		this(h, w, 0);
	}

	//write an initialization constructor with int parameters ht, wt, and age

	public Skeleton(int h, int w, int a) {
		myHeight = h;
		myWeight = w;
		myAge = a;
	}
	
	
	//modifiers - write set methods for height, weight, and age

	public void setHeight(int h) {
		myHeight = h;
	}
	
	public void setWeight(int w) {
		myWeight = w;
	}
	
	public void setAge(int a) {
		myAge = a;
	}
	
	
	//accessors - write get methods for height, weight, and age
	
	public int getHeight() {
		return myHeight;
	}
	
	public int getWeight() {
		return myWeight;
	}
	
	public int getAge() {
		return myAge;
	}
	
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Skeleton(myHeight, myWeight, myAge);
	}

	public boolean equals( Object obj )
	{
		Skeleton other = (Skeleton)obj;
		return other.getHeight() == this.getHeight() &&
				other.getWeight() == this.getWeight() &&
				other.getAge() == this.getAge();
	}

	public int compareTo( Object obj )
	{
		Skeleton rhs = (Skeleton)obj;
		
		if (this.getHeight() > rhs.getHeight()) {
			return 1;
		}
		else if (this.getWeight() > rhs.getWeight()) {
			return 1;
		}
		else if (this.getAge() > rhs.getAge()) {
			return 1;
		}
		
		if (this.equals(obj)) return 0;
		
		return -1;
	}

	//write a toString() method
	public String toString() {
		return getHeight() + " " + getWeight() + " " + getAge();
	}

	@Override
	public int getHowBig() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBigger(Monster other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSmaller(Monster other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean namesTheSame(Monster other) {
		// TODO Auto-generated method stub
		return false;
	}
	
}