public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Rodrigo Arnold", "MAT101", "0555 555 55 55");
        Teacher t2 = new Teacher("Parker Wong", "PHY101", "0555 555 55 54");
        Teacher t3 = new Teacher("Frederick Patel", "ENG101", "0555 555 55 53");

        Course math = new Course ("Calculus-I", "101", "MAT101");
        math.addTeacher(t1);

        Course physics = new Course ("Physics-I", "102", "PHY101");
        physics.addTeacher(t2);

        Course engineering = new Course ("Engineering-I", "103", "ENG101");
        engineering.addTeacher(t3);

        Student s1 = new Student("Elaine Perez", "123", "346563423", math, physics, engineering);
        s1.addBulkExamNote (100, 80, 50);
        s1.addBulkQuizNote (90, 70, 80);
        s1.NoteAverage(100, 80, 50, 90, 70, 80);
        s1.isPass = s1.isPass();

        Student s2 = new Student("Charlotte Gray", "124", "434253534", math, physics, engineering);
        s2.addBulkExamNote(50,30,70);
        s2.addBulkQuizNote(70, 50, 80);
        s2.NoteAverage(50,30,70,70, 50, 80);
        s2.isPass();

        Student s3 = new Student("Kristi Owens", "125", "435633432", math, physics, engineering);
        s3.addBulkExamNote(67,66,34);
        s3.addBulkQuizNote(44, 55, 80);
        s3.NoteAverage(56,30,70,67, 66, 34);
        s3.isPass();

    }
}