package entity;

import java.io.Serializable;
import java.util.List;

/**
 * ��Ʊ��
 * @author swj
 *
 */
public class Receipt implements Serializable {
	/**��Ʒ����*/
	private Integer Sphs;
	/**���ݺţ�20�ֽڣ�*/
	private Integer Djh;
	/**�������ƣ�100�ֽڣ�*/
	private String Gfmc;
	/**����˰��*/
	private String Gfsh;
	/**���������˺ţ�100�ֽڣ�*/
	private String Gfyhzh;
	/**������ַ�绰��100�ֽڣ�*/
	private String Gfdzdh;
	/**��ע��240�ֽڣ�*/
	private String Bz;
	/**�����ˣ�8�ֽڣ�*/
	private String Fhr;
	/**�տ��ˣ�8�ֽڣ�*/
	private String Skr;
	/**��Ʒ����汾��(20�ֽ�)�������*/
	private String Spbmbbh;
	/**��˰��־0������˰˰�ʣ�1����˰˰�ʣ�2�����˰;������������ԭ����ʯ�ͣ�5%˰�ʡ�1.5%˰��Ϊ1�����˰Ϊ2������Ϊ0��*/
	private String Hsbz;
	/**��Ʒ����*/
	private List<Goods> listGoods;
	
	
	public Integer getSphs() {
		return Sphs;
	}
	public void setSphs(Integer sphs) {
		Sphs = sphs;
	}
	public Integer getDjh() {
		return Djh;
	}
	public void setDjh(Integer djh) {
		Djh = djh;
	}
	public String getGfmc() {
		return Gfmc;
	}
	public void setGfmc(String gfmc) {
		Gfmc = gfmc;
	}
	public String getGfsh() {
		return Gfsh;
	}
	public void setGfsh(String gfsh) {
		Gfsh = gfsh;
	}
	public String getGfyhzh() {
		return Gfyhzh;
	}
	public void setGfyhzh(String gfyhzh) {
		Gfyhzh = gfyhzh;
	}
	public String getGfdzdh() {
		return Gfdzdh;
	}
	public void setGfdzdh(String gfdzdh) {
		Gfdzdh = gfdzdh;
	}
	public String getBz() {
		return Bz;
	}
	public void setBz(String bz) {
		Bz = bz;
	}
	public String getFhr() {
		return Fhr;
	}
	public void setFhr(String fhr) {
		Fhr = fhr;
	}
	public String getSkr() {
		return Skr;
	}
	public void setSkr(String skr) {
		Skr = skr;
	}
	public String getSpbmbbh() {
		return Spbmbbh;
	}
	public void setSpbmbbh(String spbmbbh) {
		Spbmbbh = spbmbbh;
	}
	public String getHsbz() {
		return Hsbz;
	}
	public void setHsbz(String hsbz) {
		Hsbz = hsbz;
	}
	public List<Goods> getListGoods() {
		return listGoods;
	}
	public void setListGoods(List<Goods> listGoods) {
		this.listGoods = listGoods;
	}
	@Override
	public String toString() {
		return "Receipt [Sphs=" + Sphs + ", Djh=" + Djh + ", Gfmc=" + Gfmc + ", Gfsh=" + Gfsh + ", Gfyhzh=" + Gfyhzh
				+ ", Gfdzdh=" + Gfdzdh + ", Bz=" + Bz + ", Fhr=" + Fhr + ", Skr=" + Skr + ", Spbmbbh=" + Spbmbbh
				+ ", Hsbz=" + Hsbz + ", listGoods=" + listGoods + "]";
	}
	
	
	
}
