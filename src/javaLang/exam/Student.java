package javaLang.exam;

public class Student {

	String name;
	String number;
	int birthYear;
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name ="홍기동";
		s1.number="123";
		s1.birthYear=1995;

		Student s2 = new Student();
		s2.name ="홍기동";
		s2.number="123";
		s2.birthYear=1995;
		
		System.out.println(s1.equals(s2)); //false->true
		System.out.println(s1.hashCode() == s2.hashCode()); //false->true
		
		System.out.println(s1.toString());
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + birthYear;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (birthYear != other.birthYear)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}


}
