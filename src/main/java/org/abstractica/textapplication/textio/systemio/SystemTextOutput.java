package org.abstractica.textapplication.textio.systemio;

import org.abstractica.core.io.Output;

public class SystemTextOutput implements Output<String>
{
	@Override
	public void put(String s)
	{
		System.out.print(s);
	}
}
