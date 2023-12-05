package facade.pagemaker;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Database {
	private Database() {
	}
	
	public static Properties getProperties(String dbname) throws IOException {

		String filename = "/Users/jihyeon/eclipse-workspace/DesignPattern/src/facade/pagemaker/maildata.txt";
		Properties prop = new Properties();
		prop.load(new FileReader(filename));
		return prop;
	}

}
