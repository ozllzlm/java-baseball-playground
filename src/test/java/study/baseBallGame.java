package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class baseBallGame {
    int[] targetArr;
    int[] ballNumArr;

    @BeforeEach
    void setUp() {

    }


    // 숫자를 배열에 넣어서 타겟에 있는 숫자와 같은 위치에 같은 숫자가 있는지 확인
    @Test
    void 게임() {
        int target = 425;
        int ballNum = 225; // 1스트라이트
        int sNum = 0;
        int bNum = 0;
        int nNum = 0;
        
        String temp1 = Integer.toString(target);
        targetArr = new int[temp1.length()];
        for (int i = 0; i < targetArr.length; i++) {
            targetArr[i] = temp1.charAt(i) - '0';
            System.out.println("+++" + targetArr[i]);
        }

        String temp2 = Integer.toString(ballNum);
        int[] ballNumArr = new int[temp2.length()];
        for (int i = 0; i < ballNumArr.length; i++) {
            ballNumArr[i] = temp2.charAt(i) - '0';

            System.out.println("___" + ballNumArr[i]);
        }
        for (int i = 0; i < 3; i++) {
            if (targetArr[i] == ballNumArr[i]) {
                sNum += 1;
            }
        }
        for (int i = 0; i < targetArr.length; i++) {
            for (int j = 0; j < ballNumArr.length; j++) {
                if (targetArr[i] == ballNumArr[j]) {
                    if (i != j) {
                        bNum += 1;
                    }
                }
            }
        }
    // 아웃이 이상함,,,
        for (int i = 0; i < targetArr.length; i++) {
            for (int j = 0; j < ballNumArr.length; j++) {
                if (targetArr[i] != ballNumArr[j]) {
                    if (i != j) {
                        nNum = i;
                    }
                }
            }
        }

        System.out.println(sNum + " 스트라이트 " + bNum + " 볼 " + nNum + " 아웃");
    }

  }