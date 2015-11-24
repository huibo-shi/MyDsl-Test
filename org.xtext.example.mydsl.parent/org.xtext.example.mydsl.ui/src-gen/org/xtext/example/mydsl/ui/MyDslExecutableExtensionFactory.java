/*
 * generated by Xtext 2.9.0.rc2
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.mydsl.ui.internal.MydslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MydslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MydslActivator.getInstance().getInjector(MydslActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSL);
	}
	
}