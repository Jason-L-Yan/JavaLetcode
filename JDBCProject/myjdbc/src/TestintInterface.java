interface TestintInterface {
    double PI = 3.1415926;
    int sum();
    default int test(){
        System.out.println("บวบว");
        return 0;
    };

    static void getInfo(int size, boolean isEmpty) {
        System.out.println("nihoa");
    }
}
