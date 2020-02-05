package warikan.domain

import spock.lang.*
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import warikan.domain.weight.PricePerWeight

import static org.mockito.Mockito.*

@Unroll
class PricePerWeightTest extends Specification {
    @Mock
    Price price
    @InjectMocks
    PricePerWeight pricePerWeight

    def setup() {
        MockitoAnnotations.initMocks(this)
    }

    def "test create"() {
        when:
        PricePerWeight result = PricePerWeight.create(new Price(0))

        then:
        result == new PricePerWeight(new Price(0))
    }

    def "test create 2"() {
        given:
        when(price.devide(anyInt())).thenReturn(new Price(0))

        when:
        PricePerWeight result = PricePerWeight.create(new BillingPrice(new Price(3000)), 3)

        then:
        result == new PricePerWeight(new Price(1000))
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme