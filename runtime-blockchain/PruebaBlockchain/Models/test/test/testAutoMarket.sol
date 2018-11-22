import "truffle/Assert.sol";
import "truffle/DeployedAddresses.sol";
import "../contracts/Automarket.sol";	


contract TestAutoMarket {
  function testConsultarVehiculo() {
    AutoMarket meta = AutoMarket(DeployedAddresses.AutoMarket());	
    
    Assert.equal(meta.ConsultarVehiculo(0x0fC8Fff9aA5077B938A8FEfFF76bA39A3F5f4f70),"Citroen", "El carro existe");
  }
}