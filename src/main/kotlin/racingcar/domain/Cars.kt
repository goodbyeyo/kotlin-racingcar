package racingcar.domain

class Cars(count: PositiveNumber) {
    private val _cars: MutableList<Car> = ArrayList()
    private val cars: List<Car>
        get() = _cars.toList()

    init {
        createCars(count)
    }

    private fun createCars(count: PositiveNumber): List<Car> {
        for (i: Int in 1..count.number) {
            _cars.add(Car())
        }
        return _cars
    }

    fun count(): Int {
        return _cars.size
    }

    fun findAllCars(): List<Car> {
        return _cars
    }
}
