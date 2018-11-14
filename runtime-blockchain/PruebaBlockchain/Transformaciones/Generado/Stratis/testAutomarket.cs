using Microsoft.VisualStudio.TestTools.UnitTesting;
using Stratis.SmartContracts;
using System;
using System.Collections.Generic;

namespace TestAutomarket {

	[TestClass]
	public class TestAutoMarket {
	
		[TestInitialize]
	    public void Initialize()
	    {
	    }
	    
		[TestMethod]
		public void TestConsultarVehiculo (){
			AutoMarket smartContract = new AutoMarket();
			
			smartContract.ConsultarVehiculo( default(string));
			smartContract.ConsultarVehiculo( "Test");
			
			Assert.IsTrue(true);
		}
		[TestMethod]
		public void TestCalcularCostos (){
			AutoMarket smartContract = new AutoMarket();
			
			smartContract.CalcularCostos( default(int), default(int), default(int), default(int));
			smartContract.CalcularCostos( 0, 0, 0, 0);
			
			Assert.IsTrue(true);
		}
		[TestMethod]
		public void TestCrearVehiculo (){
			AutoMarket smartContract = new AutoMarket();
			
			smartContract.CrearVehiculo( default(string), default(string), default(string), default(string), default(int), default(int));
			smartContract.CrearVehiculo( "Test", "Test", "Test", "Test", 0, 0);
			
			Assert.IsTrue(true);
		}
		[TestMethod]
		public void TestActualizarVehiculo (){
			AutoMarket smartContract = new AutoMarket();
			
			smartContract.ActualizarVehiculo( default(string), default(int), default(int));
			smartContract.ActualizarVehiculo( "Test", 0, 0);
			
			Assert.IsTrue(true);
		}
	}
}
