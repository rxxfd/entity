/**
 * ѧ��������������:
 * address����ѧ��סַ������String��
 * credits����ѧ�����֣�����int��
 * id����ѧ���ı�ʶ������int��
 * name����ѧ������������String��
 * password����ѧ���˻����룬����String��
 * phone����ѧ���绰������int��
 * ѧ���������·�����
 * getAddress��������ѧ��סַ��
 * setAddress(String)����ѧ��סַ......
 * @author ZhangMingShuo
 *
 */
public class Student {
	private int id;
	private String name;
	private String password;
	private int credits;
	private String phone;
	private String address;
	public Student() {
		this.credits = 100;
	}
	/**
	 * ��ȡѧ��id
	 * @return ѧ��id
	 */
	public int getId() {
		return id;
	}
	/**
	 * ����ѧ��id
	 * @param id ѧ��id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * ��ȡѧ������
	 * @return ѧ������
	 */
	public String getName() {
		return name;
	}
	/**
	 * ����ѧ������
	 * @param name ѧ������
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * ��ȡѧ������
	 * @return ѧ����½����
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * ��½����
	 * @param password ѧ����¼����
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * ����ѧ�������
	 * @return ѧ������
	 */
	public int getCredits() {
		return credits;
	}
	/**
	 * ����ѧ������
	 * @param credits ѧ������
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
	/**
	 * ��ȡѧ���绰
	 * @return ѧ���绰
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * ����ѧ���绰
	 * @param phone ѧ���绰
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * ��ȡѧ����ַ
	 * @return ѧ����ַ
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * ����ѧ����ַ
	 * @param address ѧ����ַ
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + ", credits=" + credits + ", phone="
				+ phone + ", address=" + address + "]";
	}
}
