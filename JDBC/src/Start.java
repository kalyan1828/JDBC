import java.io.InputStream;
import java.util.Scanner;

import com.entity.User;
import com.service.UserController;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		User user=new User();
		System.out.println("enter the userid");
		user.setId(sc.nextInt());
		System.out.println("enter the user name");
		user.setName(sc.next());
		//sc.n
		System.out.println("enter the school");
		user.setSchool(sc.next());
		//sc.close();
		UserController uc=new UserController();
		if(uc.insertUser(user)!=0) {
			System.out.println("Insert Sucessful");
		}
		
		uc.viewUser(user);
		
		System.out.println("do you want to delete something 1 yes 2 no");
		int deleteid=sc.nextInt();
		if(deleteid==1) {
			System.out.println("enter the id");
			user.setId(sc.nextInt());
			if(uc.deleteUser(user)!=0) {
				System.out.println("deleted sucessfully");
			}
			sc.close();
		}
		
	}

}
