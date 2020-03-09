package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class TQ extends hl7.model.V2_6.datastructure.TQ{
	public TQ(){
		super();
	}
	
	public static TQ CLASS;
	static{
		CLASS = new TQ();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
