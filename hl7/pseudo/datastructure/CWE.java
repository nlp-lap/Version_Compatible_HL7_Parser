package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CWE extends hl7.model.V2_7.datastructure.CWE{
	public CWE(){
		super();
	}
	
	public static CWE CLASS;
	static{
		CLASS = new CWE();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
