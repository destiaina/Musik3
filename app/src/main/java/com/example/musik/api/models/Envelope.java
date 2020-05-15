package com.example.musik.api.models;

public class Envelope<T> {
    public T results;
    public Header headers;

    public Envelope(T results, Header headers) {
        this.results = results;
        this.headers = headers;
    }

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }

    public Header getHeaders() {
        return headers;
    }

    public void setHeaders(Header headers) {
        this.headers = headers;
    }
}

