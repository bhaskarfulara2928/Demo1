import java.io.*;
import javax.script.*;

class Program5{
	public static void main(String args[]){
		try{
			ScriptEngineManager mgr=new ScriptEngineManager();
			ScriptEngine engine=mgr.getEngineByName("JavaScript");
			engine.eval("print('HELLO from Java Program')");
			engine.eval(new FileReader("Program4.js"));
			engine.eval(new FileReader("Program5_1.js"));
			Invocable inv=(Invocable) engine;
			inv.invokeFunction("abc");
			inv.invokeFunction("addNum",11,22);
			String result=(String) inv.invokeFunction("greet",args[0],args[1]);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}



}