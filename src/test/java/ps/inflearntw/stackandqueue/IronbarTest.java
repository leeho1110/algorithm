package ps.inflearntw.stackandqueue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IronbarTest {

    /*
        여러 개의 쇠막대기를 레이저로 절단하려고 한다. 효율적인 작업을 위해서 쇠막대기를 아래에서 위로 겹쳐 놓고,
        레이저를 위에서 수직으로 발사하여 쇠막대기들을 자른다. 쇠막대기와 레이저의 배치는 다음 조건을 만족한다.
        • 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓일 수 있다. - 쇠막대기를 다른 쇠막대기 위에 놓는 경우 완전히 포함되도록 놓되,
        끝점은 겹치지 않도록 놓는다.
        • 각 쇠막대기를 자르는 레이저는 적어도 하나 존재한다.
        • 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않는다.
        아래 그림은 위 조건을 만족하는 예를 보여준다. 수평으로 그려진 굵은 실선은 쇠막대기이고, 점은 레이저의 위치, 수직으로 그려진 점선 화살표는 레이저의 발사 방향이다.

        이러한 레이저와 쇠막대기의 배치는 다음과 같이 괄호를 이용하여 왼쪽부터 순서대로 표현할 수 있다.
        1. 레이저는 여는 괄호와 닫는 괄호의 인접한 쌍 ‘( ) ’ 으로 표현된다. 또한, 모든 ‘( ) ’는 반드시 레이저를 표현한다.
        2. 쇠막대기의 왼쪽 끝은 여는 괄호 ‘ ( ’ 로, 오른쪽 끝은 닫힌 괄호 ‘) ’ 로 표현된다.

        TODO
            #1. '('를 만나면 항상 stack에 push
            #2. ')'를 만나면 레이저인지 막대기의 종단점인지 확인
                #2-1. 바로 앞 인덱스가 '('라면 레이저
                    #2-1-1. 레이저라면 pop(), 사이즈를 answer에 추가
                #2-2. 아니라면 종단점
                    #2-3. 종단점 pop(), 1을 answer에 추가
     */
    @Test
    public void test(){
        // given
        Ironbar sut = new Ironbar("()(((()())(())()))(())");

        // when
        Integer result = sut.getSlicedBarCount();

        // then
        assertThat(result).isEqualTo(17);
    }

    @Test
    public void test2(){
        // given
        Ironbar sut = new Ironbar("(((()(()()))(())()))(()())");

        // when
        Integer result = sut.getSlicedBarCount();

        // then
        assertThat(result).isEqualTo(24);
    }

}