package Day_47_Construction;

public class CW_47_1 {
    public static void main(String[] args) {

        SDET sdet = new SDET("Talsha", 34, "M", "Microsoft", 90000, true);
        SDET sdet1 = new SDET("Eugen", 57, "M", "EuroTech", 0, false);
        SDET sdet2 = new SDET("Oleg", 25, "M", "EuroTech", 0, true);

        sdet.increaseSalary(100);
        sdet.companyChange("Google");

        System.out.println(sdet);
        System.out.println(sdet1);
        System.out.println(sdet2);

    }
    public static class SDET{

        public String name;

        public int age;
        public String gender;;
        public String company;
        public int salary;
        public boolean isSuccessful;


        public SDET(String name, int age, String gender, String company, int salary, boolean isSuccessful) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.company = company;
            this.salary = salary;
            this.isSuccessful = isSuccessful;
        }

        public void companyChange(String newCompany) {
            this.company = newCompany;
        }

        public void increaseSalary(int raiseAmount) {
            this.salary = (salary + raiseAmount);
        }

        @Override
        public String toString() {
            return "SDET{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    ", company='" + company + '\'' +
                    ", salary=" + salary +
                    ", isSuccessful=" + isSuccessful +
                    '}';
        }
    }
}
