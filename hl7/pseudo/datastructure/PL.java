package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class PL extends hl7.model.V2_7.datastructure.PL{
	public PL(){
		super();
	}
	
	public static PL CLASS;
	static{
		CLASS = new PL();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
