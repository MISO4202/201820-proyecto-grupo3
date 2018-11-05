using Stratis.SmartContracts;
using System.Linq;
using System;


public class AutoMarket : SmartContract 
{
	public struct Vehiculo {
		public string Marca; 
		public string Modelo; 
		public string Linea; 
		public int Cilindraje; 
		public string Placa; 
		public int Precio; 
		public bool Nuevo; 
		public string Comentarios; 
		}
		public Inventario(ISmartContractState smartContractState, ulong durationBlocks)
    	: base(smartContractState)
    	{
        
    	}
		public ISmartContractMapping<Vehiculo> Vehiculos
    	{
        	get
        	{
            	return PersistentState.GetStructMapping<Vehiculo>>("Vehiculos");
        	}
    	}
		public ISmartContractMapping<Vehiculo> VehiculosCaros
    	{
        	get
        	{
            	return PersistentState.GetStructMapping<Vehiculo>>("VehiculosCaros");
        	}
    	}
		public ISmartContractMapping<Vehiculo> VehiculosBaratos
    	{
        	get
        	{
            	return PersistentState.GetStructMapping<Vehiculo>>("VehiculosBaratos");
        	}
    	}
	
		public void ConsultarVehiculo (string Placa){
		
		}
	
		public void CalcularCostos (int PrecioVehiculo,int ImpuestoVehiculo,int ValorTraspaso,int ComisionRunt){
		
		}
	
		public void CrearVehiculo (string Marca,string Modelo,string Linea,string Placa,int Cilindraje,int Precio){
		
		}
	
		public void ActualizarVehiculo (string Placa,int Cilindraje,int Precio){
		
		}
 
}
	

 
