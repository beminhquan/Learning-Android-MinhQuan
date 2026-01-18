package domain
import data.ResultStatus

fun evaluateScore(score: Double?): ResultStatus {
    return score?.run {
        if (this < 0 || this > 10) ResultStatus.RESULT_INVALID
        else if (this >= 5) ResultStatus.RESULT_PASS
        else ResultStatus.RESULT_FAIL
    } ?: ResultStatus.RESULT_INVALID
}