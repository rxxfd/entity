/**
 * ��ʦ��������ʷ��Ϣ��
 * 
 * @author 11707
 *
 */
public class Lhistory {
	/**
	 * �id
	 */
	private int aid;
	/**
	 * ��ʦid
	 */
	private int lid;
	/**
	 * �����
	 */
	private String aname;
	/**
	 * ��ʦ����
	 */
	private String lname;
	/**
	 * ��ûid
	 * @return aid �id
	 */
	public int getAid() {
		return aid;
	}
	/**
	 * ���ûid
	 * @param aid �id
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}
	/**
	 * ��õ�ʦid
	 * @return lid ��ʦid
	 */
	public int getLid() {
		return lid;
	}
	/**
	 * ���õ�ʦid
	 * @param lid ��ʦid
	 */
	public void setLid(int lid) {
		this.lid = lid;
	}
	/**
	 * ��û����
	 * @return aname �����
	 */
	public String getAname() {
		return aname;
	}
	/**
	 *  ���û����
	 *  @param aname �����
	 */
	public void setAname(String aname) {
		this.aname = aname;
	}
	/**
	 * ��õ�ʦ����
	 * @return lname ��ʦ����
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * ���õ�ʦ����
	 * @param lname ��ʦ����
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
}