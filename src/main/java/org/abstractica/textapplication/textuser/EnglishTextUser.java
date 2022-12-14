package org.abstractica.textapplication.textuser;

import org.abstractica.core.io.Input;
import org.abstractica.core.io.Output;

public class EnglishTextUser extends ATextUser
{
	public EnglishTextUser(Input<String> stringInput, Output<String> stringOutput)
	{
		super(stringInput, stringOutput);
	}

	@Override
	public String getLanguageID()
	{
		return "ENGLISH";
	}

	@Override
	public String retryInteger()
	{
		return "Please enter an integer: ";
	}

	@Override
	public String retryInteger(int min, int max)
	{
		return "Please enter an integer between " + min + " and " + max + " (both inclusive): ";
	}

	@Override
	public String retryDouble()
	{
		return "Please enter a number: ";
	}

	@Override
	public String retryDouble(double min, double max)
	{
		return "Please enter a number between " + min + " and " + max + " (both inclusive): ";
	}

	@Override
	public boolean evaluateYesOrNo(String yesOrNo) throws IllegalArgumentException
	{
		String yOrN = yesOrNo.trim().toLowerCase();
		if("y".equals(yOrN) || "yes".equals(yOrN) || "'y'".equals(yOrN) || "'yes'".equals(yOrN))
		{
			return true;
		}
		if("n".equals(yOrN) || "no".equals(yOrN) || "'n'".equals(yOrN) || "'no'".equals(yOrN))
		{
			return false;
		}
		throw new IllegalArgumentException("Could not parse " + yesOrNo + " as yes or no!");
	}

	@Override
	public String retryYesOrNo()
	{
		return "Please enter 'y' or 'yes' for yes or enter 'n' or 'no' for no: ";
	}
}
