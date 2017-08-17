package entity;

import java.io.Serializable;
import java.util.List;

/**
 * 发票类
 * @author swj
 *
 */
public class Receipt implements Serializable {
	/**商品行数*/
	private Integer Sphs;
	/**单据号（20字节）*/
	private Integer Djh;
	/**购方名称（100字节）*/
	private String Gfmc;
	/**购方税号*/
	private String Gfsh;
	/**购方银行账号（100字节）*/
	private String Gfyhzh;
	/**购方地址电话（100字节）*/
	private String Gfdzdh;
	/**备注（240字节）*/
	private String Bz;
	/**复核人（8字节）*/
	private String Fhr;
	/**收款人（8字节）*/
	private String Skr;
	/**商品编码版本号(20字节)（必输项）*/
	private String Spbmbbh;
	/**含税标志0：不含税税率，1：含税税率，2：差额税;中外合作油气田（原海洋石油）5%税率、1.5%税率为1，差额税为2，其他为0；*/
	private String Hsbz;
	/**商品集合*/
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
