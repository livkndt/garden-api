package garden.api.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/garden")
class GardenController {

    @Get("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    fun getGarden(id: String): String {
        return "Garden ID: $id"
    }
}