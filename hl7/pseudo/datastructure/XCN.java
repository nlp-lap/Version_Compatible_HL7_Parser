package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class XCN extends hl7.model.V2_7.datastructure.XCN{
	public XCN(){
		super();
	}
	
	public static XCN CLASS;
	static{
		CLASS = new XCN();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
