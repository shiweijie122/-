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
 * 使用DOM生成XML文档
 * @author uid
 *
 */
public class WriteXmlDemo {
	public static void main(String[] args) {
		
		/*
		 * 使用DOM生成XML文档的大致步骤
		 * 1：创建Document对象
		 * 2：向Document对象中添加根元素
		 * 3：按照XML文档应有的结构从根元素开始逐级添加子元素
		 * 4：创建XmlWriter
		 * 5：通过XmlWriter将Document对象写出来形成XML文档
		 * 6：关闭XmlWriter
		 */
		
		try {
			//1
			Document doc = DocumentHelper.createDocument();
			
			/*
			 * 2
			 * Document提供添加根元素的方法
			 * Element addElement(String name)
			 * 添加指定名字的根元素。并将它以Element形式返回，以便继续对根元素操作。
			 * 需要注意，该方法只能调用一次，因为一个文档中只能有一个跟元素。
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
			
			System.out.println("写出完毕！");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
