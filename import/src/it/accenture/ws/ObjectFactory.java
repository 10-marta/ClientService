
package it.accenture.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.accenture.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SalutiResponse_QNAME = new QName("http://ws.accenture.it/", "salutiResponse");
    private final static QName _RecuperoGara_QNAME = new QName("http://ws.accenture.it/", "recuperoGara");
    private final static QName _RecuperoAtletaResponse_QNAME = new QName("http://ws.accenture.it/", "recuperoAtletaResponse");
    private final static QName _RecuperoGaraResponse_QNAME = new QName("http://ws.accenture.it/", "recuperoGaraResponse");
    private final static QName _RecuperoAllAtletiResponse_QNAME = new QName("http://ws.accenture.it/", "recuperoAllAtletiResponse");
    private final static QName _RecuperoAllGare_QNAME = new QName("http://ws.accenture.it/", "recuperoAllGare");
    private final static QName _RecuperoAtleta_QNAME = new QName("http://ws.accenture.it/", "recuperoAtleta");
    private final static QName _RecuperoAllGareResponse_QNAME = new QName("http://ws.accenture.it/", "recuperoAllGareResponse");
    private final static QName _Saluti_QNAME = new QName("http://ws.accenture.it/", "saluti");
    private final static QName _RecuperoAllAtleti_QNAME = new QName("http://ws.accenture.it/", "recuperoAllAtleti");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.accenture.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecuperoGara }
     * 
     */
    public RecuperoGara createRecuperoGara() {
        return new RecuperoGara();
    }

    /**
     * Create an instance of {@link SalutiResponse }
     * 
     */
    public SalutiResponse createSalutiResponse() {
        return new SalutiResponse();
    }

    /**
     * Create an instance of {@link RecuperoAtleta }
     * 
     */
    public RecuperoAtleta createRecuperoAtleta() {
        return new RecuperoAtleta();
    }

    /**
     * Create an instance of {@link RecuperoAllAtleti }
     * 
     */
    public RecuperoAllAtleti createRecuperoAllAtleti() {
        return new RecuperoAllAtleti();
    }

    /**
     * Create an instance of {@link RecuperoAllGareResponse }
     * 
     */
    public RecuperoAllGareResponse createRecuperoAllGareResponse() {
        return new RecuperoAllGareResponse();
    }

    /**
     * Create an instance of {@link Saluti }
     * 
     */
    public Saluti createSaluti() {
        return new Saluti();
    }

    /**
     * Create an instance of {@link RecuperoGaraResponse }
     * 
     */
    public RecuperoGaraResponse createRecuperoGaraResponse() {
        return new RecuperoGaraResponse();
    }

    /**
     * Create an instance of {@link RecuperoAtletaResponse }
     * 
     */
    public RecuperoAtletaResponse createRecuperoAtletaResponse() {
        return new RecuperoAtletaResponse();
    }

    /**
     * Create an instance of {@link RecuperoAllGare }
     * 
     */
    public RecuperoAllGare createRecuperoAllGare() {
        return new RecuperoAllGare();
    }

    /**
     * Create an instance of {@link RecuperoAllAtletiResponse }
     * 
     */
    public RecuperoAllAtletiResponse createRecuperoAllAtletiResponse() {
        return new RecuperoAllAtletiResponse();
    }

    /**
     * Create an instance of {@link Atleta }
     * 
     */
    public Atleta createAtleta() {
        return new Atleta();
    }

    /**
     * Create an instance of {@link Gara }
     * 
     */
    public Gara createGara() {
        return new Gara();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalutiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accenture.it/", name = "salutiResponse")
    public JAXBElement<SalutiResponse> createSalutiResponse(SalutiResponse value) {
        return new JAXBElement<SalutiResponse>(_SalutiResponse_QNAME, SalutiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperoGara }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accenture.it/", name = "recuperoGara")
    public JAXBElement<RecuperoGara> createRecuperoGara(RecuperoGara value) {
        return new JAXBElement<RecuperoGara>(_RecuperoGara_QNAME, RecuperoGara.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperoAtletaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accenture.it/", name = "recuperoAtletaResponse")
    public JAXBElement<RecuperoAtletaResponse> createRecuperoAtletaResponse(RecuperoAtletaResponse value) {
        return new JAXBElement<RecuperoAtletaResponse>(_RecuperoAtletaResponse_QNAME, RecuperoAtletaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperoGaraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accenture.it/", name = "recuperoGaraResponse")
    public JAXBElement<RecuperoGaraResponse> createRecuperoGaraResponse(RecuperoGaraResponse value) {
        return new JAXBElement<RecuperoGaraResponse>(_RecuperoGaraResponse_QNAME, RecuperoGaraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperoAllAtletiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accenture.it/", name = "recuperoAllAtletiResponse")
    public JAXBElement<RecuperoAllAtletiResponse> createRecuperoAllAtletiResponse(RecuperoAllAtletiResponse value) {
        return new JAXBElement<RecuperoAllAtletiResponse>(_RecuperoAllAtletiResponse_QNAME, RecuperoAllAtletiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperoAllGare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accenture.it/", name = "recuperoAllGare")
    public JAXBElement<RecuperoAllGare> createRecuperoAllGare(RecuperoAllGare value) {
        return new JAXBElement<RecuperoAllGare>(_RecuperoAllGare_QNAME, RecuperoAllGare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperoAtleta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accenture.it/", name = "recuperoAtleta")
    public JAXBElement<RecuperoAtleta> createRecuperoAtleta(RecuperoAtleta value) {
        return new JAXBElement<RecuperoAtleta>(_RecuperoAtleta_QNAME, RecuperoAtleta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperoAllGareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accenture.it/", name = "recuperoAllGareResponse")
    public JAXBElement<RecuperoAllGareResponse> createRecuperoAllGareResponse(RecuperoAllGareResponse value) {
        return new JAXBElement<RecuperoAllGareResponse>(_RecuperoAllGareResponse_QNAME, RecuperoAllGareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saluti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accenture.it/", name = "saluti")
    public JAXBElement<Saluti> createSaluti(Saluti value) {
        return new JAXBElement<Saluti>(_Saluti_QNAME, Saluti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperoAllAtleti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accenture.it/", name = "recuperoAllAtleti")
    public JAXBElement<RecuperoAllAtleti> createRecuperoAllAtleti(RecuperoAllAtleti value) {
        return new JAXBElement<RecuperoAllAtleti>(_RecuperoAllAtleti_QNAME, RecuperoAllAtleti.class, null, value);
    }

}
