public class JVMEncoding {
    /**
    * @param args
    */
    public static void main(String[] args) {

        // System.out.println(System.setProperty("file.encoding","GBK"));
        System.out.println("file.encoding:" + System.getProperty("file.encoding"));
        // System.out.println("ÄãºÃ£¬ÊÀ½ç£¡");
        System.out.println("sun.jnu.encoding:"+System.getProperty("sun.jnu.encoding"));
        // System.out.println("JVM file encoding: " + System.getProperty("file.encoding"));
        System.out.println("hello,world!");
    }
    }
