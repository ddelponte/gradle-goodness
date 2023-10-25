package com.dean

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/gradle-goodness")
class GradleGoodnessController {

    @Get(uri="/", produces="text/plain")
    String index() {
        "Example Response"
    }
}