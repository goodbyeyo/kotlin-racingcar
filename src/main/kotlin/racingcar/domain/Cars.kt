package racingcar.domain

class Cars(count: PositiveNum) {
    private val cars: MutableList<Car>

    init {
        cars = ArrayList()
        createCars(count)
    }

    private fun createCars(count: PositiveNum): List<Car> {
        for (i: Int in 1..count.number) {
            cars.add(Car())
        }
        return cars
    }

    fun count(): Int {
        return cars.size
    }

    fun getCarList(): List<Car> {
        return cars
    }
}
