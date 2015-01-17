
public class TeachersPet extends StudentBot{			//TeachersPet is subclass of StudentBot

	public TeachersPet(String aName)
	{
		super(aName);								//creates object by invoking its superclasses's constructor
	}
	
	public String respondToGreeting(String greeting)		//creates a greeting that addresses the users name and then use default greetings
	{
		String s = super.respondToGreeting(greeting);				
		int i = greeting.indexOf("name is");
		if (i>0)								//if the trigger word "name is" is present, it will take everything after the phrase	
		{										//of the trigger word (hence the i+7 since its 7 characters long) and use its default greeting
			s += greeting,substring(i+7);		//before its extract
		}
		
		else
		{
			s += ".";
		}
		
		s += "What are we going to do in class today?";
		
	}
	
	
	
}