package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class ERL extends hl7.model.V2_7.datastructure.ERL{
	public ERL(){
		super();
	}
	
	public static ERL CLASS;
	static{
		CLASS = new ERL();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
