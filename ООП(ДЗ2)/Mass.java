package com.company;


class Back {
    int[] valuess;
    int[] scaless;
    int[] rang;
    int sum = 0;

    public Back(int[] values, int[] scales) {

        valuess = values;
        rang = new int[valuess.length];
        scaless = scales;

        sum = 0;

        for (int i = 0; i < scaless.length; i++)
            sum += scaless[i];

        int s = 0;
        for (int i = 0; i < rang.length; i++) {
            rang[i] = s;
            s += scaless[i];
        }
    }


    public int Number() {
        int random = (int) (Math.random() * (sum - 1));
        int qw = 0;

        for (int i = 0; i < rang.length; i++) {
            if (rang[i] > random)
                break;
            qw = i;
        }

        return valuess[qw];
    }
}
