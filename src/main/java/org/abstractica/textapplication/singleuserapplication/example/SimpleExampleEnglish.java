package org.abstractica.textapplication.singleuserapplication.example;

import org.abstractica.textapplication.singleuserapplication.SingleUserTextApplication;

import org.abstractica.textapplication.textuser.TextUser;

public class SimpleExampleEnglish implements SingleUserTextApplication
{
	@Override
	public void run(TextUser user)
	{
		if(!user.getLanguageID().equals("ENGLISH"))
		{
			throw new RuntimeException("This application only supports english users");
		}
		String[] colors = {"Red", "Green", "Blue", "Yellow"};
		int colorIndex = user.selectItem(
				"What is your favorite color?",
				colors,
				"Your choice: ");
		user.sendMessage(colors[colorIndex] + " was a great choice!\n");
		user.sendMessage("Do you like coffee? ");
		boolean likeCoffee = user.getYesOrNo();
		String msg = likeCoffee ? "I will make you a nice cup of coffee." : "Tea it will be then.";
		user.sendMessage(msg+"\n");
		user.sendMessage("Goodbye!\n");
	}
}
