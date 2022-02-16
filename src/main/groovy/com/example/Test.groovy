package com.example

import io.micronaut.data.annotation.AutoPopulated
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@MappedEntity("test")
class Test {
    @Id
    @AutoPopulated
    UUID id

    String name

    String s3Name
}
