import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun `이름_붙인_인자`() {
        val person = Person(name = "황상욱", age = 99, nickname = "욱")
        assertThat(person.name).isEqualTo("황상욱")
        assertThat(person.age).isEqualTo(99)
        assertThat(person.nickname).isEqualTo("욱")
    }

    @Test
    fun `널타입 인자`() {
        val person = Person("황상욱", 99, null)
        assertThat(person.name).isEqualTo("황상욱")
        assertThat(person.age).isEqualTo(99)
        assertThat(person.nickname).isEqualTo(null)
    }

    @Test
    fun `기본 인자`() {
        val person = Person("황상욱")
        assertThat(person.name).isEqualTo("황상욱")
        assertThat(person.age).isEqualTo(null)
        assertThat(person.nickname).isEqualTo("황상욱")
    }

    @Test
    fun `데이터 클래스`() {
        val person = Person("황상욱", 99, "상욱")
        val otherPerson = Person("황상욱", 99, "상욱")
        assertThat(person).isEqualTo(otherPerson)
    }
}
