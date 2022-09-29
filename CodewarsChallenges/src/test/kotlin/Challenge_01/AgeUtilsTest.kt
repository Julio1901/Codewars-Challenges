package Challenge_01

import org.junit.Assert.*
import org.junit.Test

class AgeUtilsTest {

    private val ageUtils = AgeUtils()

    @Test
    fun `Should return the two greatest ages`(){
        val mockAgeList = listOf(8,10,15,17,22,40,3,1,57,0,9,10)
        val orderedList = ageUtils.orderHigherAges(mockAgeList)
        assertEquals(40, orderedList[0])
        assertEquals(57, orderedList[1])
    }

    @Test
    fun `Should return the higher age twice if it is repeated`(){

        val MAX_AGE = 57
        val SECOND_OLDEST_AGE = 40

        val mockAgeList = listOf(8,10,MAX_AGE,17,22,SECOND_OLDEST_AGE,3,1,MAX_AGE,0,9,10,MAX_AGE, 0, 7, 8,MAX_AGE, 10)

        val orderedList = ageUtils.orderHigherAges(mockAgeList)

        assertEquals(MAX_AGE, orderedList[0])
        assertEquals(MAX_AGE, orderedList[1])
    }

}