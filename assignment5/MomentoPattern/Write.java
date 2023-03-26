package MomentoPattern;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Write{
	public void writing(CheckPoint apple)throws Exception{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/sakthivel/Desktop/src/MomentoPattern/Checkpoint.dat"));
		oos.writeObject(apple);
	}
}