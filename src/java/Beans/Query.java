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
    
     public ResultSet mouse()throws Exception{
        try{
            getSql();
            rs = sql.executeQuery("select dp.idProducto,p.nombre, m.nombreMarca,d.capacidad,d.compatibilidad,d.descripcionAdicional,d.tamanio,d.tecnologia,dp.precio,tp.tipoProducto"
                    + " from descripcionproducto dp"
                    + " join descripcion d on dp.idDescripcion=d.idDescripcion"
                    + " join marca m on dp.idMarca=m.idMarca"
                    + " join producto p on dp.idProducto=p.idProducto"
                    + " join tipoproducto tp on p.idTipoproducto = tp.IdTipoProducto where ");
            return rs;
        }catch(Exception ex){
            System.err.print("Error: "+ex.getMessage());
            return null;
        }
    }  
    
    
 }
