package test1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import entity.Goods;
import entity.Receipt;

/**
 * �����ַ�������
 * 
 * @author uid
 *
 */
public class readTxt {

	public static List<Receipt> listR;
	public static void main(String[] args) throws IOException {
	
//		FileInputStream fis = new FileInputStream("."+File.separator+"src"+File.separator+"day08"+File.separator+"BufferedReander_readLine.java");
		FileInputStream fis = new FileInputStream("��Ʊ����.txt");

		InputStreamReader isr = new InputStreamReader(fis);
		
		BufferedReader br = new BufferedReader(isr);
		/*
		 * String readLine()
		 * ���ж�ȡ�ַ�������������ȡ���ɸ��ַ���
		 * ֱ����ȡ�����з�Ϊֹ��Ȼ�󽫻��з�֮ǰ�������ַ����һ���ַ������أ�
		 * ������ΪֵNULLʱ����ʾ��ȡ���ļ�ĩβ��
		 */
		String line = null;
		Receipt r= null;
		Goods g = null;
		new ArrayList<Receipt>();
		List<Goods> listG = null;
		while((line = br.readLine())!=null){
			String[] str1 = line.split("~~"); //��Ʊͷ
			r = new Receipt();
			r.setDjh(Integer.valueOf(str1[1]));
			r.setSphs(Integer.valueOf(str1[0]));
			r.setGfmc(str1[2]);
			r.setGfsh(str1[3]);
			r.setGfdzdh(str1[4]);
			r.setGfyhzh(str1[5]);
			r.setBz(str1[6]);
			r.setFhr(str1[7]);
			r.setSkr(str1[8]);
			
			for(int i=0;i<Integer.valueOf(str1[1]);i++){
				listG = new ArrayList<Goods>();
				line=br.readLine();
				String[] str2 = line.split("~~"); //��Ʒ
				g = new Goods();
				g.setSpmc(str2[0]);
				g.setJldw(str2[1]);
				g.setGgxh(str2[2]);
				g.setSl(Double.valueOf(str2[3]));
				g.setJe(Double.valueOf(str2[4]));
				g.setSlv(Double.valueOf(str2[5]));
				g.setDj(Double.valueOf(str2[8]));
				
				listG.add(g);
				
				
			}
			r.setListGoods(listG);
			for(Goods goods:r.getListGoods()){
				System.out.println(goods);
			}
			
			//listR.add(r);
		}
		br.close();
		
		
	}

	
	
	
	
}
