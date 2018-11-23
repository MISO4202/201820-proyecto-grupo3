using Stratis.SmartContracts;
using System.Linq;
using System;


public class Perrera : SmartContract 
{
	public struct Perro {
		public string Raza; 
		public Address Placa; 
		public string Nombre; 
		public int Edad; 
		public int Precio; 
		public bool Nuevo; 
		public string Comentarios; 
	}
	public Perrera (ISmartContractState smartContractState)
    : base(smartContractState)
    {
        
    }
	
    public ISmartContractMapping <string> Perros
    { 
       get 
       {
           return PersistentState.GetStructMapping<string> ("Perros");
       }
    }
    
	
    public ISmartContractMapping <string> PerrosJovenes
    { 
       get 
       {
           return PersistentState.GetStructMapping<string> ("PerrosJovenes");
       }
    }
    
	
    public ISmartContractMapping <string> PerrosViejos
    { 
       get 
       {
           return PersistentState.GetStructMapping<string> ("PerrosViejos");
       }
    }
    
	
	public Perro ConsultarPerro (Address Placa){
			return Perros[Placa].Nombre;	
	}
	
	public void CrearPerro (string Raza,Address Placa,int Edad,int Precio){
			Perro perro = new Perro();
			perro.Raza = Raza; 
			perro.Placa = Placa; 
			perro.Edad = Edad; 
			perro.Precio = Precio; 
			perro.Nuevo = true; 
			perro.Comentarios =  "SinComentarios"; 
			if((perro.Nuevo == true)){
				PerrosJovenes[Placa] = perro;
			}else{	
				PerrosViejos[Placa] = perro;
	
			}	 	
			Perros[Placa] = perro; 
	}
	
	public void ActualizarPerro (Address Placa,int Edad,int Precio){
			Perro perro = new Perro();
			perro = Perros[Placa]; 
			perro.Edad = Edad; 
			perro.Precio = Precio; 
			perro.Nuevo = true; 
	}
 
}
