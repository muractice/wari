package warikan.api

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import spock.lang.*
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@Unroll
@WebMvcTest
class WarikanAcceptApiTest extends Specification {
    @Autowired
    MockMvc mockMvc

    WarikanAcceptApi warikanAcceptApi = new WarikanAcceptApi()

    static final String apiPath = "/warikan"

    def "invoke where request=#request then expect: #expectedResult"() {
        setup:
        def builder = MockMvcRequestBuilders
                .post(apiPath)

        when:
        def result = mockMvc.perform(builder)

        then:
        result.andDo(MockMvcResultHandlers.print());
        result.andExpect(status().isOk())


//        expect:
//        warikanAcceptApi.invoke(request) == expectedResult

//        where:
//        request       || expectedResult
//        new Request() || ["hoge": 0]
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme