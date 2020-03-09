package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class DDI extends hl7.model.V2_7.datastructure.DDI{
	public DDI(){
		super();
	}
	
	public static DDI CLASS;
	static{
		CLASS = new DDI();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
