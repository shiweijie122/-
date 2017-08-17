package entity;

import java.io.Serializable;

/**
 * 商品类
 * @author swj
 *
 */
public class Goods implements Serializable {
	/**商品名称，金额为负数时此行是折扣行，折扣行的商品名称应与上一行的商品名称一致（100字节）*/
	private String Spmc;
	/**规格型号（40字节）*/
	private String Ggxh;
	/**计量单位（32字节）*/
	private String Jldw;
	/**商品编码(19字节)（必输项）*/
	private String Spbm;
	/**企业商品编码（20字节）*/
	private String Qyspbm;
	/**是否使用优惠政策标识0：不使用，1：使用（1字节）*/
	private String Syyhzcbz;
	/**零税率标识空：非零税率，0：出口退税，1：免税，2：不征收，3普通零税率（1字节）*/
	private String Lslbz;
	/**优惠政策说明（50字节）*/
	private String Yhzcsm;
	/**单价（中外合作油气田（原海洋石油）5%税率，单价为含税单价）*/
	private Double Dj; 
	/**数量*/
	private Double Sl;
	/**金额，当金额为负数时为折扣行*/
	private Double Je;
	/**税率*/
	private Double Slv;
	/**扣除额，用于差额税计算*/
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
