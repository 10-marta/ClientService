package it.accenture.ws.client;

import it.accenture.ws.*;
import it.accenture.ws.client.model.Iscrizione;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        if(!checkParams(args)){
            System.err.println("Sintassi : ");
            System.err.println("client-service idAtleta idGara");
        }else{
            //recupero parametri

            Long idAtleta = Long.valueOf(args[0]);

            Long idGara = Long.valueOf(args[1]);

            List<Iscrizione> iscrizioni = new ArrayList<>();
            Iscrizione iscrizione1 = iscrivi(idAtleta, idGara);
            iscrizione1.setIdIscrizione(1L);
            iscrizioni.add(iscrizione1);
            System.out.println(iscrizioni);
        }

    }

    public static boolean checkParams(String[] args){
            return args.length==2 ? true : false;
    }

    public static Iscrizione iscrivi(Long idAtleta, Long idGara){
        Long idIscrizione = 1L;
        Atleta atleta=getAtleta(idAtleta);
        Gara gara = getGara(idGara);
        return new Iscrizione(idIscrizione,atleta,gara);
    }



    private static Gara getGara(Long idGara) {
        //creazione della richiesta
        RecuperoGara richiesta = new RecuperoGara();
        richiesta.setId(idGara);

        //canale di communicazione
        WebService service = new WebService();
        WebServiceManager port = service.getWebServiceManagerPort();

        Gara risposta = port.recuperoGara(idGara);

        return risposta;
    }

    private static Atleta getAtleta(Long idAtleta) {

        //creazione della richiesta
        RecuperoAtleta richiesta = new RecuperoAtleta();
        richiesta.setId(idAtleta);

        //canale di communicazione
        WebService service = new WebService();
        WebServiceManager port = service.getWebServiceManagerPort();

        Atleta risposta = port.recuperoAtleta(idAtleta);

        return risposta;
    }


}
