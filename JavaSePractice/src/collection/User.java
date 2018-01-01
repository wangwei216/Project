package collection;

import java.util.List;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class User {
	
	private String userName;
	
	public User(String userName){
		
		super();
		this.userName = userName;
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public static void main(String[] args){
		//先创建一个用户的对象
		User user = new User("张三");
		User user2 = new User("李四");
		
		List<User> userList = new ArrayList<User>();
		
		userList.add(user);
		userList.add(user2);
		
		System.out.println(user.getUserName());
		System.out.println(user2.getUserName());
	}

}
