public class HelloWorld {
    private int id;
    private String name;
    private String brith;

    public HelloWorld() {
    }

    public HelloWorld(int id, String name, String brith) {
        this.id = id;
        this.name = name;
        this.brith = brith;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrith() {
        return brith;
    }

    public void setBrith(String brith) {
        this.brith = brith;
    }

    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        int i = h.sumNumber(10, 2);
        System.out.println(i);
        System.out.println("你好");
    }

    public int sumNumber(int a, int b){
        return a + b;
    }
}
