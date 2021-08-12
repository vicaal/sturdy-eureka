package com.vicaal.ninjahydrator

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HydratorController {
    @RequestMapping("/hydrator")
    fun hydrate(
        @RequestHeader headers: Map<String, String>,
        @RequestBody oahtkeeperPayload: OathkeeperPayload
    ): OathkeeperPayload {
        val hydratedExtras = mutableMapOf<String, Any>()
        hydratedExtras["keycloakToken"] = "xablau"
        return OathkeeperPayload(
            oahtkeeperPayload.subject,
            hydratedExtras,
            oahtkeeperPayload.header,
            oahtkeeperPayload.matchContext
        )
    }

    @RequestMapping("/hello")
    fun hello(@RequestHeader headers: Map<String, String>, @RequestBody body: Map<String, String>?): String {
        println(headers)
        println(body)
        return "hello"
    }
}