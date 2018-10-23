using Stratis.SmartContracts;
using System.Linq;
using System;



public class Inventario : SmartContract
{

    public struct Producto
    {
        public string id;
        public string nombre;
        public string descripcion;
        public string marca;
        public string precioCompra;
        public string precioVenta;
        public string proveedor;
        public string categoria;
    }

    public Inventario(ISmartContractState smartContractState, ulong durationBlocks)
    : base(smartContractState)
    {
        
    }

    public ISmartContractMapping<Producto> Productos
    {
        get
        {
            return PersistentState.GetStructMapping<Producto>("Productos");
        }
    }

    
    public struct Almacen 
    {
        public Address id;
        public string nombre;
        public string direccion;
        public string telefono;
        public uint idGerente;
        //private IPersistentState persistentState;
        //public Dictionary<uint, uint> cantidadProductos;
        public ISmartContractMapping<uint> CantidadProductos;
        /*{
            get
            {
                return persistentState.GetStructMapping<uint>("CantidadProductos" + id);
            }
        }*/

    }

    public ISmartContractMapping<Almacen> Almacenes
    {
        get
        {
            return PersistentState.GetStructMapping<Almacen>("Almacenes");
        }
    }
   

    public void AgregarAlmacen(Address _newAlmacen, string _nombre, string _direccion, string _telefono, uint _idGerente)
    {
        var nuevoAlmacen = new Almacen
        {
            id = _newAlmacen,
            nombre = _nombre,
            direccion = _direccion,
            telefono = _telefono,
            idGerente = _idGerente,
            CantidadProductos = PersistentState.GetStructMapping<uint>("CantidadProductos" + _newAlmacen)
    };
        Almacenes.Put(_newAlmacen, nuevoAlmacen);
        
    }

    public void AgregarProducto(string _id, string _nombre, string _descripcion, string _marca, string _precioCompra, string _precioVenta, string _proveedor, string _categoria)
    {
        var nuevoProducto = new Producto
        {
            id = _id,
            nombre = _nombre,
            descripcion = _descripcion,
            marca = _marca,
            precioCompra = _precioCompra,
            precioVenta = _precioVenta,
            proveedor = _proveedor,
            categoria = _categoria
        };

        Productos.Put(_id, nuevoProducto);
    }
    
    public void AgregarCantidadProductoAlmacen(uint _idProducto, Address _idAlmacen, uint _cantidad)
    {
        var almacen = Almacenes[_idAlmacen];
        almacen.CantidadProductos[_idProducto.ToString()] = almacen.CantidadProductos[_idProducto.ToString()] + _cantidad;
        
    }

    public void ReducirCantidadProductoAlmacen(uint _idProducto, Address _idAlmacen, uint _cantidad)
    {
        var almacen = Almacenes[_idAlmacen];    
        almacen.CantidadProductos[_idProducto.ToString()] = almacen.CantidadProductos[_idProducto.ToString()] - _cantidad;
    }
}