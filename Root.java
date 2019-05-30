/**
 * 超级管理员类有属性id，密码password
 * 管理员有如下方法：
 * getId() 获取id，
 * setPassword(String) 设置管理员密码。。。。。。
 * @author ZhangMingShuo
 * 
 */
public class Root {
	private int id;
	/**
	 * 获取管理员id
	 * @return 管理员id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 设置管理员id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	private String password;
	/**
	 * 获取管理员密码
	 * @return 管理员密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置管理员密码
	 * @param password 管理员密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Root [id=" + id + ", password=" + password + "]";
	}
}
