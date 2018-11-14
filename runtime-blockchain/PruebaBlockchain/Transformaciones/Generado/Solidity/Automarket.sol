pragma solidity ^0.4.0;

contract AutoMarket {
		struct Vehiculo {
		    string Marca			 
		    string Modelo			 
		    string Linea			 
		    uint Cilindraje			 
		    string Placa			 
		    uint Precio			 
		    bool Nuevo			 
		    string Comentarios			 
		}
		mapping (MapaVehiculos => Vehiculo) public Vehiculos;
		mapping (MapaVehiculos => Vehiculo) public VehiculosCaros;
		mapping (MapaVehiculos => Vehiculo) public VehiculosBaratos;
		function ConsultarVehiculo (string Placa){
			
		}
		function CalcularCostos (int PrecioVehiculo,int ImpuestoVehiculo,int ValorTraspaso,int ComisionRunt){
			
		}
		function CrearVehiculo (string Marca,string Modelo,string Linea,string Placa,int Cilindraje,int Precio){
			
		}
		function ActualizarVehiculo (string Placa,int Cilindraje,int Precio){
			
		}
 
}
	
