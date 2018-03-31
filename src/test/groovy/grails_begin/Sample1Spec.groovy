package grails_begin

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class Sample1Spec extends Specification implements DomainUnitTest<Sample1> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == true
    }
}
