package com.mycompany.conecctionbdd.principal;

import com.mycompany.conecctionbdd.entidades.Producto;
import com.mycompany.conecctionbdd.entidades.ProductoJpaController;
import java.math.BigDecimal;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("laboratorio");
        ProductoJpaController pjc=new ProductoJpaController(emf);
        
        Producto p = new Producto();
        p.setNombre("Chocolate");
        p.setPrecio(BigDecimal.valueOf(13.87));
        
        pjc.create(p);
        
    }
    
}
