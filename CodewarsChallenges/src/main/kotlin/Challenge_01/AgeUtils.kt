package Challenge_01

class AgeUtils {

    fun orderHigherAges(ageList: List<Int>) : List<Int> {

        val olderAge = ageList.maxOrNull()

        var olderAgeList = ageList.filter { it == olderAge }
        val newListWithOutOlderAge = ageList.toMutableList()

        newListWithOutOlderAge.removeAll { it == olderAge }

        val secondOldestAge = newListWithOutOlderAge.maxOrNull()

        if (olderAgeList.count() > 1) {
            return mutableListOf(olderAge ?: 0, olderAge ?: 0)
        } else return mutableListOf(secondOldestAge ?: 0, olderAge ?: 0)
    }

}