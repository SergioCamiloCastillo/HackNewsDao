package Controlador;

import Modelo.Noticia;
import Modelo.NoticiaDao;
import Modelo.NoticiaDaoImpl;



public class NoticiasController {

    public void validarNoticia(String titulo, String url, String texto, String fecha) {
        if (titulo != "" || (titulo != ""  && url != "") || (titulo != "" && texto != "")) {
            NoticiaDao noticia = new NoticiaDaoImpl();
            noticia.insert(new Noticia(titulo, url, texto, fecha));
        }

    }

}
