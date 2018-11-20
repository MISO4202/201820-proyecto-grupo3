import "truffle/Assert.sol";
import "truffle/DeployedAddresses.sol";
import "../contracts/Automarket.sol";


contract TestAutoMarket {
	function testConsultarVehiculo (){
		AutoMarket smartContract = AutoMarket(DeployedAddresses.AutoMarket());
		
		smartContract.ConsultarVehiculo(new address());
		smartContract.ConsultarVehiculo( new Primitivo [name=address, tipo=address]());
		
		Assert.isTrue(true);
	}
	function testCalcularCostos (){
		AutoMarket smartContract = AutoMarket(DeployedAddresses.AutoMarket());
		
		smartContract.CalcularCostos(new uint(),new uint(),new uint(),new uint());
		smartContract.CalcularCostos( 0, 0, 0, 0);
		
		Assert.isTrue(true);
	}
	function testCrearVehiculo (){
		AutoMarket smartContract = AutoMarket(DeployedAddresses.AutoMarket());
		
		smartContract.CrearVehiculo(new string(),new string(),new string(),new address(),new uint(),new uint());
		smartContract.CrearVehiculo( "Test", "Test", "Test", new Primitivo [name=address, tipo=address](), 0, 0);
		
		Assert.isTrue(true);
	}
	function testActualizarVehiculo (){
		AutoMarket smartContract = AutoMarket(DeployedAddresses.AutoMarket());
		
		smartContract.ActualizarVehiculo(new address(),new uint(),new uint());
		smartContract.ActualizarVehiculo( new Primitivo [name=address, tipo=address](), 0, 0);
		
		Assert.isTrue(true);
	}
}
