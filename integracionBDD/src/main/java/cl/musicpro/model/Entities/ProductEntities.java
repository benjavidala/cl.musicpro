package cl.musicpro.model.Entities;

import java.util.Locale.Category;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
@Table(schema = "cl.musicpro", name= "productos")
public class ProductEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproductos")
    private int idproductos;
    
    @Basic
    @Column(name = "nombre")
    private String nombre;

    @Basic
    @Column(name = "modelo")
    private String modelo;

    @Basic
    @Column(name = "descripcion")
    private String description;

    @Basic
    @Column(name = "sku")
    private String sku;

    @Basic
    @Column(name = "precio")
    private float precio;

    @Basic
    @Column(name = "idcategoria")
    private int idcategoria;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "idcategoria", referencedColumnName = "idcategoria", insertable =false, updatable = false)
    @JsonBackReference 
    private Category fk_productos_categoria;
    
}
