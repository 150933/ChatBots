
public class StudentBot extends ChatBot{
	
	public BotName;
	public 

	
	public StudentBot(String aName)
	{
		super(aName);
	}
	
	public String respondToGreeting(String greeting)
	{
		
		String greeting1="morning";
		String greeting2="afternoon";
		String greeting3="Hello";
		
		if (greeting.indexOf()==greeting1)
		{
			return "Good Morning";
		}
		
		else if (greeting.indexOf()==greeting2)
		{
			return "Good Afternoon";
		}
		
		else 
		{
			return "Hello";
		}
		
	}

	
}
