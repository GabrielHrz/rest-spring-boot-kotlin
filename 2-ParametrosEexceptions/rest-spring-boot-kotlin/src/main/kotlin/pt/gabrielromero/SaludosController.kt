package pt.gabrielromero

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class SaludosController {

    val contador : AtomicLong = AtomicLong()
    //Crear funcion que va a devolver el primre endpoint
    @RequestMapping("/Saludo")
    fun saludos(@RequestParam(value="name", defaultValue = "World") name : String?) : Saludos{
        return Saludos(contador.incrementAndGet(),"Hello, $name")
    }
}