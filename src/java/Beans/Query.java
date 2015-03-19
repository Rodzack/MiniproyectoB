package Beans;
import java.sql.*;
public class Query extends cnx {
     
    private int idIng;
    private String nomIng;
    private ResultSet rs;
    
    public Query(){
        
        cnx();
    }
    Beans bean = new Beans();
    int precio;
    int pr = bean.getTeclado();
    
    public ResultSet teclado(int entrada)throws Exception{
        
        try{
            getSql();
            rs = sql.executeQuery("select dp.idProducto,p.nombre, m.nombreMarca,d.capacidad,d.compatibilidad,d.descripcionAdicional,d.tamanio,d.tecnologia,dp.precio,tp.tipoProducto"
                    + " from descripcionproducto dp"
                    + " join descripcion d on dp.idDescripcion=d.idDescripcion"
                    + " join marca m on dp.idMarca=m.idMarca"
                    + " join producto p on dp.idProducto=p.idProducto"
                    + " join tipoproducto tp on p.idTipoproducto = tp.IdTipoProducto where dp.precio <="+entrada+"  and tp.tipoProducto = 'teclado' order by dp.idProducto");
            System.out.println(bean.getRam());
            return rs;
        }catch(Exception ex){
            System.err.print("Error: "+ex.getMessage());
            return null;
        }
    }  
    
     public ResultSet mouse(int entrada)throws Exception{
        try{
            getSql();
            rs = sql.executeQuery("select dp.idProducto,p.nombre, m.nombreMarca,d.capacidad,d.compatibilidad,d.descripcionAdicional,d.tamanio,d.tecnologia,dp.precio,tp.tipoProducto"
                    + " from descripcionproducto dp"
                    + " join descripcion d on dp.idDescripcion=d.idDescripcion"
                    + " join marca m on dp.idMarca=m.idMarca"
                    + " join producto p on dp.idProducto=p.idProducto"
                    + " join tipoproducto tp on p.idTipoproducto = tp.IdTipoProducto where dp.precio <="+entrada+"  and tp.tipoProducto = 'mouse' order by dp.idProducto");
            return rs;
        }catch(Exception ex){
            System.err.print("Error: "+ex.getMessage());
            return null;
        }
    }  
    
    public ResultSet procesador(int entrada)throws Exception{
        try{
            getSql();
            rs = sql.executeQuery("select dp.idProducto,p.nombre, m.nombreMarca,d.capacidad,d.compatibilidad,d.descripcionAdicional,d.tamanio,d.tecnologia,dp.precio,tp.tipoProducto"
                    + " from descripcionproducto dp"
                    + " join descripcion d on dp.idDescripcion=d.idDescripcion"
                    + " join marca m on dp.idMarca=m.idMarca"
                    + " join producto p on dp.idProducto=p.idProducto"
                    + " join tipoproducto tp on p.idTipoproducto = tp.IdTipoProducto where dp.precio <="+entrada+"  and tp.tipoProducto = 'procesador' order by dp.idProducto");
            return rs;
        }catch(Exception ex){
            System.err.print("Error: "+ex.getMessage());
            return null;
        }
    }
    
    public ResultSet board(int entrada)throws Exception{
        try{
            getSql();
            rs = sql.executeQuery("select dp.idProducto,p.nombre, m.nombreMarca,d.capacidad,d.compatibilidad,d.descripcionAdicional,d.tamanio,d.tecnologia,dp.precio,tp.tipoProducto"
                    + " from descripcionproducto dp"
                    + " join descripcion d on dp.idDescripcion=d.idDescripcion"
                    + " join marca m on dp.idMarca=m.idMarca"
                    + " join producto p on dp.idProducto=p.idProducto"
                    + " join tipoproducto tp on p.idTipoproducto = tp.IdTipoProducto where dp.precio <="+entrada+"  and tp.tipoProducto = 'mainBoard' order by dp.idProducto");
            return rs;
        }catch(Exception ex){
            System.err.print("Error: "+ex.getMessage());
            return null;
        }
    }
    
    public ResultSet cooler(int entrada)throws Exception{
        try{
            getSql();
            rs = sql.executeQuery("select dp.idProducto,p.nombre, m.nombreMarca,d.capacidad,d.compatibilidad,d.descripcionAdicional,d.tamanio,d.tecnologia,dp.precio,tp.tipoProducto"
                    + " from descripcionproducto dp"
                    + " join descripcion d on dp.idDescripcion=d.idDescripcion"
                    + " join marca m on dp.idMarca=m.idMarca"
                    + " join producto p on dp.idProducto=p.idProducto"
                    + " join tipoproducto tp on p.idTipoproducto = tp.IdTipoProducto where dp.precio <="+entrada+"  and tp.tipoProducto = 'coolers' order by dp.idProducto");
            return rs;
        }catch(Exception ex){
            System.err.print("Error: "+ex.getMessage());
            return null;
        }
    }
    
