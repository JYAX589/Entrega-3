/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.josueyax.dto;

import org.josueyax.model.CategoriaProducto;

/**
 *
 * @author Josue
 */
public class CategoriaProductoDTO {
    private static CategoriaProductoDTO instance;
    private CategoriaProducto categoriaProducto;

    public CategoriaProductoDTO() {
    }
    
    public static CategoriaProductoDTO getCategoriaProductoDTO(){
        if(instance == null){
            instance = new CategoriaProductoDTO();
        }
        return instance;
    }

    public CategoriaProducto getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(CategoriaProducto categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }
    
}
