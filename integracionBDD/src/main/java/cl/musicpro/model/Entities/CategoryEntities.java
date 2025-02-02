package cl.musicpro.model.Entities;

import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
@Table(schema = "cl.musicpro", name= "categoria")

public class CategoryEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idcategoria")
    private int idcategoria;
    @Basic
    @Column (name ="name")
    private String name;

    @OneToMany(mappedBy = "fk_productos_categoria", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Column(nullable = true)
    @JsonManagedReference
    private Collection<ProductEntities> productByCategoryId;
}
