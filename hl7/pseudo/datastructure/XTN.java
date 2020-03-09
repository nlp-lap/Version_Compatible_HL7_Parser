package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class XTN extends hl7.model.V2_7.datastructure.XTN{
	public XTN(){
		super();
	}
	
	public static XTN CLASS;
	static{
		CLASS = new XTN();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
