package sample.service

import org.springframework.stereotype.Service
import sample.form.RegisterForm


@Service
class RegisterService {
    // on memory
    private val users = mutableMapOf<String, RegisterForm>()

    fun register(registerForm: RegisterForm) {
        users[registerForm.userId] = registerForm
    }

    fun users() = users.values
}