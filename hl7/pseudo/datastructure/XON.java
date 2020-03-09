package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class XON extends hl7.model.V2_7.datastructure.XON{
	public XON(){
		super();
	}
	
	public static XON CLASS;
	static{
		CLASS = new XON();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
