package domain
import data.SearchStatus

fun search(keyword: String?, items: List<String>): SearchStatus {
    return keyword?.let { k ->
        if (k.isEmpty()) SearchStatus.EMPTY_KEYWORD
        else {
            val hasResult = items.any { it.contains(k, ignoreCase = true) }
            if (hasResult) SearchStatus.SEARCH_SUCCESS else SearchStatus.SEARCH_NO_RESULT
        }
    } ?: SearchStatus.EMPTY_KEYWORD
}