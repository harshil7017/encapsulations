package encap;

public class encapsulation {

	private String name="harshil";
	public String getName()
	{
		return name;
	}
	public void setName(String newName)
	{
		this.name=newName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsulation en=new encapsulation();
		en.setName("abc");
		System.out.println(en.getName());
	}

}
