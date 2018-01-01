package properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

public class Demo {
	@Test
public void test(){
	User user1=new User("1","1");
	User user2=new User("2","2");
	User user3=new User("3","4");
	Properties P=new Properties();
	P.setProperty(user1.getId(), user1.getId()+","+user1.getPassword());
	P.setProperty(user2.getId(), user2.getId()+","+user2.getPassword());
	P.setProperty(user3.getId(), user3.getId()+","+user3.getPassword());
	try {
		P.store(new FileOutputStream("src/properties/user.properties"), "All user list");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
class User {
	private String id;
	private String password;
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public User() {
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + "]";
	}
	
}
