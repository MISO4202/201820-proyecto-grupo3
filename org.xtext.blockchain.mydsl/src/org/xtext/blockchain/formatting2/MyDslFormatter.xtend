/*
 * generated by Xtext 2.12.0
 */
package org.xtext.blockchain.formatting2

import blockchain.Aplicacion
import blockchain.Entidad
import blockchain.Estado
import blockchain.Operacion
import blockchain.SmartContract
import blockchain.TipoDato
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.blockchain.services.MyDslGrammarAccess

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(Aplicacion aplicacion, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (SmartContract smartContract : aplicacion.getSmartcontract()) {
			smartContract.format;
		}
		for (TipoDato tipoDato : aplicacion.getTipodato()) {
			tipoDato.format;
		}
	}

	def dispatch void format(SmartContract smartContract, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Entidad entidad : smartContract.getEntidades()) {
			entidad.format;
		}
		for (Estado estado : smartContract.getEstado()) {
			estado.format;
		}
		for (Operacion operacion : smartContract.getOperaciones()) {
			operacion.format;
		}
	}
	
	// TODO: implement for Entidad, Operacion, Condicional
}