    public ResultSet gabinete(int entrada)throws Exception{
        try{
            getSql();
            rs = sql.executeQuery("select dp.idProducto,p.nombre, m.nombreMarca,d.capacidad,d.compatibilidad,d.descripcionAdicional,d.tamanio,d.tecnologia,dp.precio,tp.tipoProducto"
                    + " from descripcionproducto dp"
                    + " join descripcion d on dp.idDescripcion=d.idDescripcion"
                    + " join marca m on dp.idMarca=m.idMarca"
                    + " join producto p on dp.idProducto=p.idProducto"
                    + " join tipoproducto tp on p.idTipoproducto = tp.IdTipoProducto where dp.precio <="+entrada+"  and tp.tipoProducto = 'gabinete' order by dp.idProducto");
            return rs;
        }catch(Exception ex){
            System.err.print("Error: "+ex.getMessage());
            return null;
        }
    }
    
        public ResultSet grafica(int entrada)throws Exception{
        try{
            getSql();
            rs = sql.executeQuery("select dp.idProducto,p.nombre, m.nombreMarca,d.capacidad,d.compatibilidad,d.descripcionAdicional,d.tamanio,d.tecnologia,dp.precio,tp.tipoProducto"
                    + " from descripcionproducto dp"
                    + " join descripcion d on dp.idDescripcion=d.idDescripcion"
                    + " join marca m on dp.idMarca=m.idMarca"
                    + " join producto p on dp.idProducto=p.idProducto"
                    + " join tipoproducto tp on p.idTipoproducto = tp.IdTipoProducto where dp.precio <="+entrada+"  and tp.tipoProducto = 'tarjetaGrafica' order by dp.idProducto");
            return rs;
        }catch(Exception ex){
            System.err.print("Error: "+ex.getMessage());
            return null;
        }
    }
        
    public ResultSet pantalla(int entrada)throws Exception{
        try{
            getSql();
            rs = sql.executeQuery("select dp.idProducto,p.nombre, m.nombreMarca,d.capacidad,d.compatibilidad,d.descripcionAdicional,d.tamanio,d.tecnologia,dp.precio,tp.tipoProducto"
                    + " from descripcionproducto dp"
                    + " join descripcion d on dp.idDescripcion=d.idDescripcion"
                    + " join marca m on dp.idMarca=m.idMarca"
                    + " join producto p on dp.idProducto=p.idProducto"
                    + " join tipoproducto tp on p.idTipoproducto = tp.IdTipoProducto where dp.precio <="+entrada+"  and tp.tipoProducto = 'monitor' order by dp.idProducto");
            return rs;
        }catch(Exception ex){
            System.err.print("Error: "+ex.getMessage());
            return null;
        }
    }
    
    public ResultSet fuentePoder(int entrada)throws Exception{
        try{
            getSql();
            rs = sql.executeQuery("select dp.idProducto,p.nombre, m.nombreMarca,d.capacidad,d.compatibilidad,d.descripcionAdicional,d.tamanio,d.tecnologia,dp.precio,tp.tipoProducto"
                    + " from descripcionproducto dp"
                    + " join descripcion d on dp.idDescripcion=d.idDescripcion"
                    + " join marca m on dp.idMarca=m.idMarca"
                    + " join producto p on dp.idProducto=p.idProducto"
                    + " join tipoproducto tp on p.idTipoproducto = tp.IdTipoProducto where dp.precio <="+entrada+"  and tp.tipoProducto = 'fuentePoder' order by dp.idProducto");
            return rs;
        }catch(Exception ex){
            System.err.print("Error: "+ex.getMessage());
            return null;
        }
    }
    
    public ResultSet dicoDuro(int entrada)throws Exception{
        try{
            getSql();
            rs = sql.executeQuery("select dp.idProducto,p.nombre, m.nombreMarca,d.capacidad,d.compatibilidad,d.descripcionAdicional,d.tamanio,d.tecnologia,dp.precio,tp.tipoProducto"
                    + " from descripcionproducto dp"
                    + " join descripcion d on dp.idDescripcion=d.idDescripcion"
                    + " join marca m on dp.idMarca=m.idMarca"
                    + " join producto p on dp.idProducto=p.idProducto"
                    + " join tipoproducto tp on p.idTipoproducto = tp.IdTipoProducto where dp.precio <="+entrada+"  and tp.tipoProducto = 'dicoDuro' order by dp.idProducto");
            return rs;
        }catch(Exception ex){
            System.err.print("Error: "+ex.getMessage());
            return null;
        }
    }
    
    public ResultSet ram(int entrada)throws Exception{
        try{
            getSql();
            rs = sql.executeQuery("select dp.idProducto,p.nombre, m.nombreMarca,d.capacidad,d.compatibilidad,d.descripcionAdicional,d.tamanio,d.tecnologia,dp.precio,tp.tipoProducto"
                    + " from descripcionproducto dp"
                    + " join descripcion d on dp.idDescripcion=d.idDescripcion"
                    + " join marca m on dp.idMarca=m.idMarca"
                    + " join producto p on dp.idProducto=p.idProducto"
                    + " join tipoproducto tp on p.idTipoproducto = tp.IdTipoProducto where dp.precio <="+entrada+"  and tp.tipoProducto = 'ram' order by dp.idProducto");
            return rs;
        }catch(Exception ex){
            System.err.print("Error: "+ex.getMessage());
            return null;
        }
    }
 }
