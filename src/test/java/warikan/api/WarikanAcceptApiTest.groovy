package warikan.api

import spock.lang.*

class WarikanAcceptApiTest extends Specification {
    WarikanAcceptApi warikanAcceptApi = new WarikanAcceptApi()

    @Unroll
    def "invoke where request=#request then expect: #expectedResult"() {
        expect:
        warikanAcceptApi.invoke(request) == expectedResult

        where:
        request       || expectedResult
        new Request() || ["hoge": 0]
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme