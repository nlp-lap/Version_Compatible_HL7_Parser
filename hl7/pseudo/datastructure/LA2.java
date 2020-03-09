package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class LA2 extends hl7.model.V2_7.datastructure.LA2{
	public LA2(){
		super();
	}
	
	public static LA2 CLASS;
	static{
		CLASS = new LA2();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
