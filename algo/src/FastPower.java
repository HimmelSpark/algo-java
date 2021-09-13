public class FastPower {

    /**
     * Возвращает a в степени b
     * @param base int > 0
     * @param degree int >= 0
     * @return base ^ degree
     */
    public static int fastPower(int base, int degree) {
        assert base > 0 && degree >= 0;
        int result = base;
        int currDegree = 1;
        while (degree / currDegree > 1) {
            result *= result;
            currDegree *= 2;
        }
        for (int i = 0; i < degree - currDegree; i++) {
            result *= base;
        }
        return result;
    }
}
