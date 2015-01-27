package com.microsoft.bingads.bulk;

import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.internal.bulk.DownloadStatusProvider;
import java.util.List;

/**
 * Represents a bulk download operation requested by a user. You can use this
 * class to poll for the download status, and then download the file when
 * available.
 *
 * Example: The {@link BulkServiceManager#submitDownload(DownloadParameters)}
 * method returns an instance of this class. If for any reason you do not want
 * to wait for the file to be prepared for download, for example if your
 * application quits unexpectedly or you have other tasks to process, you can
 * use an instance of {@link BulkDownloadOperation} to download the file when it
 * is available
 *
 */
public class BulkDownloadOperation extends BulkOperation<DownloadStatus> {

    /**
     * Initializes a new instance of this class with the specified
     * requestId and AuthorizationData.
     *
     * @param requestId The identifier of a download request that has previously
     * been submitted.
     * @param authorizationData Represents a user who intends to access the
     * corresponding customer and account.     
     */
    public BulkDownloadOperation(String requestId, AuthorizationData authorizationData) {
        super(requestId, authorizationData, new DownloadStatusProvider(requestId, authorizationData));
    }

    BulkDownloadOperation(String requestId, AuthorizationData authorizationData, String trackingId) {
        super(requestId, authorizationData, new DownloadStatusProvider(requestId, authorizationData), trackingId);
    }
    
    @Override
    RuntimeException getOperationCouldNotBeCompletedException(List<OperationError> errors, DownloadStatus status) {
        return new BulkDownloadCouldNotBeCompletedException(errors, status);
    }
}
