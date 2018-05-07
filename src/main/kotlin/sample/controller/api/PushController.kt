package sample.controller.api

import org.springframework.web.bind.annotation.*
import sample.form.PushForm
import sample.form.RegisterForm
import sample.service.PushService
import sample.service.RegisterService
import javax.validation.Valid


@RestController
@RequestMapping("api/push")
class PushController(
        private val pushService: PushService,
        private val registerService: RegisterService) {
    @PostMapping("notification")
    fun notification(@RequestBody @Valid pushForm: PushForm) {
        pushService.notification(pushForm)
    }

    @PostMapping("register")
    fun register(@RequestBody @Valid registerForm: RegisterForm) {
        registerService.register(registerForm)
    }

    @GetMapping("key")
    fun key(): String {
        return pushService.key()
    }
}