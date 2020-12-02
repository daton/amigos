package org.localiza.amigos.amigos;


import org.springframework.data.annotation.Id;

import java.util.*;


public class Usuario {
    @Id
    String nickname;
 String    nombre;
 String idAndroid;
 String    paterno;
 String   email;
 ArrayList<Coordenada>   coordenadas;

    public String getIdAndroid() {
        return idAndroid;
    }

    public void setIdAndroid(String idAndroid) {
        this.idAndroid = idAndroid;
    }

    public Usuario(){}

    @Override
    public String toString() {
        return "Usuario{" +
                "nickname='" + nickname + '\'' +
                ", nombre='" + nombre + '\'' +
                ", idAndroid='" + idAndroid + '\'' +
                ", paterno='" + paterno + '\'' +
                ", email='" + email + '\'' +
                ", coordenadas=" + coordenadas +
                '}';
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Coordenada> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(ArrayList<Coordenada> coordenadas) {
        this.coordenadas = coordenadas;
    }
}
