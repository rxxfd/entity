/**
 * ��ʦ�����������ԣ�
 * address ���ַ��String
 * checkinNo ǩ��������int
 * credits ����ֲ������˻�õĻ��֣�int
 * description �������String
 * durationTime �����ʱ�䣺float
 * isApply �Ƿ���������Boolean
 * pubTime 	����ʱ�䣺Date
 * grabTime ����ʱ�䣺Date
 * holdTime �ٰ�ʱ�䣺Date
 * id ����ͣ�int
 * limits ��������ƣ�int
 * lname ��ʦ������String
 * name �������String
 * oid ���֯�ߣ�id
 * oname ���֯�ߵ����֣�String
 * @author hxq
 * @version 1.0
 * @created 17-5-2019 14:32:10
 */
import java.util.Date;
public class Activity {
	private String address;
	private int checkinNo;
	private int credits;
	private String description;
	private float durationTime;
	private Date grabTime;
	private Date holdTime;
	private int id;
	private boolean isApply;
	private int lid;
	private int limits;
	private String lname;
	private String name;
	private int oid;
	private String oname;
	private Date pubTime;
	/**
	 * state:0 δ���
	 * state:1 �����
	 * state:2 ������
	 * state:3 ������
	 * state:4 ������
	 * state:5 �ٰ���
	 * state:6 �ѽ���
	 */
	private int state;
	/**
	 * ��û״̬
	 * @return state �״̬
	 */
	public int getState() {
		return state;
	}
	/**
	 * ���û״̬0��1��2��3��4��5��6
	 * @param state �״̬
	 */
	public void setState(int state) {
		this.state = state;
	}
	/**
	 * ��ȡ���ַ
	 * @return address ���ַ
	 */
    public String getAddress() {
        return address;
    }
    /**
     * ���û��ַ
     * @param address ���ַ
     */

    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * ��ȡǩ������
     * @return checkinNo ǩ������
     */

    public int getCheckinNo() {
        return checkinNo;
    }
    /**
     * ����ǩ������
     * @param checkinNo ǩ������
     */
    public void setCheckinNo(int checkinNo) {
        this.checkinNo = checkinNo;
    }
    /**
     * ��ȡ�����
     * @return credits �����
     */
    public int getCredits() {
        return credits;
    }
    /**
     * ���û����
     * @param credits
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }
    /**
     * ��ȡ�����
     * @return description ����
     */
    public String getDescription() {
        return description;
    }
    /**
     * ���û����
     * @param description �����
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * ��ȡ�����ʱ��
     * @return durationTime ����
     */
    public float getDurationTime() {
        return durationTime;
    }
    /**
     * ���ûʱ��
     * @param durationTime 
     */
    public void setDurationTime(float durationTime) {
        this.durationTime = durationTime;
    }
    /**
     * ��õ�ʦ����ʱ��
     * @return grabTime ��ʦ����ʱ��
     */
    public Date getGrabTime() {
        return grabTime;
    }
    /**
     * ��������ʱ��
     * @param grabTime ����ʱ��
     */
    public void setGrabTime(Date grabTime) {
        this.grabTime = grabTime;
    }
    /**
     * ��ٰ�ʱ��
     * @return holdTime
     */
    public Date getHoldTime() {
        return holdTime;
    }
    /**
     * ���þٰ�ʱ��
     * @param holdTime �ٰ�ʱ��
     */
    public void setHoldTime(Date holdTime) {
        this.holdTime = holdTime;
    }
    /**
     * ���ػid
     * @return id �id
     */
    public int getId() {
        return id;
    }
    /**
     * ���ûid
     * @param id �id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * �Ƿ���Ա���
     * @return isApply
     */
    public boolean isApply() {
        return isApply;
    }
    /**
     * ���û�ɷ���
     * @param apply �ɷ�����־
     */
    public void setApply(boolean apply) {
        isApply = apply;
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
     * ��û��������
     * @return limits ��������
     */
    public int getLimits() {
        return limits;
    }
    /**
     * ���û��������
     * @param limits
     */
    public void setLimits(int limits) {
        this.limits = limits;
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
    /**
     * ��û����
     * @return name �����
     */
    public String getName() {
        return name;
    }
    /**
     * ���û����
     * @param name �����
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * ��û��֯��id
     * @return oid ��֯��id
     */
    public int getOid() {
        return oid;
    }
    /**
     * ���û��֯��id
     * @param oid ���֯��id
     */
    public void setOid(int oid) {
        this.oid = oid;
    }
    /**
     * ��û��֯������
     * @return oname ���֯������
     */
    public String getOname() {
        return oname;
    }
    /**
     * ���û��֯������
     * @param oname ���֯������
     */
    public void setOname(String oname) {
        this.oname = oname;
    }
    /**
     * ��û����ʱ��
     * @return pubTime �����ʱ��
     */
    public Date getPubTime() {
        return pubTime;
    }
    /**
     * ���û����ʱ��
     * @param pubTime �����ʱ��
     */
    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }
}