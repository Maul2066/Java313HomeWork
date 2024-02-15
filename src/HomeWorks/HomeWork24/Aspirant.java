package HomeWorks.HomeWork24;
public class Aspirant extends Student {
    String work_TMP;
    
    public Aspirant(String NAME, String SURNAME, String GROUP, String WORK_TMP,int GRADE) {
        super(NAME, SURNAME, GROUP, GRADE);
        this.work_TMP = WORK_TMP;
    }

    public String getWork_TMP() {
        return work_TMP;
    }

    public void setWork_TMP(String work_TMP) {
        this.work_TMP = work_TMP;
    }

    void Student_information () {
        if (grade == 5){
            sum = 2000;
        } else {
            sum = 1800;
        }
        System.out.println(name + " " + surname + ", группа " + group + ", тема работы: " + getWork_TMP() + ", сумма стипендии: " + sum);
    }
}
