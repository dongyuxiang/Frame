package com.dyx.spring.type;

import lombok.Setter;

import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
@Setter
public class DataType {
	private String specialCharacter1;//�����ַ�ֵ1
	private String specialCharacter2;//�����ַ�ֵ2
	private User innerBean; //javaBean����
	private List<String> list; // list��
	private String[] array; //��������
	private Set<String> set; //set����
	private Map<String, String> map; //Map����
	private Properties props;  //Properties����
	private String emptyValue; //ע����ַ���
	private String nullValue="init null"; //ע��nullֵ
	
	public void printValue(){
		PrintStream out=System.out;
		out.println("�����ַ�1��"+this.specialCharacter1);
		out.println("�����ַ�2��"+this.specialCharacter2);
		out.println("����Bean��"+this.innerBean);
		out.println("List���ԣ�"+this.list);
		out.println("�������ԣ�"+this.array);
		out.println("Set���ԣ�"+this.set);
		out.println("Map���ԣ�"+this.map);
		
		out.println("Properties ���ԣ�"+this.props);
		out.println("ע����ַ�����["+this.emptyValue+"]");
		out.println("ע��nullֵ��"+this.nullValue);
	}
	public  void sort(String[] arrays){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}
