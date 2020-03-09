package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class LA1 extends hl7.model.V2_7.datastructure.LA1{
	public LA1(){
		super();
	}
	
	public static LA1 CLASS;
	static{
		CLASS = new LA1();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
