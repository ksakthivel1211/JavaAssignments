package MomentoPattern;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Read{
	public CheckPoint reading(String fileName)throws Exception{
		ObjectInputStream objectInputStream = new objectInputStream(new FileInputStream(fileName));
		return (CheckPoint)objectInputStream.readObject();
}
}