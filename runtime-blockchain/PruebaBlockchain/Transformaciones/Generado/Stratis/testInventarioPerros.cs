using Microsoft.VisualStudio.TestTools.UnitTesting;
using Stratis.SmartContracts;
using System;
using System.Collections.Generic;

namespace TestInventarioPerros {

	[TestClass]
	public class TestPerrera {
	
		[TestInitialize]
	    public void Initialize()
	    {
	    }
	    
		[TestMethod]
		public void TestConsultarPerro (){
			Perrera smartContract = new Perrera();
			
			smartContract.ConsultarPerro( default(address));
			smartContract.ConsultarPerro( new blockchain.impl.PrimitivoImpl@1720782 (name: address) (tipo: address)());
			
			Assert.IsTrue(true);
		}
		[TestMethod]
		public void TestCrearPerro (){
			Perrera smartContract = new Perrera();
			
			smartContract.CrearPerro( default(string), default(address), default(int), default(int));
			smartContract.CrearPerro( "Test", new blockchain.impl.PrimitivoImpl@1720782 (name: address) (tipo: address)(), 0, 0);
			
			Assert.IsTrue(true);
		}
		[TestMethod]
		public void TestActualizarPerro (){
			Perrera smartContract = new Perrera();
			
			smartContract.ActualizarPerro( default(address), default(int), default(int));
			smartContract.ActualizarPerro( new blockchain.impl.PrimitivoImpl@1720782 (name: address) (tipo: address)(), 0, 0);
			
			Assert.IsTrue(true);
		}
	}
}
