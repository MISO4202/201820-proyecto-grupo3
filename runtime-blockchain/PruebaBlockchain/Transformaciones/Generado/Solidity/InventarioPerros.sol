pragma solidity ^0.4.0;


contract Perrera {
		struct Perro { 
			string Raza; 
			address Placa; 
			string Nombre; 
			int Edad; 
			int Precio; 
			bool Nuevo; 
			string Comentarios;		
		}
		mapping (string => string) public Perros;
		mapping (string => string) public PerrosJovenes;
		mapping (string => string) public PerrosViejos;
		function ConsultarPerro (address Placa) public returns(Perro){
			return Perros[Placa].Nombre;	
		}
		function CrearPerro (string Raza,address Placa,int Edad,int Precio) public {
			 Perro memory perro;
			 perro.Raza = Raza ; 
			 perro.Placa = Placa ; 
			 perro.Edad = Edad ; 
			 perro.Precio = Precio ; 
			 perro.Nuevo = true ; 
			 perro.Comentarios =  "SinComentarios" ; 
			if((perro.Nuevo == true)){
				 PerrosJovenes[Placa] = perro ;
			}else{	
				 PerrosViejos[Placa] = perro ;
			}	 	
			  Perros[Placa] = perro ; 
		}
		function ActualizarPerro (address Placa,int Edad,int Precio) public {
			 Perro memory perro;
			 perro = Perros[Placa] ; 
			 perro.Edad = Edad ; 
			 perro.Precio = Precio ; 
			 perro.Nuevo = true ; 
		}
 
}

