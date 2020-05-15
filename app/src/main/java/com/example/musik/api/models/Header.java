package com.example.musik.api.models;

public class Header {
    String status, error_message, warnings;
    int code, results_count;

    public Header(String status, String error_message, String warnings, int code, int results_count) {
        this.status = status;
        this.error_message = error_message;
        this.warnings = warnings;
        this.code = code;
        this.results_count = results_count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getResults_count() {
        return results_count;
    }

    public void setResults_count(int results_count) {
        this.results_count = results_count;
    }
}
