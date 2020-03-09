package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class PRL extends hl7.model.V2_7.datastructure.PRL{
	public PRL(){
		super();
	}
	
	public static PRL CLASS;
	static{
		CLASS = new PRL();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
