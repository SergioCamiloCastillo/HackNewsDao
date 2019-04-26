package Controlador;

import Modelo.Noticia;
import Modelo.NoticiaDao;
import Modelo.NoticiaDaoImpl;

public class NoticiasController {

    public void validarNoticia(String titulo, String url, String texto, String fecha) {
        if (titulo != "" || (titulo != "" && url != "") || (titulo != "" && texto != "")) {
            NoticiaDao noticia = new NoticiaDaoImpl();
            noticia.insert(new Noticia(null,titulo, url, texto, fecha));
        }

    }

    public void validarNoticiaValidar(Integer idEliminar) {
        if (idEliminar != null) {
            NoticiaDao noticiaEliminar = new NoticiaDaoImpl();
            noticiaEliminar.delete(idEliminar);
        }
    }
    public void verNoticia(){
        
    }

}
