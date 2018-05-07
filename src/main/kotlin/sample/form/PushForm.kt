package sample.form

import com.fasterxml.jackson.annotation.JsonCreator
import org.jetbrains.annotations.NotNull

data class PushForm @JsonCreator constructor(
        @NotNull val message: String)