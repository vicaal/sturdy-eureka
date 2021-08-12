package com.vicaal.ninjahydrator

import com.fasterxml.jackson.annotation.JsonProperty

data class OathkeeperPayload(
        val subject: String,
        val extra: Map<String, Any?>?,
        val header: Map<String, Any?>?,
        @JsonProperty("match_context")
        val matchContext: Map<String, Any>
)
