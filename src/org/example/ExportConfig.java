package org.example;

class ExportConfig {
     String path;
    public void setPath(String path) {
        this.path = path;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    String header;

    public ExportConfig(String path, String header) {
        this.path = path;
        this.header = header;
    }


    public String path() {
        return path;
    }

    public String header() {
        return header;
    }
}
