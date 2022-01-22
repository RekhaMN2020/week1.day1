package Started;

public class Mobile {

	public void sendMsg()
	{
		System.out.println("Message is sent to 9962987456");
	}
	
	public void makeCall()
	{
		System.out.println("You are allowed to call from 9962987465");
	}
	public void saveContact()
	{
		System.out.println("Do you want to save 9962987456 to your contact list");
		
	}
	
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.sendMsg();
		obj.makeCall();
		obj.saveContact();
		
	}
}
