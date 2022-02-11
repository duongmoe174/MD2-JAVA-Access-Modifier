public class TestStaticMethod {
    public static void main(String[] args) {
        Students.change();

        Students s1 = new Students(1, "Duong");
        Students s2 = new Students(2, "Tuan");
        Students s3 = new Students(3, "Duc");

        s1.display();
        s2.display();
        s3.display();
    }
}
