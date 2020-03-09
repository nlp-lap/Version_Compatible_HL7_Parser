package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class NDL extends hl7.model.V2_7.datastructure.NDL{
	public NDL(){
		super();
	}
	
	public static NDL CLASS;
	static{
		CLASS = new NDL();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
