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
		//�ȴ���һ���û��Ķ���
		User user = new User("����");
		User user2 = new User("����");
		
		List<User> userList = new ArrayList<User>();
		
		userList.add(user);
		userList.add(user2);
		
		System.out.println(user.getUserName());
		System.out.println(user2.getUserName());
	}

}
