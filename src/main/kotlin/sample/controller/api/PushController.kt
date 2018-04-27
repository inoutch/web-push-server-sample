package sample.controller.api

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/push")
class PushController {
    @PostMapping()
    fun push() {

    }
}