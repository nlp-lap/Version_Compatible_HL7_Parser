package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class PPN extends hl7.model.V2_7.datastructure.PPN{
	public PPN(){
		super();
	}
	
	public static PPN CLASS;
	static{
		CLASS = new PPN();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
