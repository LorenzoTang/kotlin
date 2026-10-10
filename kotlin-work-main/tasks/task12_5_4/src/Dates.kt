// Task 12.5.4: date manipulation utilities
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
import kotlin.time.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun today(zone: TimeZone = TimeZone.currentSystemDefault()): LocalDate {
    val now = Clock.System.now()
    return now.toLocalDateTime(zone).date
}
