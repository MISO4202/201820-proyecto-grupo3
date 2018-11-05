using Stratis.SmartContracts;
using System.Linq;
using System;


public class AutoMarket : SmartContract 
{
	public struct Vehiculo {
		public String Marca; 
		public String Modelo; 
		public String Linea; 
		public Numerico Cilindraje; 
		public String Placa; 
		public Numerico Precio; 
		public Boolean Nuevo; 
		public String Comentarios; 
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
	
		public void ConsultarVehiculo (String Placa){
		
		}
	
		public void BorrarVehiculo (String Placa){
		
		}
	
		public void CalcularCostosVenta (Numerico PrecioVehiculo,Numerico ImpuestoVehiculo,Numerico ValorTraspaso,Numerico ComisionRunt){
		
		}
	
		public void CrearVehiculo (String Marca,String Modelo,String Linea,Numerico Cilindraje,String Placa,Numerico Precio){
		
		}
	
		public void ActualizarVehiculo (Numerico Cilindraje,Numerico Precio){
		
		}
 
}
	

 
