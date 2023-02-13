package arquitectura.software.kotlinv4.api

import arquitectura.software.kotlinv4.bl.CurrencyBl
import arquitectura.software.kotlinv4.dto.ResponseDto
import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity
import java.math.BigDecimal

@RestController
@RequestMapping("api/v1/currency")
class CurrencyApi(private val currencyBl: CurrencyBl) {

    @GetMapping("/get")
    fun get(@RequestParam from: String, @RequestParam to: String, @RequestParam amount: BigDecimal): ResponseEntity<ResponseDto<Any>> {
        val currencyDto = currencyBl.get(from, to, amount)
        val responseDto = ResponseDto<Any>(currencyDto, true, "Success")
        return ResponseEntity.ok(responseDto)
    }
}
