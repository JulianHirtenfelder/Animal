import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private Animal cat;

    @BeforeEach
    void SetUp()
    {
        this.cat = new Animal("Nico", 5, "Cat", "Miauu");
    }

    @Test
    @DisplayName("Test Konstruktor")
    void TestConstructor()
    {
        String expedtedName = "Nico";
        int expectedAge = 5;

        Assertions.assertEquals(expedtedName, cat.getName());
        Assertions.assertEquals(expectedAge, cat.getAge());
    }

    @Test
    @DisplayName("Test Funktion getNameAndAge")
    void TestGetNameAndAge()
    {
        String expected = "Name: Nico, Age: 5";
        Assertions.assertEquals(expected, cat.getNameAndAge());
    }

    @Test
    void TestIsBabyAnimal()
    {
        cat.setAge(-1);
        Assertions.assertTrue(cat.isBabyAnimal());
    }

    @Test
    void TestAgeCategories()
    {
        Assertions.assertEquals("old animal", cat.ageCategory());

        cat.setAge(3);
        Assertions.assertEquals("young animal", cat.ageCategory());

        cat.setAge(0);
        Assertions.assertEquals("baby animal", cat.ageCategory());
    }



}