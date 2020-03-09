package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class JCC extends hl7.model.V2_7.datastructure.JCC{
	public JCC(){
		super();
	}
	
	public static JCC CLASS;
	static{
		CLASS = new JCC();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
