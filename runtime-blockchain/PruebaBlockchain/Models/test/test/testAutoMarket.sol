import "truffle/Assert.sol";
import "truffle/DeployedAddresses.sol";
import "../contracts/Automarket.sol";	


contract TestAutoMarket {
  function testConsultarVehiculo() {
    AutoMarket meta = AutoMarket(DeployedAddresses.AutoMarket());	
    
    Assert.equal(meta.ConsultarVehiculo("ABC123"),"Citroen", "El carro existe");
  }
}