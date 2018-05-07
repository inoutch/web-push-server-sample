package sample.service

import nl.martijndwars.webpush.Notification
import nl.martijndwars.webpush.PushService
import org.bouncycastle.jce.provider.BouncyCastleProvider
import org.springframework.stereotype.Service
import sample.form.PushForm
import java.security.Security


@Service
class PushService(
        private val registerService: RegisterService) {
    private val publicKey = "BMvAlSSKo73gNAABatl3NRHb83VzogETyE9urIAW3D23U2vhDuuvd9ONVEhMCuFtdHwDg0kvg1nQvRk_0Vu89Wo"
    private val privateKey = "lrdaiyxAS6dW1yK3lh9ScMvlFnC-QJqm3ejaXAvaw_Q"

    fun notification(pushForm: PushForm) {
        val payload = pushForm.message
        Security.addProvider(BouncyCastleProvider())

        val push = PushService(publicKey, privateKey, "http://localhost")
        registerService.users().forEach {
            push.send(Notification(it.endpoint, it.userPublicKey, it.userAuth, payload))
        }
    }

    fun key() = publicKey
}