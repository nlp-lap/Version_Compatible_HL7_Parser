package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class XAD extends hl7.model.V2_7.datastructure.XAD{
	public XAD(){
		super();
	}
	
	public static XAD CLASS;
	static{
		CLASS = new XAD();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
