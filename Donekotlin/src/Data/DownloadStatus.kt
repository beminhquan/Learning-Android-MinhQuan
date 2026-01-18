package data
enum class DownloadStatus(val message: String) {
    DOWNLOAD_SUCCESS("Tải xuống thành công"),
    DOWNLOAD_TIMEOUT("Hết thời gian chờ"),
    DOWNLOAD_ERROR("Lỗi tải xuống"),
    NETWORK_ERROR("Lỗi kết nối mạng")
}