pragma solidity ^0.4.0;
import "remix_tests.sol";
import "./InventarioPerros.sol";


contract TestPerrera {
	function testConsultarPerro (){
		Perrera smartContract = new Perrera();
		
		smartContract.ConsultarPerro( 0x0fC8Fff9aA5077B938A8FEfFF76bA39A3F5f4f70);
		
		Assert.ok(true,"true");
	}
	function testCrearPerro (){
		Perrera smartContract = new Perrera();
		
		smartContract.CrearPerro( "Test", 0x0fC8Fff9aA5077B938A8FEfFF76bA39A3F5f4f70, 2650, 2650);
		
		Assert.ok(true,"true");
	}
	function testActualizarPerro (){
		Perrera smartContract = new Perrera();
		
		smartContract.ActualizarPerro( 0x0fC8Fff9aA5077B938A8FEfFF76bA39A3F5f4f70, 2650, 2650);
		
		Assert.ok(true,"true");
	}
}
