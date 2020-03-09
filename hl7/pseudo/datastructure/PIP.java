package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class PIP extends hl7.model.V2_7.datastructure.PIP{
	public PIP(){
		super();
	}
	
	public static PIP CLASS;
	static{
		CLASS = new PIP();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
