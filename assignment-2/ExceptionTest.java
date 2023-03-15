package assignment2;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		error obj = new error();
		obj.throwing();
	}

}
class error{
	public void throwing() {
		throw new IOException();
	}
}
