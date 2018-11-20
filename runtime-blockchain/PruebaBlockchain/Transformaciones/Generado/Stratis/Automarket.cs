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
		public Address Placa; 
		public int Precio; 
		public bool Nuevo; 
		public string Comentarios; 
	}
	public AutoMarket (ISmartContractState smartContractState, ulong durationBlocks)
    : base(smartContractState)
    {
        
    }
	public ISmartContractMapping<Vehiculo> Vehiculos
    {
        get
       	{
           	return PersistentState.GetStructMapping<Vehiculo>("Vehiculos");
       	}
    }
	public ISmartContractMapping<Vehiculo> VehiculosCaros
    {
        get
       	{
           	return PersistentState.GetStructMapping<Vehiculo>("VehiculosCaros");
       	}
    }
	public ISmartContractMapping<Vehiculo> VehiculosBaratos
    {
        get
       	{
           	return PersistentState.GetStructMapping<Vehiculo>("VehiculosBaratos");
       	}
    }
	
	public string ConsultarVehiculo (Address Placa){
			return Vehiculos[Placa].Marca;	
	}
	
	public int CalcularCostos (int PrecioVehiculo,int ImpuestoVehiculo,int ValorTraspaso,int ComisionRunt){
			return ((((PrecioVehiculo * 0.19) + (PrecioVehiculo * ImpuestoVehiculo)) + ValorTraspaso) + ComisionRunt);	
	}
	
	public void CrearVehiculo (string Marca,string Modelo,string Linea,Address Placa,int Cilindraje,int Precio){
			Vehiculo vehiculo = new Vehiculo();
			vehiculo.Marca = Marca; 
			vehiculo.Modelo = Modelo; 
			vehiculo.Linea = Linea; 
			vehiculo.Cilindraje = Cilindraje; 
			vehiculo.Placa = Placa; 
			vehiculo.Precio = Precio; 
			vehiculo.Nuevo = true; 
			vehiculo.Comentarios =  "SinComentarios"; 
			Vehiculos[Placa] = vehiculo; 
			if(((Precio >= 1.0E8) || ((Marca ==  "Ferrari") && (Marca !=  "Renault")))){
				VehiculosCaros[Placa] = vehiculo;
			}else{	
				VehiculosBaratos[Placa] = vehiculo;
	
			}	 	
	}
	
	public void ActualizarVehiculo (Address Placa,int Cilindraje,int Precio){
			Vehiculo vehiculo = new Vehiculo();
			vehiculo.Cilindraje = Cilindraje; 
			vehiculo.Placa = Placa; 
			vehiculo.Precio = Precio; 
			vehiculo.Nuevo = true; 
			Vehiculos[Placa] = vehiculo; 
	}
 
}
