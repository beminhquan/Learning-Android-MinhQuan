package domain
import data.DownloadStatus

fun download(statusCode: Int?): DownloadStatus {
    return when (statusCode) {
        200 -> DownloadStatus.DOWNLOAD_SUCCESS
        408 -> DownloadStatus.DOWNLOAD_TIMEOUT
        503 -> DownloadStatus.DOWNLOAD_ERROR
        null -> DownloadStatus.NETWORK_ERROR
        else -> DownloadStatus.NETWORK_ERROR
    }
}