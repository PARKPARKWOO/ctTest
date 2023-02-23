package com.ll.level0.p120807;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class p_angleTest {
    @Test
    @DisplayName("70도 입력")
    void t1(){
        assertThat(new Solution().solution(70)).isEqualTo(1);
    }

    @Test
    @DisplayName(" 91 도 입력")
    void t2(){
        assertThat(new Solution().solution(91)).isEqualTo(3);
    }

    @Test
    @DisplayName("180도 입력")
    void t3(){
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }
}

