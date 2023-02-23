package com.ll.level0.p120807;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class p_angleTest {
    @Test
    @DisplayName("배열 1입력")
    void t1(){
        assertThat(new Solution().solution(new int[]{1,2,3,4,5})).isEqualTo(new int[]{2,3});
    }

}

