package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class OSP extends hl7.model.V2_7.datastructure.OSP{
	public OSP(){
		super();
	}
	
	public static OSP CLASS;
	static{
		CLASS = new OSP();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
