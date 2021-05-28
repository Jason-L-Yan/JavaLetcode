public class Student2 {

    private String name;

    public Student2() {
    }

    public Student2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        System.out.println(" name.hashCode():" + name);
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        // System.out.println("getClass()类名：" + getClass());
        // System.out.println("obj.getClass()类名：" + obj.getClass());
        if (getClass() != obj.getClass())  // 相当于 instanceof
            return false;
        Student2 other = (Student2) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    // 重写equals方法，如果学生名字一样，表示同一个学生。
    // @Override
    // public boolean equals(Object obj) {
    //     if (obj == null || !(obj instanceof Student2)) {
    //         return false;
    //     }

    //     if (obj == this) {
    //         return true;
    //     }

    //     Student2 s = (Student2) obj;
    //     return s.name.equals(this.name);
    // }

}
