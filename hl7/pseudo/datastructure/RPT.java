package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class RPT extends hl7.model.V2_7.datastructure.RPT{
	public RPT(){
		super();
	}
	
	public static RPT CLASS;
	static{
		CLASS = new RPT();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
