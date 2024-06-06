package eu.krzdabrowski.starter.basicfeature.utlis

import java.text.SimpleDateFormat
import java.util.Locale

class DateUtils {

    fun formatDate(date: String): String {
        val inputFormat = SimpleDateFormat("yyyy-MM-dd", Locale.US)
        val outputFormat = SimpleDateFormat("d MMMM yyyy", Locale.US)
        val parsedDate = inputFormat.parse(date)
        return outputFormat.format(parsedDate)
    }

}