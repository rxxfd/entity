/**
 * ��ʦ�����������ԣ�community����ʦ��������������int��
 * credits����ʦ���֣�����int��
 * name����ʦ����������String��
 * password����ʦ��¼���룬����String��
 * phone����ʦ�ֻ����룬����String;
 * qualified����ʦ�Ƿ�����֤������Boolean;
 * resume����ʦ��飬����String��
 * ��ʦ�������·�����SetId�������õ�ʦ��ţ�SetName�������õ�ʦ����......
 * @author ZhangMingShuo	
 */
public class Lecturer {
	private int id;
	private String name;
	private String password;
	private String phone;
	private Boolean qualified;
	private String community;
	private int credits;
	private String resume;
	public Lecturer() {
		this.credits = 100;
	}
	/**
	 * ��ȡ��ʦid
	 * @return ��ʦid
	 */
	public int getId() {
		return id;
	}
	/**
	 * ���õ�ʦid
	 * @param id ��ʦid
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * ��ȡ��ʦ����
	 * @return ��ʦ����
	 */
	public String getName() {
		return name;
	}
	/**
	 * ���õ�ʦ����
	 * @param name ��ʦ����
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * ��ȡ��ʦ��¼����
	 * @return ��ʦ����
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * ���õ�ʦ��¼����
	 * @param password ��ʦ��¼����
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * ��ȡ��ʦ�绰
	 * @return ��ʦ�绰
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * ���õ�ʦ�绰
	 * @param phone ��ʦ�绰
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 
	 * @return ���ص�ʦ�Ƿ���֤
	 */
	public Boolean getQualified() {
		return qualified;
	}
	/**
	 * 
	 * ���õ�ʦ�Ƿ���֤
	 * @param qualified ��ʦ�Ƿ���֤
	 */
	public void setQualified(Boolean qualified) {
		this.qualified = qualified;
	}
	/**
	 * 
	 * @return ���ص�ʦ��������
	 */
	public String getCommunity() {
		return community;
	}
	/**
	 * 
	 * @param community ��ʦ��������
	 */
	public void setCommunity(String community) {
		this.community = community;
	}
	
	/**
	 * 
	 * @return ���ص�ʦ����
	 */
	public int getCredits() {
		return credits;
	}
	/**
	 * ���õ�ʦ����
	 * @param credits ��ʦ����
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
	/**
	 * @return ��õ�ʦ���
	 */
	public String getResume() {
		return resume;
	}
	/**
	 * 
	 * @param resume ��ʦ���
	 */
	public void setResume(String resume) {
		this.resume = resume;
	}
	@Override
	public String toString() {
		return "Lecturer [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + ", qualified="
				+ qualified + ", community=" + community + ", credits=" + credits + ", resume=" + resume + "]";
	}
}
