public class User{
	private String username="";
	private String password="";
	private String nickname="";
	private String avatar="";
	private String lastLoginDate="";
	
	
	
	//************* Sets **********************
	public void setUsername(String username){
		this.username=username;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	
	public void setNickname(String nickname){
		this.nickname=nickname;
	}
	
	public void setAvatar(String avatar){
		this.avatar=avatar;
	}
	
	public void setLastLoginDate(String lastLoginDate){
		this.lastLoginDate=lastLoginDate;
	}
	
	//************* Gets **********************
	public String getUsername(){
		return this.username;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public String getNickname(){
		return this.nickname;
	}
	
	public String getAvatar(){
		return this.avatar;
	}
	
	public String getLastLoginDate(){
		return this.lastLoginDate;
	}
	
	public boolean login(String username,String password){
		if (username==this.username && password==this.password){
			return true;
		}else{
			return false;
		}
	}
}