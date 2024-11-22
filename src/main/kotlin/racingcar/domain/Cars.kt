package racingcar.domain

class Cars(count: Int) {
    private val cars: MutableList<Car>

    init {
        cars = ArrayList()
        createCars(count)
    }

    private fun createCars(count: Int): List<Car> {
        for (i: Int in 1..count) {
            cars.add(Car())
        }
        return cars
    }

    fun count(): Int {
        return cars.size
    }
}
