package br.com.dev.filmeapp.API;

import java.util.List;

public class ResponseApiFilme {

    private List<ResponseResult> results;

    public List<ResponseResult> getResults() {
        return results;
    }

    public void setResults(List<ResponseResult> results) {
        this.results = results;
    }
}
