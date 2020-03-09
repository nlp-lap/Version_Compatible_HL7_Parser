package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CP extends hl7.model.V2_7.datastructure.CP{
	public CP(){
		super();
	}
	
	public static CP CLASS;
	static{
		CLASS = new CP();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
