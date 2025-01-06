import kotlin.test.Test


class TestExample {
    companion object {
        val list = listOf(1, 2, 3, 4, 5)
    }

    @Test
    fun test() {
        assert(list.size == 5)
        assert(list.sum() == 15)
        assert(list.average() == 3.0)
    }
}