package org.abstractica.textapplication.textuser;

import org.abstractica.core.io.Input;
import org.abstractica.core.io.Output;

public class DanishTextUser extends ATextUser
{
	public DanishTextUser(Input<String> stringInput, Output<String> stringOutput)
	{
		super(stringInput, stringOutput);
	}

	@Override
	public String getLanguageID()
	{
		return "DANISH";
	}

	@Override
	public String retryInteger()
	{
		return "Indtast venligst et heltal: ";
	}

	@Override
	public String retryInteger(int min, int max)
	{
		return "Indtast venligst et heltal mellem " + min + " og " + max + " (begge inklusive): ";
	}

	@Override
	public String retryDouble()
	{
		return "Indtast venligst et tal: ";
	}

	@Override
	public String retryDouble(double min, double max)
	{
		return "Indtast venligst et tal mellem " + min + " og " + max + " (begge inklusive): ";
	}

	@Override
	public boolean evaluateYesOrNo(String yesOrNo) throws IllegalArgumentException
	{
		String yOrN = yesOrNo.trim().toLowerCase();
		if("j".equals(yOrN) || "ja".equals(yOrN) || "'j'".equals(yOrN) || "'ja'".equals(yOrN))
		{
			return true;
		}
		if("n".equals(yOrN) || "nej".equals(yOrN) || "'n'".equals(yOrN) || "'nej'".equals(yOrN))
		{
			return false;
		}
		throw new IllegalArgumentException("Could not parse " + yesOrNo + " as yes or no!");
	}

	@Override
	public String retryYesOrNo()
	{
		return "Skriv venligst 'j' eller 'ja' for ja, eller skriv 'n' eller 'nej' for nej: ";
	}
}
