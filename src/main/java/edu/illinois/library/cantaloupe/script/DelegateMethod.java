package edu.illinois.library.cantaloupe.script;

/**
 * Available delegate methods.
 */
public enum DelegateMethod {

    /**
     * Called by {@link DelegateProxy#authorize()}.
     */
    AUTHORIZE("authorize"),

    /**
     * Called by {@link DelegateProxy#getAzureStorageSourceBlobKey()}.
     */
    AZURESTORAGESOURCE_BLOB_KEY("azurestoragesource_blob_key"),

    /**
     * Called by {@link DelegateProxy#getExtraIIIFInformationResponseKeys()}.
     */
    EXTRA_IIIF_INFORMATION_RESPONSE_KEYS("extra_iiif_information_response_keys"),

    /**
     * Called by {@link DelegateProxy#getFilesystemSourcePathname()}.
     */
    FILESYSTEMSOURCE_PATHMAME("filesystemsource_pathname"),

    /**
     * Called by {@link DelegateProxy#getHttpSourceResourceInfo()}.
     */
    HTTPSOURCE_RESOURCE_INFO("httpsource_resource_info"),

    /**
     * Called by {@link DelegateProxy#getJdbcSourceDatabaseIdentifier()}.
     */
    JDBCSOURCE_DATABASE_IDENTIFIER("jdbcsource_database_identifier"),

    /**
     * Called by {@link DelegateProxy#getJdbcSourceMediaType()}.
     */
    JDBCSOURCE_MEDIA_TYPE("jdbcsource_media_type"),

    /**
     * Called by {@link DelegateProxy#getJdbcSourceLookupSQL()}.
     */
    JDBCSOURCE_LOOKUP_SQL("jdbcsource_lookup_sql"),

    /**
     * Called by {@link DelegateProxy#getMetadata()}.
     */
    METADATA("metadata"),

    /**
     * Called by {@link DelegateProxy#getOverlayProperties()}.
     */
    OVERLAY("overlay"),

    /**
     * Called by {@link DelegateProxy#getRedactions()}.
     */
    REDACTIONS("redactions"),

    /**
     * Called by {@link DelegateProxy#getSource()}.
     */
    SOURCE("source"),

    /**
     * Called by {@link DelegateProxy#getS3SourceObjectInfo()}.
     */
    S3SOURCE_OBJECT_INFO("s3source_object_info");

    private String methodName;

    DelegateMethod(String methodName) {
        this.methodName = methodName;
    }

    /**
     * @return Name of the delegate method.
     */
    String getMethodName() {
        return methodName;
    }

    /**
     * @return Name of the delegate method.
     */
    @Override
    public String toString() {
        return methodName;
    }

}
