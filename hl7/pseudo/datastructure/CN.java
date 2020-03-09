package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CN extends hl7.model.V2_4.datastructure.CN{
	public CN(){
		super();
	}
	
	public static CN CLASS;
	static{
		CLASS = new CN();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
