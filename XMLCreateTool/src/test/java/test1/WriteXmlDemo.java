package test1;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import entity.Receipt;

/**
 * ʹ��DOM����XML�ĵ�
 * @author uid
 *
 */
public class WriteXmlDemo {
	public static void main(String[] args) {
		
		/*
		 * ʹ��DOM����XML�ĵ��Ĵ��²���
		 * 1������Document����
		 * 2����Document��������Ӹ�Ԫ��
		 * 3������XML�ĵ�Ӧ�еĽṹ�Ӹ�Ԫ�ؿ�ʼ�������Ԫ��
		 * 4������XmlWriter
		 * 5��ͨ��XmlWriter��Document����д�����γ�XML�ĵ�
		 * 6���ر�XmlWriter
		 */
		
		try {
			//1
			Document doc = DocumentHelper.createDocument();
			
			/*
			 * 2
			 * Document�ṩ��Ӹ�Ԫ�صķ���
			 * Element addElement(String name)
			 * ���ָ�����ֵĸ�Ԫ�ء���������Element��ʽ���أ��Ա�����Ը�Ԫ�ز�����
			 * ��Ҫע�⣬�÷���ֻ�ܵ���һ�Σ���Ϊһ���ĵ���ֻ����һ����Ԫ�ء�
			 */
			Element kp = doc.addElement("Kp");
			
			Element version = kp.addElement("Version");
			version.addText("2.0");
			Element fpxx = kp.addElement("Fpxx");
			
			Element zsl = fpxx.addElement("Zsl");
			zsl.addText(readTxt.listR.size()+"");
			Element fpsj = fpxx.addElement("Fpsj");
			for(Receipt r:readTxt.listR){
				Element fp = fpsj.addElement("Fp");
				Element djh = fpsj.addElement("Djh");
				djh.addText(r.getDjh()+"");
				Element gfmc =fpsj.addElement("Gfmc");
				gfmc.addText(r.getGfmc()+"");
				Element gfsh = fpsj.addElement("Gfsh");
				gfsh.addText(r.getGfsh()+"");
				Element gfyhzh = fpsj.addElement("Gfyhzh");
				gfyhzh.addText(r.getGfyhzh()+"");
				Element bz = fpsj.addElement("Bz");
				bz.addText(r.getBz()+"");
				Element fhr = fpsj.addElement("Fhr");
				fhr.addText(r.getFhr()+"");
				Element skr = fpsj.addElement("Skr");
				skr.addText(r.getSkr()+"");
				Element spbmbbh = fpsj.addElement("Spbmbbh");
				spbmbbh.addText(r.getSpbmbbh()+"");
				Element hsbz = fpsj.addElement("Hsbz");
				hsbz.addText(r.getHsbz()+"");
			}
			
			
			
			//4
			FileOutputStream fos = new FileOutputStream("myemp.xml");
			XMLWriter writer = new XMLWriter(fos,OutputFormat.createPrettyPrint());
			 
		
			
			//5
			writer.write(doc);
			
			System.out.println("д����ϣ�");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
