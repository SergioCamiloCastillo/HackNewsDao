
package Modelo;

import java.util.Date;


public class Noticia {
    private String titulo;
    private String url;
    private String texto;
    private String fecha;
    

    public Noticia(String titulo, String url, String texto, String fecha) {
        this.titulo = titulo;
        this.url = url;
        this.texto = texto;
        this.fecha = fecha;
    }

   

  

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
   
}
