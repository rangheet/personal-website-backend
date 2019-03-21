package com.sherlock.Model;

public class Logo {

    private String Logoname;
    private String FilenameOnServer;
    private String URL;

    public Logo( String Logoname, String filenameOnServer, String URL) {
        FilenameOnServer = filenameOnServer;
        this.URL = URL;
        this.Logoname = Logoname;
    }

    public String getFilenameOnServer() {
        return FilenameOnServer;
    }

    public void setFilenameOnServer(String filenameOnServer) {
        FilenameOnServer = filenameOnServer;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getLogoname() {
        return Logoname;
    }

    public void setLogoname(String logoname) {
        Logoname = logoname;
    }

}
