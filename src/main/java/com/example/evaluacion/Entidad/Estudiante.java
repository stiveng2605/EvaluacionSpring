package com.example.evaluacion.Entidad;

public class Estudiante {
    private int codigo;
    private String nombre;
    private String apellido;
    private String[] materias;
    private Float[] notas;

    public Estudiante(int codigo, String nombre, String apellido, String[] materias, Float[] notas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materias = materias;
        this.notas = notas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public Float[] getNotas() {
        return notas;
    }

    public void setNotas(Float[] notas) {
        this.notas = notas;
    }
}
