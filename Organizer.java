

/**
 * @author mac
 * @version 1.0
 * @created 29-5��-2019 15:50:36
 */
public class Organizer {
	private String community;
	private int    id;
	private String name;
	private String password;
	private String phone;
	private int flag;
	/**
	 * ��ȡflag�ж��Ƿ��Ǹ��쵼
	 * @return 
	 */
	public int getFlag() {
		return flag;
	}
	/**
	 * ����flag
	 *	@param flag �쵼��ʶ 
	 */
	public void setFlag(int flag) {
		this.flag = flag;
	}
	/**
	 * ��ȡ��֯����������
	 * @return community ����
	 */
	public String getCommunity() {
		return community;
	}
	/**
	 * ����
	 * @param community ����
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