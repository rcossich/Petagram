package com.example.rcossich.petagram;

/**
 * Created by rcossich on 03/03/2017.
 */

public class Mascota_POJO {
    private int foto;
    private String nombre;
    private int cantidad_likes;

    public Mascota_POJO(int foto, String nombre, int cantidad_likes) {
        this.foto = foto;
        this.nombre = nombre;
        this.cantidad_likes = cantidad_likes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad_likes() {
        return cantidad_likes;
    }

    public void setCantidad_likes(int cantidad_likes) {
        this.cantidad_likes = cantidad_likes;
    }
}
