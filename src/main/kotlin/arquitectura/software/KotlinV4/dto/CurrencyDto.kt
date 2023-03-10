package arquitectura.software.kotlinv4.dto

import arquitectura.software.demo.dto.RequestDto
import java.math.BigDecimal

class CurrencyDto {

    var success: Boolean = false
    var query: RequestDto? = null
    var info: InfoDto? = null
    var date: String? = null
    var result: BigDecimal? = null

    override fun toString(): String {
        return "success: $success date: $date result: $result info: $info query: $query"
    }
}