/*
 * generated by Xtext 2.12.0
 */
package uniandes.mdd.aplicacion.blockchain.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import uniandes.mdd.aplicacion.blockchain.ui.internal.BlockchainActivator;

public class BlockchainUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BlockchainActivator.getInstance().getInjector("uniandes.mdd.aplicacion.blockchain.Blockchain");
	}

}
