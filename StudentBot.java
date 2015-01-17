
public class StudentBot extends ChatBot{			//StudentBot is a subclass of ChatBot
	
	public BotName;

	
	public StudentBot(String aName)				//Creates the object by invoking its superclass's constructor
	{
		super(aName);
	}
	
	public String respondToGreeting(String greeting)		//This method creates responses 
	{
		
		String greeting1="morning";				//these are the three main trigger words
		String greeting2="afternoon";
		String greeting3="Hello";
		
		if (greeting.indexOf()==greeting1)				
		{
			return "Good Morning";					//response 1 is "Good Morning"
		}
		
		else if (greeting.indexOf()==greeting2)
		{
			return "Good Afternoon";	//response 2 is "Good Afternoon"
		}
		
		else 
		{
			return "Hello";			//response 3 is "Hello"
		}
		
	}

	
}
