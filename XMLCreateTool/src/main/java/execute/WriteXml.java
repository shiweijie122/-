package execute;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import entity.Goods;
import entity.Receipt;

/**
 * 本类用于写出特定格式的XML文档
 * 
 * @author Only
 */
public class WriteXml {

	public static String outPath;
	
	public void write() {
		Document doc = DocumentHelper.createDocument();
		
		Element kp = doc.addElement("Kp");

		Element version = kp.addElement("Version");
		version.addText("2.0");
		Element fpxx = kp.addElement("Fpxx");

		Element zsl = fpxx.addElement("Zsl");
		zsl.addText(ReadTxt.listR.size() + "");
		Element fpsj = fpxx.addElement("Fpsj");

		for (Receipt r : ReadTxt.listR) {
			Element fp = fpsj.addElement("Fp");
			Element djh = fp.addElement("Djh");
			djh.addText(r.getDjh() + "");
			Element gfmc = fp.addElement("Gfmc");
			if(r.getGfmc()==null)r.setGfmc("");
			gfmc.addText(r.getGfmc() + "");
			Element gfsh = fp.addElement("Gfsh");
			if(r.getGfsh()==null)r.setGfsh("");
			gfsh.addText(r.getGfsh() + "");
			Element gfyhzh = fp.addElement("Gfyhzh");
			if(r.getGfyhzh()==null)r.setGfyhzh("");
			gfyhzh.addText(r.getGfyhzh() + "");
			Element bz = fp.addElement("Bz");
			if(r.getBz()==null)r.setBz("");
			bz.addText(r.getBz() + "");
			Element fhr = fp.addElement("Fhr");
			if(r.getFhr()==null)r.setFhr("");
			fhr.addText(r.getFhr() + "");
			Element skr = fp.addElement("Skr");
			if(r.getSkr()==null)r.setSkr("");
			skr.addText(r.getSkr() + "");
			Element spbmbbh = fp.addElement("Spbmbbh");
			if(r.getSpbmbbh()==null)r.setSpbmbbh("");
			spbmbbh.addText(r.getSpbmbbh() + "");
			Element hsbz = fp.addElement("Hsbz");
			if(r.getHsbz()==null)r.setHsbz("");
			hsbz.addText(r.getHsbz() + "");

			Element spxx = fp.addElement("Spxx");
			int num = 0;
			List<Goods> listG = r.getListGoods();
			for (Goods g : listG) {
				num++;
				//System.out.println(num);
				Element sph = spxx.addElement("Sph");
				Element xh = sph.addElement("Xh");
				xh.addText(num + "");
				Element spmc = sph.addElement("Spmc");
				if(g.getSpmc()==null)g.setSpmc("");
				spmc.addText(g.getSpmc() + "");
				Element ggxh = sph.addElement("Ggxh");
				if(g.getGgxh()==null)g.setGgxh("");
				ggxh.addText(g.getGgxh() + "");
				Element jldw = sph.addElement("Jldw");
				if(g.getJldw()==null)g.setJldw("");
				jldw.addText(g.getJldw() + "");
				Element spbm = sph.addElement("Spbm");
				if(g.getSpbm()==null)g.setSpbm("");
				spbm.addText(g.getSpbm() + "");
				Element qyspbm = sph.addElement("Qyspbm");
				if(g.getQyspbm()==null)g.setQyspbm("");
				qyspbm.addText(g.getQyspbm() + "");
				Element syyhzcbz = sph.addElement("Syyhzcbz");
				if(g.getSyyhzcbz()==null)g.setSyyhzcbz("");
				syyhzcbz.addText(g.getSyyhzcbz() + "");
				Element yhzcsm = sph.addElement("Yhzcsm");
				if(g.getYhzcsm()==null)g.setYhzcsm("");
				yhzcsm.addText(g.getYhzcsm() + "");
				Element dj = sph.addElement("Dj");
				if(g.getDj()==null)g.setDj(0.0);
				dj.addText(g.getDj() + "");
				Element sl = sph.addElement("Sl");
				if(g.getSl()==null)g.setSl(0.0);
				sl.addText(g.getSl() + "");
				Element je = sph.addElement("Je");
				if(g.getJe()==null)g.setJe(0.0);
				je.addText(g.getJe() + "");
				Element slv = sph.addElement("Slv");
				if(g.getSlv()==null)g.setSlv(0.0);
				slv.addText(g.getSlv() + "");
				Element kce = sph.addElement("Kce");
				if(g.getKce()==null)g.setKce(0.0);
				kce.addText(g.getKce() + "");
			}
		}

		FileOutputStream fos = null;
		XMLWriter writer = null;
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy_MM_dd_HHmmss");
		try {
			fos = new FileOutputStream(outPath+"\\"+"XML_"+fmt.format(new Date())+".xml");
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding("GBK");
			writer = new XMLWriter(fos, format);
			writer.write(doc);
			//System.out.println("完毕");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
