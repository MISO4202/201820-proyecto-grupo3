pragma solidity ^0.4.0;

contract AutoMarket {
		struct Vehiculo { 
			string Marca; 
			string Modelo; 
			string Linea; 
			int Cilindraje; 
			address Placa; 
			int Precio; 
			bool Nuevo; 
			string Comentarios;		
		}
		mapping (address => Vehiculo) public Vehiculos;
		mapping (address => Vehiculo) public VehiculosCaros;
		mapping (address => Vehiculo) public VehiculosBaratos;
		function ConsultarVehiculo (address Placa) public returns(string){
			return Vehiculos[Placa].Marca;	
		}
		function CalcularCostos (int PrecioVehiculo,int ImpuestoVehiculo,int ValorTraspaso,int ComisionRunt) public returns(int){
			return (((PrecioVehiculo + (PrecioVehiculo * ImpuestoVehiculo)) + ValorTraspaso) + ComisionRunt);	
		}
		function CrearVehiculo (string Marca,string Modelo,string Linea,address Placa,int Cilindraje,int Precio) public {
			 Vehiculo memory vehiculo;
			 vehiculo.Marca = Marca ; 
			 vehiculo.Modelo = Modelo ; 
			 vehiculo.Linea = Linea ; 
			 vehiculo.Cilindraje = Cilindraje ; 
			 vehiculo.Placa = Placa ; 
			 vehiculo.Precio = Precio ; 
			 vehiculo.Nuevo = true ; 
			 vehiculo.Comentarios =  "SinComentarios" ; 
			  Vehiculos[Placa] = vehiculo ; 
			if((Precio >= 100000000)){
				 VehiculosCaros[Placa] = vehiculo ;
			}else{	
				 VehiculosBaratos[Placa] = vehiculo ;
			}	 	
		}
		function ActualizarVehiculo (address Placa,int Cilindraje,int Precio) public {
			 Vehiculo memory vehiculo;
			 vehiculo.Cilindraje = Cilindraje ; 
			 vehiculo.Placa = Placa ; 
			 vehiculo.Precio = Precio ; 
			 vehiculo.Nuevo = true ; 
			  Vehiculos[Placa] = vehiculo ; 
		}
 
}

