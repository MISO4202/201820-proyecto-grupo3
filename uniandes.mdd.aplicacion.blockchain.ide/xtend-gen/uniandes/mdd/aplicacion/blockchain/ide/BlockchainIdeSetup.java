/**
 * generated by Xtext 2.12.0
 */
package uniandes.mdd.aplicacion.blockchain.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uniandes.mdd.aplicacion.blockchain.BlockchainRuntimeModule;
import uniandes.mdd.aplicacion.blockchain.BlockchainStandaloneSetup;
import uniandes.mdd.aplicacion.blockchain.ide.BlockchainIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class BlockchainIdeSetup extends BlockchainStandaloneSetup {
  @Override
  public Injector createInjector() {
    BlockchainRuntimeModule _blockchainRuntimeModule = new BlockchainRuntimeModule();
    BlockchainIdeModule _blockchainIdeModule = new BlockchainIdeModule();
    return Guice.createInjector(Modules2.mixin(_blockchainRuntimeModule, _blockchainIdeModule));
  }
}
