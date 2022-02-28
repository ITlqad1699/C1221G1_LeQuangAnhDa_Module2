package ss10_dsa_list.exercises;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
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

        public static void main(String[] args) {
            Student a = new Student(1, "Đà");
            Student b = new Student(2, "thông");
            Student c = new Student(3, "giảng");
            Student d = new Student(4, "tín");
            Student e = new Student(5, "uyên");
            Student f = new Student(6, "thảo");
            MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
            MyArrayList<Student> newStudentMyArrayList = new MyArrayList<>();
            studentMyArrayList.add(a);
            studentMyArrayList.add(b);
            studentMyArrayList.add(c);
            studentMyArrayList.add(d);
            studentMyArrayList.add(e);
            studentMyArrayList.add(f,2);
            for (int i =0; i < studentMyArrayList.size();i++){
                Student student = (Student) studentMyArrayList.elements[i];
                System.out.println(student.getId());
                System.out.println(student.getName());
            }
            System.out.println(studentMyArrayList.get(2).getName());
            System.out.println(studentMyArrayList.indexOf(c));
            System.out.println(studentMyArrayList.contains(b));
            newStudentMyArrayList = studentMyArrayList.clone();
            newStudentMyArrayList.remove(1);
            for (int i =0; i < newStudentMyArrayList.size();i++){
                System.out.println(studentMyArrayList.get(i).getName());
            }
        }
    }
}
