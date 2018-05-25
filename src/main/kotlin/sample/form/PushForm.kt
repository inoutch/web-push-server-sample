package sample.form

import com.fasterxml.jackson.annotation.JsonCreator
import javax.validation.constraints.NotNull

data class PushForm @JsonCreator constructor(
        @NotNull val message: String)