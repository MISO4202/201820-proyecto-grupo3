/**
 * generated by Xtext 2.12.0
 */
package uniandes.mdd.aplicacion.blockchain;

import uniandes.mdd.aplicacion.blockchain.BlockchainStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class BlockchainStandaloneSetup extends BlockchainStandaloneSetupGenerated {
  public static void doSetup() {
    new BlockchainStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
