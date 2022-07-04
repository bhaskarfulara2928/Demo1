import java.io.*;
import javax.script.*;

interface Demo{
	public static void main(String args[]){
		try
		{
			ScriptEngineManager mgr=new ScriptEngineManager();
			ScriptEngine engine=mgr.getEngineByName("JavaScript");
			engine.eval("print('Hello from Java')");
			engine.eval(new FileReader("Program4.js"));
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}