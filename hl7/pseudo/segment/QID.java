package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class QID extends hl7.model.V2_7.segment.QID{
	public QID(){
		super();
	}

	public static QID CLASS;
	static{
		CLASS = new QID();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

