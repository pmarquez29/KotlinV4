package arquitectura.software.KotlinV4.exceptions

import arquitectura.software.kotlinv4.dto.ResponseDto
import org.springframework.http.ResponseEntity

class Controller {

    fun zeroException(e: IllegalArgumentException): ResponseEntity<ResponseDto<Any>> {
        val responseDto = ResponseDto<Any>(null, false, e.message.toString())
        return ResponseEntity.badRequest().body(responseDto)
    }

}