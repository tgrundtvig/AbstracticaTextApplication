package org.abstractica.textapplication.textuser;

public interface TextUserLanguage
{
	String getLanguageID();

	String retryInteger();

	String retryInteger(int min, int max);

	String retryDouble();

	String retryDouble(double min, double max);

	boolean evaluateYesOrNo(String yesOrNo) throws IllegalArgumentException;

	String retryYesOrNo();
}
