
public class TeachersPet extends StudentBot{

	public TeachersPet(String aName)
	{
		super(aName);
	}
	
	public String respondToGreeting(String greeting)
	{
		String s = super.respondToGreeting(greeting);
		int i = greeting.indexOf("name is");
		if (i>0)
		{
			s += greeting,substring(i+7);
		}
		
		else
		{
			s += ".";
		}
		
		s += "What are we going to do in class today?";
		
	}
	
	
	
}