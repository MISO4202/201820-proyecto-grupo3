using Stratis.SmartContracts;
using System.Linq;
using System;


public class Perrera : SmartContract 
{
	public struct Perro {
		public String Raza; 
		public String Placa; 
		public Numerico Edad; 
		public Numerico Precio; 
		public Boolean Nuevo; 
		public String Comentarios; 
		}
		public Inventario(ISmartContractState smartContractState, ulong durationBlocks)
    	: base(smartContractState)
    	{
        
    	}
		public ISmartContractMapping<Perro> Perros
    	{
        	get
        	{
            	return PersistentState.GetStructMapping<Perro>>("Perros");
        	}
    	}
		public ISmartContractMapping<Perro> PerrosJovenes
    	{
        	get
        	{
            	return PersistentState.GetStructMapping<Perro>>("PerrosJovenes");
        	}
    	}
		public ISmartContractMapping<Perro> PerrosViejos
    	{
        	get
        	{
            	return PersistentState.GetStructMapping<Perro>>("PerrosViejos");
        	}
    	}
	
		public void ConsultarPerro (String Placa){
		
		}
	
		public void CrearPerro (String Raza,String Placa,Numerico Edad,Numerico Precio){
		
		}
	
		public void ActualizarPerro (Numerico Edad,Numerico Precio){
		
		}
	
		public void BorrarPerro (String Placa){
		
		}
 
}
	

 
