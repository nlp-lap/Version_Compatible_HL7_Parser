package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CCP extends hl7.model.V2_7.datastructure.CCP{
	public CCP(){
		super();
	}
	
	public static CCP CLASS;
	static{
		CLASS = new CCP();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
