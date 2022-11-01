package org.abstractica.textapplication.textuser;

import java.util.ArrayList;
import java.util.List;

public interface TextUser extends TextUserLanguage
{
	void sendMessage(String str);
	String recieveMsg();

	default int getInteger()
	{
		while(true)
		{
			String input = recieveMsg();
			try
			{
				return Integer.parseInt(input);
			}
			catch(NumberFormatException exp)
			{
				sendMessage(retryInteger());
			}
		}
	}

	default int getInteger(int min, int max)
	{
		while(true)
		{
			String input = recieveMsg();
			try
			{
				int i = Integer.parseInt(input);
				if(i >= min && i <= max)
				{
					return i;
				}
				sendMessage(retryInteger(min, max));
			}
			catch(NumberFormatException exp)
			{
				sendMessage(retryInteger());
			}
		}
	}

	default double getNumber()
	{
		while(true)
		{
			String input = recieveMsg();
			try
			{
				return Double.parseDouble(input);
			}
			catch(NumberFormatException exp)
			{
				sendMessage(retryDouble());
			}
		}
	}

	default double getNumber(double min, double max)
	{
		while(true)
		{
			String input = recieveMsg();
			try
			{
				float f = Float.parseFloat(input);
				if(f >= min && f <= max)
				{
					return f;
				}
				sendMessage(retryDouble(min, max));
			}
			catch(NumberFormatException exp)
			{
				sendMessage(retryInteger());
			}
		}
	}

	default int selectItem(String preList, Iterable<String> choices, String postList)
	{
		List<String> choiceList = new ArrayList<>();
		for(String s : choices)
		{
			choiceList.add(s);
		}
		return selectItem(preList, choiceList, postList);
	}

	default int selectItem(String preList, List<String> choices, String postList)
	{
		String[] choiceArray = new String[choices.size()];
		int i = 0;
		for(String choice : choices)
		{
			choiceArray[i++] = choice;
		}
		return selectItem(preList, choiceArray, postList);
	}

	default int selectItem(String preList, String[] choices, String postList)
	{
		StringBuilder msg = new StringBuilder();
		msg.append(preList);
		msg.append(System.lineSeparator());
		for(int i = 0; i < choices.length; ++i)
		{
			msg.append("  ");
			msg.append(i+1);
			msg.append(" - ");
			msg.append(choices[i]);
			msg.append(System.lineSeparator());
		}
		msg.append(postList);
		sendMessage(msg.toString());
		return getInteger(1, choices.length)-1;
	}

	default boolean getYesOrNo()
	{
		while(true)
		{
			String yesOrNo = recieveMsg();
			try
			{
				return evaluateYesOrNo(yesOrNo);
			} catch (IllegalArgumentException e)
			{
				sendMessage(retryYesOrNo());
			}
		}
	}
}
