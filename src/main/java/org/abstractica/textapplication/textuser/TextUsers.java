package org.abstractica.textapplication.textuser;

import org.abstractica.core.io.Input;
import org.abstractica.core.io.Output;
import org.abstractica.textapplication.textio.systemio.SystemTextInput;
import org.abstractica.textapplication.textio.systemio.SystemTextOutput;

public class TextUsers
{
	public static TextUser getSystemIOUser(String languageID)
	{
		Input<String> in = new SystemTextInput();
		Output<String> out = new SystemTextOutput();
		return createTextUser(in, out, languageID);
	}

	private static TextUser createTextUser(Input<String> in, Output<String> out, String languageID)
	{
		return switch(languageID)
				{
					case "ENGLISH" -> new EnglishTextUser(in, out);
					case "DANISH" -> new DanishTextUser(in, out);
					default -> throw new RuntimeException("Unknown language id: " + languageID);
				};
	}
}
