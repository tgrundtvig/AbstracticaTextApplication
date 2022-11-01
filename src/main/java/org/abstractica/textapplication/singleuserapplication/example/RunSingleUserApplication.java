package org.abstractica.textapplication.singleuserapplication.example;

import org.abstractica.core.io.Input;
import org.abstractica.core.io.Output;
import org.abstractica.textapplication.singleuserapplication.SingleUserTextApplication;
import org.abstractica.textapplication.textio.systemio.SystemTextInput;
import org.abstractica.textapplication.textio.systemio.SystemTextOutput;
import org.abstractica.textapplication.textuser.EnglishTextUser;
import org.abstractica.textapplication.textuser.TextUser;
import org.abstractica.textapplication.textuser.TextUsers;

public class RunSingleUserApplication
{
	public static void main(String[] args)
	{
		TextUser user = TextUsers.getSystemIOUser("ENGLISH");
		SingleUserTextApplication app = new SimpleExampleEnglish();
		app.run(user);
	}
}
