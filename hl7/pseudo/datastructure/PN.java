package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class PN extends hl7.model.V2_4.datastructure.PN{
	public PN(){
		super();
	}
	
	public static PN CLASS;
	static{
		CLASS = new PN();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
