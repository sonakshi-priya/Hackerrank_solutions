//ArrayDs.java

static int[] reverseArray(int[] a) {
        int left = 0, righyt = (int) a.length - 1;
        while (left < righyt) {
           a[left] = a[left]+a[righyt];
           a[righyt] = a[left]-a[righyt];
           a[left] = a[left]-a[righyt];
           left++; righyt--;
        }
        return a;
    }
