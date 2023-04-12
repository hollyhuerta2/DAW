package org.ejemplo.HAHP;

import java.io.Serializable;

public class Profesores implements Serializable {
    public static final Long serialVersionUID = 1L;
    private int idprof;
    private String nomprof;
    private String paterno;
    private String materno;
    private String materiaesp;
    private String direc;
    private String telef, celu, email,lugarest;
    private int idecont,idetipoest;

    public Profesores(){
    }
    public Profesores(int idprof,int idecont,int idetipoest){
        this.idprof = idprof;
        this.idecont= idecont;
        this.idetipoest= idetipoest;
    }
    public Profesores (String nomprof, String paterno, String materno,String materiaesp,String direc,String telef,
    String celu, String email){
        this.nomprof = nomprof;
        this.paterno = paterno;
        this.materno =materno;
        this.materiaesp = materiaesp;
        this.direc = direc;
        this.telef = telef;
        this.celu= celu;
        this.email = email;
    }
    public Profesores(String lugarest){this.lugarest = lugarest;}
    public int getIdprof() {return idprof;}
    public void setIdprof(int idprof) {
        this.idprof = idprof;
    }
    public int getIdecont() {return idecont;}
    public void setIdecont(int idecont) {
        this.idecont = idecont;
    }
    public String getNomprof() {return nomprof;}
    public void setNomprof(String nomprof) {
        this.nomprof = nomprof;
    }
    public String getPaterno() {return paterno;}
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }
    public String getMaterno() {return materno;}
    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getMateriaesp() {return materiaesp;}
    public void setMateriaesp(String materiaesp) {
        this.materiaesp = materiaesp;
    }
    public String getDirec() {return direc;}
    public void setDirec(String direc) {
        this.direc = direc;
    }
    public String getTelef() {return telef;}
    public void setTelef(String telef) {
        this.telef = telef;
    }
    public String getCelu() {return celu;}
    public void setCelu(String celu) {
        this.celu = celu;
    }
    public String getEmail() {return email;}
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdetipoest() {return idetipoest;}
    public void setIdetipoest(int idetipoest) {
        this.idetipoest = idetipoest;
    }
}
