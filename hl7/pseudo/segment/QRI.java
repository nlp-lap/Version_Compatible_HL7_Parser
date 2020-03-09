package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class QRI extends hl7.model.V2_7.segment.QRI{
	public QRI(){
		super();
	}

	public static QRI CLASS;
	static{
		CLASS = new QRI();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

