package MomentoPattern;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Read{
	public CheckPoint reading(String fileName)throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
		return (CheckPoint)ois.readObject();
}
}