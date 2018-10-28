package br.com.dev.filmeapp.API;

import br.com.dev.filmeapp.Generos;
import java.util.List;

public class ResponseGenero {

    private List<Generos> genres;

    public List<Generos> getGenres() {
        return genres;
    }

    public void setGenres(List<Generos> genres) {
        this.genres = genres;
    }

}
