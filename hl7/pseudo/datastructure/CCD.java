package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CCD extends hl7.model.V2_7.datastructure.CCD{
	public CCD(){
		super();
	}
	
	public static CCD CLASS;
	static{
		CLASS = new CCD();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
