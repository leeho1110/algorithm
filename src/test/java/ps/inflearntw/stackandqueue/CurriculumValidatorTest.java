package ps.inflearntw.stackandqueue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CurriculumValidatorTest {

    @Test
    public void test(){
        // given
        CurriculumValidator sut = CurriculumValidator.createMandatorySubjectsFrom("CBA");

        // when
        String result = sut.validate("CBDAGE");

        // then
        assertThat(result).isEqualTo("YES");
    }

    @Test
    public void test2(){
        // given
        CurriculumValidator sut = CurriculumValidator.createMandatorySubjectsFrom("AKDEF");

        // when
        String result = sut.validate("AYKGDHEJ");

        // then
        assertThat(result).isEqualTo("NO");
    }
}