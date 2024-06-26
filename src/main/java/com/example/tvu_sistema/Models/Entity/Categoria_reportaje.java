package com.example.tvu_sistema.Models.Entity;
import java.io.Serializable;
import java.util.Date;
import java.util.List;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "categoria_reportaje")
@Setter
@Getter
public class Categoria_reportaje implements Serializable {
    private static final long serialVersionUID = 2629195288020321924L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_categoria_reportaje;    
    private String desc_categoria_reportaje;    
    private String est_categoria_reportaje;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria_reportaje", fetch = FetchType.LAZY)
	private List<Reportaje> reportajes;
    
}
