package homework_nr_7part3;

public class Date {
    int day;
    int month;
    int year;


    public void setData(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Incorect day");
        }
    }


        public void setMonth (int month) {
            if (month > 0 && month <= 12) {

                this.month = (month);
            } else {
                System.out.println("Incorect month");
            }
        }


            public void setYear ( int year){
                if (year > 0) {

                    this.year = year;
                } else {
                    System.out.println("Incorect year");
                }
            }
            public void displayData() {
                System.out.println("Day: " + day + " " + "Month: " + month + " " + "Year: " + year);
            }
        }

