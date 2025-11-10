

class Students  {

        int rollNo;
        String name;
        int marks;

    } 

public class ArrayOfObjects {
    public static void main(String[] args) {

        Students s1 = new Students();
        s1.rollNo = 1;
        s1.name = "abhi";
        s1.marks = 99;

        Students s2 = new Students();
        s2.rollNo = 2;
        s2.name = "abhishek";
        s2.marks = 91;

        Students s3 = new Students();
        s3.rollNo = 3;
        s3.name = "harsh";
        s3.marks = 90;

        Students student[] = new Students[3];

        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(int i=0; i<student.length; i++){
            System.out.println(student[i].rollNo + " : " + student[i].name + " : " + student[i].marks);
        }
    }
}
