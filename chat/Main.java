public class Main{
	public static void main(String[] args){
		User myUser=new User();
		myUser.setUsername("reza");
		myUser.setPassword("123");
		System.out.println(myUser.login("reza","123"));
	}
}