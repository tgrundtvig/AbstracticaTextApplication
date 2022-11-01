package org.abstractica.textapplication.textio.systemio;

import org.abstractica.core.io.Input;

import java.util.Scanner;

public class SystemTextInput implements Input<String>
{
	private static final Scanner scanner = new Scanner(System.in);
	@Override
	public String get()
	{
		return scanner.nextLine();
	}
}
