package nl.jssl.autounit.inputs.objects;

import nl.jssl.autounit.inputs.ArgumentsForSingleParameter;
import nl.jssl.autounit.inputs.primitives.ArgumentFactory;
import nl.jssl.autounit.util.ConstantpoolReader;

/**
 * Creates Strings as arguments for a method call. Uses bytecode analysis to
 * scan the class-under-test for "interesting" strings and adds them to the
 * argument set.
 * 
 * Also adds null to check for NPE. //is this feasible?
 */
public class StringArgumentFactory implements ArgumentFactory<String> {

	@Override
	public ArgumentsForSingleParameter<String> getInputs(Class<?> testTarget) {
		ArgumentsForSingleParameter<String> inputs = new ArgumentsForSingleParameter<String>();
		inputs.add(null);
		inputs.add("some");
		inputs.addAll(new ConstantpoolReader(testTarget).scanStrings());
		return inputs;
	}

}
