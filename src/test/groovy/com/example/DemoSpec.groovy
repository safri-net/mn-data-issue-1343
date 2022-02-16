package com.example


import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class DemoSpec extends Specification {

    @Inject
    TestRepository repository

    void 'test it works'() {
        when:
        def test = repository.save(new Test().tap {
            name = "name"
            s3Name = "works"
        })
        then:
        noExceptionThrown()
        test.name == "name"
        test.s3Name == "works"


    }

}
