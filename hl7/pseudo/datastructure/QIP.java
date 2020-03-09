package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class QIP extends hl7.model.V2_7.datastructure.QIP{
	public QIP(){
		super();
	}
	
	public static QIP CLASS;
	static{
		CLASS = new QIP();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
