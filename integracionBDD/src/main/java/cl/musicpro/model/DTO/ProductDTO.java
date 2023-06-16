package cl.musicpro.model.DTO;

import lombok.Data;

@Data
public class ProductDTO {

    private int idproductos
    private String descripcion
    private String modelo
    private int precio 
    private String nombre
    private String sku 
    private int categoria_idcategoria 
    
}
