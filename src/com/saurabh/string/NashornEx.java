package com.saurabh.string;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornEx {

	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		// Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading Nashorn file  
        ee.eval(new FileReader("D:\\saurabh\\DUCS\\env\\Workspace\\Subscription\\Test\\src\\NashornTest.js"));  

	}

}
