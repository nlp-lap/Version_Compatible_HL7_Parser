package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class EIP extends hl7.model.V2_7.datastructure.EIP{
	public EIP(){
		super();
	}
	
	public static EIP CLASS;
	static{
		CLASS = new EIP();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
