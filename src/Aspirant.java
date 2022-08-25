class Aspirant extends Student{
    String academicWork;

    Aspirant(String firstName, String lastName, String group, double averageMark, String academicWork) {
        super(firstName, lastName, group, averageMark);
        this.academicWork = academicWork;
    }

    @Override
    float getScholarship(){
        if(averageMark == 5) return 200;
        else return 180;
    }
}
