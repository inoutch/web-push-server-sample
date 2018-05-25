package sample.form

import com.fasterxml.jackson.annotation.JsonCreator
import javax.validation.constraints.NotNull

data class RegisterForm @JsonCreator constructor(
        @NotNull val userId: String,
        @NotNull val endpoint: String,
        @NotNull val userPublicKey: String,
        @NotNull val userAuth: String)