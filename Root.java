/**
 * ��������Ա��������id������password
 * ����Ա�����·�����
 * getId() ��ȡid��
 * setPassword(String) ���ù���Ա���롣����������
 * @author ZhangMingShuo
 * 
 */
public class Root {
	private int id;
	/**
	 * ��ȡ����Աid
	 * @return ����Աid
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * ���ù���Աid
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	private String password;
	/**
	 * ��ȡ����Ա����
	 * @return ����Ա����
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * ���ù���Ա����
	 * @param password ����Ա����
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Root [id=" + id + ", password=" + password + "]";
	}
}
