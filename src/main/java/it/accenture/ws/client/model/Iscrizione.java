package it.accenture.ws.client.model;

import it.accenture.ws.Atleta;
import it.accenture.ws.Gara;

public class Iscrizione {
    private Long idIscrizione;
    private Atleta atleta;
    private Gara gara;

    public Iscrizione(Long idIscrizione, Atleta atleta, Gara gara) {
        this.idIscrizione = idIscrizione;
        this.atleta = atleta;
        this.gara = gara;
    }

    public Long getIdIscrizione() {
        return idIscrizione;
    }

    public void setIdIscrizione(Long idIscrizione) {
        this.idIscrizione = idIscrizione;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }

    public Gara getGara() {
        return gara;
    }

    public void setGara(Gara gara) {
        this.gara = gara;
    }

    @Override
    public String toString() {
        return "{" +
                "idIscrizione=" + idIscrizione +
                ", atleta= {" +
                "id : " + atleta.getId() +
                ", nome : " + atleta.getNome() +
                ", cognome : " + atleta.getCognome() +
                ", categoria : " + atleta.getCategoria()
                + "}" +
                ", gara= {" +
                "id: " + gara.getId() +
                ", denominazione : " +gara.getDenominazione() +
                ", luogo : " +gara.getLuogo()
                + "} "
                + '}';
    }


}
