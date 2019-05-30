/**
 * 导师参与活动的历史信息类
 * 
 * @author 11707
 *
 */
public class Lhistory {
	/**
	 * 活动id
	 */
	private int aid;
	/**
	 * 导师id
	 */
	private int lid;
	/**
	 * 活动名称
	 */
	private String aname;
	/**
	 * 导师名称
	 */
	private String lname;
	/**
	 * 获得活动id
	 * @return aid 活动id
	 */
	public int getAid() {
		return aid;
	}
	/**
	 * 设置活动id
	 * @param aid 活动id
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}
	/**
	 * 获得导师id
	 * @return lid 导师id
	 */
	public int getLid() {
		return lid;
	}
	/**
	 * 设置导师id
	 * @param lid 导师id
	 */
	public void setLid(int lid) {
		this.lid = lid;
	}
	/**
	 * 获得活动名称
	 * @return aname 活动名称
	 */
	public String getAname() {
		return aname;
	}
	/**
	 *  设置活动名称
	 *  @param aname 活动名称
	 */
	public void setAname(String aname) {
		this.aname = aname;
	}
	/**
	 * 获得导师姓名
	 * @return lname 导师姓名
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * 设置导师姓名
	 * @param lname 导师姓名
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
}