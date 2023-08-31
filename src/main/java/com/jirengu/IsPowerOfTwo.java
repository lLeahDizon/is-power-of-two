package com.jirengu;

public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int num) {
        // 补全第9行代码，使用位运算符判断输入的整数是否是2的幂
        // 提示：
        // 1. 想想如果一个整数是2的幂，它的二进制表示有什么特点
        // 2. 利用与运算
        return num != 0 && (num & (num - 1)) == 0;
    }
}
