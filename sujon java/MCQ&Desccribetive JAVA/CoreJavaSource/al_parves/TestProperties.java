import java.util.Properties;
public class TestProperties{
	public static void main(String[] args){

		Properties prop = System.getProperties();
		prop.list(System.out);
	}
}