package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class IPC extends hl7.model.V2_7.segment.IPC{
	public IPC(){
		super();
	}

	public static IPC CLASS;
	static{
		CLASS = new IPC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

