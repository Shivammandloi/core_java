package com.rays.IO1;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class G_Employee11a implements Externalizable {
	public String id = null;
	public String firstName = null;
	public String lastName = null;
	public int salary = 0;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(id);
		out.writeObject(firstName);
		out.writeObject(lastName);
		out.writeObject(salary);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = (String) in.readObject();
		firstName = (String) in.readObject();
		lastName = (String) in.readObject();
		salary = (int) in.readObject();

	}

}
