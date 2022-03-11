package ss10_list.manager_student.util;

import ss10_list.manager_student.models.Student;

import java.util.Comparator;

public class CompabyId implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getId()-o2.getId()==0){
            return o1.getName().compareTo(o2.getName());
        }
        return o1.getId()-o2.getId();
    }
}
