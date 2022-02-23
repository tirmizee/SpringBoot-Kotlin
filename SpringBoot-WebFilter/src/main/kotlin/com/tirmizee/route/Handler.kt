package com.tirmizee.route

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyValueAndAwait

@Component
class Handler {

    suspend fun ping(serverRequest: ServerRequest) : ServerResponse {
        val uuid = serverRequest.attribute("requestId").get()
        return ServerResponse.ok().bodyValueAndAwait("Hello world $uuid")
    }

}