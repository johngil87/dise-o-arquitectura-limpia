package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Movie {

    @Id
    private String id;
    private String nombre;
    private String categoria;
    private String duracion;

    public Movie(String id, String nombre, String categoria, String duracion) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.duracion = duracion;
    }

    public Movie(String nombre, String categoria, String duracion) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.duracion = duracion;
    }

    public Movie() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
