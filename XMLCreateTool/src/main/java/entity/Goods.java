package entity;

import java.io.Serializable;

/**
 * ��Ʒ��
 * @author swj
 *
 */
public class Goods implements Serializable {
	/**��Ʒ���ƣ����Ϊ����ʱ�������ۿ��У��ۿ��е���Ʒ����Ӧ����һ�е���Ʒ����һ�£�100�ֽڣ�*/
	private String Spmc;
	/**����ͺţ�40�ֽڣ�*/
	private String Ggxh;
	/**������λ��32�ֽڣ�*/
	private String Jldw;
	/**��Ʒ����(19�ֽ�)�������*/
	private String Spbm;
	/**��ҵ��Ʒ���루20�ֽڣ�*/
	private String Qyspbm;
	/**�Ƿ�ʹ���Ż����߱�ʶ0����ʹ�ã�1��ʹ�ã�1�ֽڣ�*/
	private String Syyhzcbz;
	/**��˰�ʱ�ʶ�գ�����˰�ʣ�0��������˰��1����˰��2�������գ�3��ͨ��˰�ʣ�1�ֽڣ�*/
	private String Lslbz;
	/**�Ż�����˵����50�ֽڣ�*/
	private String Yhzcsm;
	/**���ۣ�������������ԭ����ʯ�ͣ�5%˰�ʣ�����Ϊ��˰���ۣ�*/
	private Double Dj; 
	/**����*/
	private Double Sl;
	/**�������Ϊ����ʱΪ�ۿ���*/
	private Double Je;
	/**˰��*/
	private Double Slv;
	/**�۳�����ڲ��˰����*/
	private Double Kce;
	public String getSpmc() {
		return Spmc;
	}
	public void setSpmc(String spmc) {
		Spmc = spmc;
	}
	public String getGgxh() {
		return Ggxh;
	}
	public void setGgxh(String ggxh) {
		Ggxh = ggxh;
	}
	public String getJldw() {
		return Jldw;
	}
	public void setJldw(String jldw) {
		Jldw = jldw;
	}
	public String getSpbm() {
		return Spbm;
	}
	public void setSpbm(String spbm) {
		Spbm = spbm;
	}
	public String getQyspbm() {
		return Qyspbm;
	}
	public void setQyspbm(String qyspbm) {
		Qyspbm = qyspbm;
	}
	public String getSyyhzcbz() {
		return Syyhzcbz;
	}
	public void setSyyhzcbz(String syyhzcbz) {
		Syyhzcbz = syyhzcbz;
	}
	public String getLslbz() {
		return Lslbz;
	}
	public void setLslbz(String lslbz) {
		Lslbz = lslbz;
	}
	public String getYhzcsm() {
		return Yhzcsm;
	}
	public void setYhzcsm(String yhzcsm) {
		Yhzcsm = yhzcsm;
	}
	public Double getDj() {
		return Dj;
	}
	public void setDj(Double dj) {
		Dj = dj;
	}
	public Double getSl() {
		return Sl;
	}
	public void setSl(Double sl) {
		Sl = sl;
	}
	public Double getJe() {
		return Je;
	}
	public void setJe(Double je) {
		Je = je;
	}
	public Double getSlv() {
		return Slv;
	}
	public void setSlv(Double slv) {
		Slv = slv;
	}
	public Double getKce() {
		return Kce;
	}
	public void setKce(Double kce) {
		Kce = kce;
	}
	@Override
	public String toString() {
		return "Goods [Spmc=" + Spmc + ", Ggxh=" + Ggxh + ", Jldw=" + Jldw + ", Spbm=" + Spbm + ", Qyspbm=" + Qyspbm
				+ ", Syyhzcbz=" + Syyhzcbz + ", Lslbz=" + Lslbz + ", Yhzcsm=" + Yhzcsm + ", Dj=" + Dj + ", Sl=" + Sl
				+ ", Je=" + Je + ", Slv=" + Slv + ", Kce=" + Kce + "]";
	}
	
	


}
