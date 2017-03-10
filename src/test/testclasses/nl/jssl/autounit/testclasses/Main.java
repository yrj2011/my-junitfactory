package nl.jssl.autounit.testclasses;

import nl.jssl.autounit.JUnitTestCreator;

/**
 * 
* @ClassName: Main
* @Description:  测试自动生成单元测试
* @author yangrenjiang
* @date 2017年2月18日 下午7:52:46
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
