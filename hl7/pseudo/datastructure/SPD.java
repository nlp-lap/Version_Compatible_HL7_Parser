package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class SPD extends hl7.model.V2_7.datastructure.SPD{
	public SPD(){
		super();
	}
	
	public static SPD CLASS;
	static{
		CLASS = new SPD();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
