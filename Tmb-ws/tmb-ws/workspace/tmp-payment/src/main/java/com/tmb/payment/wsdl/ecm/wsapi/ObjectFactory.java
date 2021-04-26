
package com.tmb.payment.wsdl.ecm.wsapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tmb.payment.wsdl.ecm.wsapi package. 
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

    private final static QName _BulkUploadDocument_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "bulkUploadDocument");
    private final static QName _BulkUploadDocumentResponse_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "bulkUploadDocumentResponse");
    private final static QName _CheckStatus_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "checkStatus");
    private final static QName _CheckStatusResponse_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "checkStatusResponse");
    private final static QName _DeleteDocuments_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "deleteDocuments");
    private final static QName _DeleteDocumentsResponse_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "deleteDocumentsResponse");
    private final static QName _DocumentIndex_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "documentIndex");
    private final static QName _DocumentServiceRequest_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "documentServiceRequest");
    private final static QName _DocumentServiceResponse_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "documentServiceResponse");
    private final static QName _ExportDocuments_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "exportDocuments");
    private final static QName _ExportDocumentsResponse_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "exportDocumentsResponse");
    private final static QName _ImportDocuments_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "importDocuments");
    private final static QName _ImportDocumentsResponse_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "importDocumentsResponse");
    private final static QName _IndexGroup_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "indexGroup");
    private final static QName _ResubmitDocuments_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "resubmitDocuments");
    private final static QName _ResubmitDocumentsResponse_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "resubmitDocumentsResponse");
    private final static QName _SearchDocuments_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "searchDocuments");
    private final static QName _SearchDocumentsResponse_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "searchDocumentsResponse");
    private final static QName _UpdateDocumentIndexes_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "updateDocumentIndexes");
    private final static QName _UpdateDocumentIndexesResponse_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "updateDocumentIndexesResponse");
    private final static QName _ViewDocument_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "viewDocument");
    private final static QName _ViewDocumentResponse_QNAME = new QName("http://wsapi.svc.ecm.clevel.com/", "viewDocumentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tmb.payment.wsdl.ecm.wsapi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BulkUploadDocument }
     * 
     */
    public BulkUploadDocument createBulkUploadDocument() {
        return new BulkUploadDocument();
    }

    /**
     * Create an instance of {@link BulkUploadDocumentResponse }
     * 
     */
    public BulkUploadDocumentResponse createBulkUploadDocumentResponse() {
        return new BulkUploadDocumentResponse();
    }

    /**
     * Create an instance of {@link CheckStatus }
     * 
     */
    public CheckStatus createCheckStatus() {
        return new CheckStatus();
    }

    /**
     * Create an instance of {@link CheckStatusResponse }
     * 
     */
    public CheckStatusResponse createCheckStatusResponse() {
        return new CheckStatusResponse();
    }

    /**
     * Create an instance of {@link DeleteDocuments }
     * 
     */
    public DeleteDocuments createDeleteDocuments() {
        return new DeleteDocuments();
    }

    /**
     * Create an instance of {@link DeleteDocumentsResponse }
     * 
     */
    public DeleteDocumentsResponse createDeleteDocumentsResponse() {
        return new DeleteDocumentsResponse();
    }

    /**
     * Create an instance of {@link DocumentIndex }
     * 
     */
    public DocumentIndex createDocumentIndex() {
        return new DocumentIndex();
    }

    /**
     * Create an instance of {@link DocumentServiceRequest }
     * 
     */
    public DocumentServiceRequest createDocumentServiceRequest() {
        return new DocumentServiceRequest();
    }

    /**
     * Create an instance of {@link DocumentServiceResponse }
     * 
     */
    public DocumentServiceResponse createDocumentServiceResponse() {
        return new DocumentServiceResponse();
    }

    /**
     * Create an instance of {@link ExportDocuments }
     * 
     */
    public ExportDocuments createExportDocuments() {
        return new ExportDocuments();
    }

    /**
     * Create an instance of {@link ExportDocumentsResponse }
     * 
     */
    public ExportDocumentsResponse createExportDocumentsResponse() {
        return new ExportDocumentsResponse();
    }

    /**
     * Create an instance of {@link ImportDocuments }
     * 
     */
    public ImportDocuments createImportDocuments() {
        return new ImportDocuments();
    }

    /**
     * Create an instance of {@link ImportDocumentsResponse }
     * 
     */
    public ImportDocumentsResponse createImportDocumentsResponse() {
        return new ImportDocumentsResponse();
    }

    /**
     * Create an instance of {@link DocumentIndexGroup }
     * 
     */
    public DocumentIndexGroup createDocumentIndexGroup() {
        return new DocumentIndexGroup();
    }

    /**
     * Create an instance of {@link ResubmitDocuments }
     * 
     */
    public ResubmitDocuments createResubmitDocuments() {
        return new ResubmitDocuments();
    }

    /**
     * Create an instance of {@link ResubmitDocumentsResponse }
     * 
     */
    public ResubmitDocumentsResponse createResubmitDocumentsResponse() {
        return new ResubmitDocumentsResponse();
    }

    /**
     * Create an instance of {@link SearchDocuments }
     * 
     */
    public SearchDocuments createSearchDocuments() {
        return new SearchDocuments();
    }

    /**
     * Create an instance of {@link SearchDocumentsResponse }
     * 
     */
    public SearchDocumentsResponse createSearchDocumentsResponse() {
        return new SearchDocumentsResponse();
    }

    /**
     * Create an instance of {@link UpdateDocumentIndexes }
     * 
     */
    public UpdateDocumentIndexes createUpdateDocumentIndexes() {
        return new UpdateDocumentIndexes();
    }

    /**
     * Create an instance of {@link UpdateDocumentIndexesResponse }
     * 
     */
    public UpdateDocumentIndexesResponse createUpdateDocumentIndexesResponse() {
        return new UpdateDocumentIndexesResponse();
    }

    /**
     * Create an instance of {@link ViewDocument }
     * 
     */
    public ViewDocument createViewDocument() {
        return new ViewDocument();
    }

    /**
     * Create an instance of {@link ViewDocumentResponse }
     * 
     */
    public ViewDocumentResponse createViewDocumentResponse() {
        return new ViewDocumentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulkUploadDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "bulkUploadDocument")
    public JAXBElement<BulkUploadDocument> createBulkUploadDocument(BulkUploadDocument value) {
        return new JAXBElement<BulkUploadDocument>(_BulkUploadDocument_QNAME, BulkUploadDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulkUploadDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "bulkUploadDocumentResponse")
    public JAXBElement<BulkUploadDocumentResponse> createBulkUploadDocumentResponse(BulkUploadDocumentResponse value) {
        return new JAXBElement<BulkUploadDocumentResponse>(_BulkUploadDocumentResponse_QNAME, BulkUploadDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "checkStatus")
    public JAXBElement<CheckStatus> createCheckStatus(CheckStatus value) {
        return new JAXBElement<CheckStatus>(_CheckStatus_QNAME, CheckStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "checkStatusResponse")
    public JAXBElement<CheckStatusResponse> createCheckStatusResponse(CheckStatusResponse value) {
        return new JAXBElement<CheckStatusResponse>(_CheckStatusResponse_QNAME, CheckStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "deleteDocuments")
    public JAXBElement<DeleteDocuments> createDeleteDocuments(DeleteDocuments value) {
        return new JAXBElement<DeleteDocuments>(_DeleteDocuments_QNAME, DeleteDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "deleteDocumentsResponse")
    public JAXBElement<DeleteDocumentsResponse> createDeleteDocumentsResponse(DeleteDocumentsResponse value) {
        return new JAXBElement<DeleteDocumentsResponse>(_DeleteDocumentsResponse_QNAME, DeleteDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "documentIndex")
    public JAXBElement<DocumentIndex> createDocumentIndex(DocumentIndex value) {
        return new JAXBElement<DocumentIndex>(_DocumentIndex_QNAME, DocumentIndex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "documentServiceRequest")
    public JAXBElement<DocumentServiceRequest> createDocumentServiceRequest(DocumentServiceRequest value) {
        return new JAXBElement<DocumentServiceRequest>(_DocumentServiceRequest_QNAME, DocumentServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "documentServiceResponse")
    public JAXBElement<DocumentServiceResponse> createDocumentServiceResponse(DocumentServiceResponse value) {
        return new JAXBElement<DocumentServiceResponse>(_DocumentServiceResponse_QNAME, DocumentServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "exportDocuments")
    public JAXBElement<ExportDocuments> createExportDocuments(ExportDocuments value) {
        return new JAXBElement<ExportDocuments>(_ExportDocuments_QNAME, ExportDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportDocumentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "exportDocumentsResponse")
    public JAXBElement<ExportDocumentsResponse> createExportDocumentsResponse(ExportDocumentsResponse value) {
        return new JAXBElement<ExportDocumentsResponse>(_ExportDocumentsResponse_QNAME, ExportDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "importDocuments")
    public JAXBElement<ImportDocuments> createImportDocuments(ImportDocuments value) {
        return new JAXBElement<ImportDocuments>(_ImportDocuments_QNAME, ImportDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportDocumentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "importDocumentsResponse")
    public JAXBElement<ImportDocumentsResponse> createImportDocumentsResponse(ImportDocumentsResponse value) {
        return new JAXBElement<ImportDocumentsResponse>(_ImportDocumentsResponse_QNAME, ImportDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentIndexGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "indexGroup")
    public JAXBElement<DocumentIndexGroup> createIndexGroup(DocumentIndexGroup value) {
        return new JAXBElement<DocumentIndexGroup>(_IndexGroup_QNAME, DocumentIndexGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResubmitDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "resubmitDocuments")
    public JAXBElement<ResubmitDocuments> createResubmitDocuments(ResubmitDocuments value) {
        return new JAXBElement<ResubmitDocuments>(_ResubmitDocuments_QNAME, ResubmitDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResubmitDocumentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "resubmitDocumentsResponse")
    public JAXBElement<ResubmitDocumentsResponse> createResubmitDocumentsResponse(ResubmitDocumentsResponse value) {
        return new JAXBElement<ResubmitDocumentsResponse>(_ResubmitDocumentsResponse_QNAME, ResubmitDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "searchDocuments")
    public JAXBElement<SearchDocuments> createSearchDocuments(SearchDocuments value) {
        return new JAXBElement<SearchDocuments>(_SearchDocuments_QNAME, SearchDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDocumentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "searchDocumentsResponse")
    public JAXBElement<SearchDocumentsResponse> createSearchDocumentsResponse(SearchDocumentsResponse value) {
        return new JAXBElement<SearchDocumentsResponse>(_SearchDocumentsResponse_QNAME, SearchDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocumentIndexes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "updateDocumentIndexes")
    public JAXBElement<UpdateDocumentIndexes> createUpdateDocumentIndexes(UpdateDocumentIndexes value) {
        return new JAXBElement<UpdateDocumentIndexes>(_UpdateDocumentIndexes_QNAME, UpdateDocumentIndexes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocumentIndexesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "updateDocumentIndexesResponse")
    public JAXBElement<UpdateDocumentIndexesResponse> createUpdateDocumentIndexesResponse(UpdateDocumentIndexesResponse value) {
        return new JAXBElement<UpdateDocumentIndexesResponse>(_UpdateDocumentIndexesResponse_QNAME, UpdateDocumentIndexesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "viewDocument")
    public JAXBElement<ViewDocument> createViewDocument(ViewDocument value) {
        return new JAXBElement<ViewDocument>(_ViewDocument_QNAME, ViewDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsapi.svc.ecm.clevel.com/", name = "viewDocumentResponse")
    public JAXBElement<ViewDocumentResponse> createViewDocumentResponse(ViewDocumentResponse value) {
        return new JAXBElement<ViewDocumentResponse>(_ViewDocumentResponse_QNAME, ViewDocumentResponse.class, null, value);
    }

}
