package com.ll.level0.p120807;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class p_angleTest {
    @Test
    @DisplayName("1,2,3 입력")
    void t1(){
        assertThat(new Solution().solution(new int[]{1,2,3})).isEqualTo(2);
    }

}

