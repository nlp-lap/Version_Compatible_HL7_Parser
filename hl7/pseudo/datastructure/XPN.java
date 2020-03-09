package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class XPN extends hl7.model.V2_7.datastructure.XPN{
	public XPN(){
		super();
	}
	
	public static XPN CLASS;
	static{
		CLASS = new XPN();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
