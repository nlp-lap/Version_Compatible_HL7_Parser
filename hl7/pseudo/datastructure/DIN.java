package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class DIN extends hl7.model.V2_7.datastructure.DIN{
	public DIN(){
		super();
	}
	
	public static DIN CLASS;
	static{
		CLASS = new DIN();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
