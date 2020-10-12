只要包对应就行了, 没必要 和路径一一对应

虽然对应是推荐做法



回溯解决八皇后问题

```java
    int[] result = new int[8];

    public void cal8queens(int row) {
        if (row == 8) {
            printQueens(result);
            return;
        }

        for (int column = 0; column < 8; column++) {
            if (isOk(row, column)) {
                result[row] = column;
                cal8queens(row + 1);
            }
        }
    }

    private boolean isOk(int row, int column) {
        int leftup = column - 1, rithtup = column + 1;
        for (int i = row - 1; i <= 0; i--) {
            if (result[i] == column) {
                return false;
            }
            if (leftup >= 0) {
                if (result[i] == leftup) {
                    return false;
                }
            }
            if (rithtup < 8) {
                if (result[i] == rithtup) {
                    return false;
                }
                leftup--;
                rithtup++;
            }

        }
        return true;
    }

    private void printQueens(int[] result) {
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                if (result[row] == column) {
                    System.out.println("Q ");
                } else {
                    System.out.println("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
```

