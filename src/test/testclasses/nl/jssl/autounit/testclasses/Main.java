package nl.jssl.autounit.testclasses;

import nl.jssl.autounit.JUnitTestCreator;

/**
 * 
* @ClassName: Main
* @Description:  �����Զ����ɵ�Ԫ����
* @author yangrenjiang
* @date 2017��2��18�� ����7:52:46
*
 */
public class Main {
	public static void main(String[] args) {
		JUnitTestCreator<BooleanArguments> jtc = new JUnitTestCreator<BooleanArguments>(BooleanArguments.class);
		jtc.create();
		
		JUnitTestCreator<ComplexClazz> jtc2 = new JUnitTestCreator<ComplexClazz>(ComplexClazz.class);
		jtc2.create();
	}
}
