package org.abstractica.textapplication.textuser;

import org.abstractica.core.io.Input;
import org.abstractica.core.io.Output;

public abstract class ATextUser implements TextUser
{
	private final Input<String> stringInput;
	private final Output<String> stringOutput;

	public ATextUser(Input<String> stringInput, Output<String> stringOutput)
	{
		this.stringInput = stringInput;
		this.stringOutput = stringOutput;
	}

	@Override
	public void sendMessage(String str)
	{
		stringOutput.put(str);
	}

	@Override
	public String recieveMsg()
	{
		return stringInput.get();
	}
}
