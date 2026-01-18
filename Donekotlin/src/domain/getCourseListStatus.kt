package domain
import data.Course
import data.CourseListStatus

fun getCourseListStatus(courses: List<Course>): CourseListStatus {
    return if (courses.isEmpty()) CourseListStatus.COURSE_LIST_EMPTY
    else CourseListStatus.COURSE_LIST_SUCCESS
}