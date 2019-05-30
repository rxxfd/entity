

/**
 * @author mac
 * @version 1.0
 * @created 29-5月-2019 15:50:36
 */
public class Organizer {
	private String community;
	private int    id;
	private String name;
	private String password;
	private String phone;
	private int flag;
	/**
	 * 获取flag判断是否是个领导
	 * @return 
	 */
	public int getFlag() {
		return flag;
	}
	/**
	 * 设置flag
	 *	@param flag 领导标识 
	 */
	public void setFlag(int flag) {
		this.flag = flag;
	}
	/**
	 * 获取组织者所在社区
	 * @return community 社区
	 */
	public String getCommunity() {
		return community;
	}
	/**
	 * 设置
	 * @param community 社区
	 */
	public void setCommunity(String community) {
		this.community = community;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}