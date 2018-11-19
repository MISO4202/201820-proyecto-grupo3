pragma solidity ^0.4.0;

contract AutoMarket {
		struct Vehiculo {
		    string Marca;			 
		    string Modelo;			 
		    string Linea;			 
		    uint Cilindraje;			 
		    string Placa;			 
		    uint Precio;		 
		    bool Nuevo;			 
		    string Comentarios;
		}
		mapping (address => Vehiculo) public Vehiculos;
		mapping (address => Vehiculo) public VehiculosCaros;
		mapping (address => Vehiculo) public VehiculosBaratos;

		function ConsultarVehiculo (string Placa) public returns (string){

			return "Citroen";
		}
		function CalcularCostos (int PrecioVehiculo,int ImpuestoVehiculo,int ValorTraspaso,int ComisionRunt){
			
		}
		function CrearVehiculo (string Marca,string Modelo,string Linea,string Placa,int Cilindraje,int Precio){
			
		}
		function ActualizarVehiculo (string Placa,int Cilindraje,int Precio){
			
		}
 
}
	

